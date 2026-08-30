package j3;

import android.net.Uri;
public final class r0 implements g {
    public static final String f8807b;
    public static final q0 f8808c;
    public final Uri f8809a;

    static {
        int i10 = h5.d0.f6937a;
        f8807b = Integer.toString(0, 36);
        f8808c = new q0(0);
    }

    public r0(a3.c cVar) {
        this.f8809a = (Uri) cVar.f46b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0) || !this.f8809a.equals(((r0) obj).f8809a)) {
            return false;
        }
        int i10 = h5.d0.f6937a;
        return true;
    }

    public final int hashCode() {
        return this.f8809a.hashCode() * 31;
    }
}
