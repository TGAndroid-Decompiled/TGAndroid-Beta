package m4;

import a8.yb;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class p1 {
    public static final f9.s1 d = f9.i0.y(40010);
    public static final f9.s1 e;
    public static final String f18196f;
    public static final String f18197g;
    public static final String h;
    public final int f18198a;
    public final String f18199b;
    public final Bundle f18200c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        f9.o.d(7, objArr);
        e = f9.i0.s(7, objArr);
        String str = e2.n0.f9691a;
        f18196f = Integer.toString(0, 36);
        f18197g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public p1(int i10) {
        yb.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f18198a = i10;
        this.f18199b = "";
        this.f18200c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f18196f, this.f18198a);
        bundle.putString(f18197g, this.f18199b);
        bundle.putBundle(h, this.f18200c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f18198a != p1Var.f18198a || !TextUtils.equals(this.f18199b, p1Var.f18199b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f18199b, Integer.valueOf(this.f18198a));
    }

    public p1(String str, Bundle bundle) {
        this.f18198a = 0;
        str.getClass();
        this.f18199b = str;
        bundle.getClass();
        this.f18200c = new Bundle(bundle);
    }
}
