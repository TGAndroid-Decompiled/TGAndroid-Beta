package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
public final class a extends u {
    public static final C0000a f13585b = new C0000a();
    public final SimpleDateFormat f13586a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, kb.a aVar) {
            if (aVar.f14888a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object read(lb.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f13586a.getTimeZone();
            try {
                date = new Date(this.f13586a.parse(v).getTime());
                this.f13586a.setTimeZone(timeZone);
            } catch (ParseException e7) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e7);
            }
        }
        return date;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f13586a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.f13586a = new SimpleDateFormat("MMM d, yyyy");
    }
}
