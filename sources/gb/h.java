package gb;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
public final class h extends db.u {
    public static final e f10541c = new e();
    public final g f10542a;
    public final ArrayList f10543b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f10543b = arrayList;
        Objects.requireNonNull(gVar);
        this.f10542a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (fb.g.f9458a >= 9) {
            arrayList.add(new SimpleDateFormat(a4.a.C("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(lb.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.f10543b) {
            try {
                ArrayList arrayList = this.f10543b;
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
                            b10 = hb.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e7) {
                            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as Date; at path ");
                            v9.append(aVar.j());
                            throw new RuntimeException(v9.toString(), e7);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f10542a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f10543b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f10543b.get(0);
        synchronized (this.f10543b) {
            format = dateFormat.format(date);
        }
        bVar.r(format);
    }
}
