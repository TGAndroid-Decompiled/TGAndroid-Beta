package o4;

import android.os.Bundle;
import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
public final class n1 {
    public static final g9.s1 d = g9.i0.u(40010);
    public static final g9.s1 f20760e;
    public static final String f20761f;
    public static final String f20762g;
    public static final String h;
    public final int f20763a;
    public final String f20764b;
    public final Bundle f20765c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        g9.o.e(7, objArr);
        f20760e = g9.i0.o(7, objArr);
        String str = g2.n0.f11873a;
        f20761f = Integer.toString(0, 36);
        f20762g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public n1(int i3) {
        zb.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i3 != 0);
        this.f20763a = i3;
        this.f20764b = "";
        this.f20765c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f20761f, this.f20763a);
        bundle.putString(f20762g, this.f20764b);
        bundle.putBundle(h, this.f20765c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f20763a != n1Var.f20763a || !TextUtils.equals(this.f20764b, n1Var.f20764b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f20764b, Integer.valueOf(this.f20763a));
    }

    public n1(String str, Bundle bundle) {
        this.f20763a = 0;
        str.getClass();
        this.f20764b = str;
        bundle.getClass();
        this.f20765c = new Bundle(bundle);
    }
}
