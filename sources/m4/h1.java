package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class h1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16110e;
    public static final String f16111f;
    public static final String f16112g;
    public static final String h;
    public final int f16113a;
    public final String f16114b;
    public final Bundle f16115c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16110e = e9.i0.t(7, objArr);
        String str = e2.d0.f8532a;
        f16111f = Integer.toString(0, 36);
        f16112g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public h1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16113a = i10;
        this.f16114b = "";
        this.f16115c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f16113a != h1Var.f16113a || !TextUtils.equals(this.f16114b, h1Var.f16114b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16114b, Integer.valueOf(this.f16113a));
    }

    public h1(String str, Bundle bundle) {
        this.f16113a = 0;
        this.f16114b = str;
        bundle.getClass();
        this.f16115c = new Bundle(bundle);
    }
}
