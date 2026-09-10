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
    public static final a f11836b = new a();
    public final SimpleDateFormat f11837a;

    public class a implements v {
        @Override
        public final u create(g gVar, kb.a aVar) {
            if (aVar.f12419a == Time.class) {
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
            TimeZone timeZone = this.f11837a.getTimeZone();
            try {
                time = new Time(this.f11837a.parse(v).getTime());
                this.f11837a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e);
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
            format = this.f11837a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f11837a = new SimpleDateFormat("hh:mm:ss a");
    }
}
