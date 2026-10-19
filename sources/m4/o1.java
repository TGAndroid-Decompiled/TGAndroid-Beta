package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f16654f;
    public static final String f16655g;
    public static final String h;
    public final int f16656a;
    public final String f16657b;
    public final Bundle f16658c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8252a;
        f16654f = Integer.toString(0, 36);
        f16655g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16656a = i10;
        this.f16657b = "";
        this.f16658c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16654f, this.f16656a);
        bundle.putString(f16655g, this.f16657b);
        bundle.putBundle(h, this.f16658c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f16656a != o1Var.f16656a || !TextUtils.equals(this.f16657b, o1Var.f16657b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16657b, Integer.valueOf(this.f16656a));
    }

    public o1(String str, Bundle bundle) {
        this.f16656a = 0;
        str.getClass();
        this.f16657b = str;
        bundle.getClass();
        this.f16658c = new Bundle(bundle);
    }
}
