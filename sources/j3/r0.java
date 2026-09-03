package j3;

import android.net.Uri;
public final class r0 implements g {
    public static final String f8789b;
    public static final q0 f8790c;
    public final Uri f8791a;

    static {
        int i10 = h5.d0.f6924a;
        f8789b = Integer.toString(0, 36);
        f8790c = new q0(0);
    }

    public r0(bb.b bVar) {
        this.f8791a = (Uri) bVar.f1772b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0) || !this.f8791a.equals(((r0) obj).f8791a)) {
            return false;
        }
        int i10 = h5.d0.f6924a;
        return true;
    }

    public final int hashCode() {
        return this.f8791a.hashCode() * 31;
    }
}
