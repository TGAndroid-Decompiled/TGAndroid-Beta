package j3;

import android.net.Uri;
public final class r0 implements g {
    public static final String f9398b;
    public static final q0 f9399c;
    public final Uri f9400a;

    static {
        int i10 = h5.d0.f7237a;
        f9398b = Integer.toString(0, 36);
        f9399c = new q0(0);
    }

    public r0(ja.c cVar) {
        this.f9400a = (Uri) cVar.f9988a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0) || !this.f9400a.equals(((r0) obj).f9400a)) {
            return false;
        }
        int i10 = h5.d0.f7237a;
        return true;
    }

    public final int hashCode() {
        return this.f9400a.hashCode() * 31;
    }
}
