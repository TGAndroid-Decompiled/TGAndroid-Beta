package ib;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
public final class h extends fb.u {
    public static final e f13920c = new e();
    public final g f13921a;
    public final ArrayList f13922b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f13922b = arrayList;
        Objects.requireNonNull(gVar);
        this.f13921a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (hb.h.f12739a >= 9) {
            arrayList.add(new SimpleDateFormat(a1.g.D("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(nb.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.f13922b) {
            try {
                ArrayList arrayList = this.f13922b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        dateFormat = (DateFormat) obj;
                        timeZone = dateFormat.getTimeZone();
                        b10 = dateFormat.parse(v);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b10 = jb.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as Date; at path ");
                            v10.append(aVar.j());
                            throw new RuntimeException(v10.toString(), e);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f13921a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f13922b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f13922b.get(0);
        synchronized (this.f13922b) {
            format = dateFormat.format(date);
        }
        bVar.r(format);
    }
}
