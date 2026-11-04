package o4;

import b8.pd;
import java.util.List;
public final class w {
    public final g9.i0 f20884a;
    public final int f20885b;
    public final long f20886c;

    public w(List list, int i3, long j10) {
        this.f20884a = g9.i0.q(list);
        this.f20885b = i3;
        this.f20886c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f20884a.equals(wVar.f20884a) && this.f20885b == wVar.f20885b && this.f20886c == wVar.f20886c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return pd.b(this.f20886c) + (((this.f20884a.hashCode() * 31) + this.f20885b) * 31);
    }
}
