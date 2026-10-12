package kb;

import hb.g;
import java.sql.Timestamp;
import java.util.Date;
public final class e extends g {
    public final int f14201b;

    public e(Class cls, int i10) {
        super(cls);
        this.f14201b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f14201b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
