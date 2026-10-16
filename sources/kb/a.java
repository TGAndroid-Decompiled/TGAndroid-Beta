package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
public final class a extends u {
    public static final C0000a f14197b = new C0000a();
    public final SimpleDateFormat f14198a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, lb.a aVar) {
            if (aVar.f14653a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object read(mb.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f14198a.getTimeZone();
            try {
                date = new Date(this.f14198a.parse(v).getTime());
                this.f14198a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e);
            }
        }
        return date;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f14198a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.f14198a = new SimpleDateFormat("MMM d, yyyy");
    }
}
