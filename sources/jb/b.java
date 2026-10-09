package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public final class b extends u {
    public static final a f14098b = new a();
    public final SimpleDateFormat f14099a;

    public class a implements v {
        @Override
        public final u create(g gVar, kb.a aVar) {
            if (aVar.f14779a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(lb.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f14099a.getTimeZone();
            try {
                time = new Time(this.f14099a.parse(v).getTime());
                this.f14099a.setTimeZone(timeZone);
            } catch (ParseException e7) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e7);
            }
        }
        return time;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f14099a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f14099a = new SimpleDateFormat("hh:mm:ss a");
    }
}
