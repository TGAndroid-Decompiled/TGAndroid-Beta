package oa;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
public final class h extends la.u {
    public static final e f19122c = new e();
    public final g f19123a;
    public final ArrayList f19124b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f19124b = arrayList;
        Objects.requireNonNull(gVar);
        this.f19123a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (na.h.f18538a >= 9) {
            arrayList.add(new SimpleDateFormat(aa.d.z("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(ta.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.f19124b) {
            try {
                ArrayList arrayList = this.f19124b;
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        dateFormat = (DateFormat) obj;
                        timeZone = dateFormat.getTimeZone();
                        b10 = dateFormat.parse(v);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b10 = pa.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as Date; at path ");
                            t10.append(aVar.j());
                            throw new RuntimeException(t10.toString(), e10);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f19123a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f19124b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f19124b.get(0);
        synchronized (this.f19124b) {
            format = dateFormat.format(date);
        }
        cVar.r(format);
    }
}
