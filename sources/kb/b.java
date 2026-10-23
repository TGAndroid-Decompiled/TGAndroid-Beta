package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public final class b extends u {
    public static final a f15046b = new a();
    public final SimpleDateFormat f15047a;

    public class a implements v {
        @Override
        public final u create(g gVar, lb.a aVar) {
            if (aVar.f16057a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(mb.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f15047a.getTimeZone();
            try {
                time = new Time(this.f15047a.parse(v).getTime());
                this.f15047a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e);
            }
        }
        return time;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f15047a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f15047a = new SimpleDateFormat("hh:mm:ss a");
    }
}
