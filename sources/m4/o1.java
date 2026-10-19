package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f16656f;
    public static final String f16657g;
    public static final String h;
    public final int f16658a;
    public final String f16659b;
    public final Bundle f16660c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8254a;
        f16656f = Integer.toString(0, 36);
        f16657g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16658a = i10;
        this.f16659b = "";
        this.f16660c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16656f, this.f16658a);
        bundle.putString(f16657g, this.f16659b);
        bundle.putBundle(h, this.f16660c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f16658a != o1Var.f16658a || !TextUtils.equals(this.f16659b, o1Var.f16659b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16659b, Integer.valueOf(this.f16658a));
    }

    public o1(String str, Bundle bundle) {
        this.f16658a = 0;
        str.getClass();
        this.f16659b = str;
        bundle.getClass();
        this.f16660c = new Bundle(bundle);
    }
}
