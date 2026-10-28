package lb;

import fb.g;
import fb.u;
import fb.v;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public final class b extends u {
    public static final a f16958b = new a();
    public final SimpleDateFormat f16959a;

    public class a implements v {
        @Override
        public final u create(g gVar, mb.a aVar) {
            if (aVar.f18406a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(nb.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f16959a.getTimeZone();
            try {
                time = new Time(this.f16959a.parse(v).getTime());
                this.f16959a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e);
            }
        }
        return time;
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f16959a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f16959a = new SimpleDateFormat("hh:mm:ss a");
    }
}
