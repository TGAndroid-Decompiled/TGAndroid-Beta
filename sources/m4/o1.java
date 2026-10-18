package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f16655f;
    public static final String f16656g;
    public static final String h;
    public final int f16657a;
    public final String f16658b;
    public final Bundle f16659c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8255a;
        f16655f = Integer.toString(0, 36);
        f16656g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16657a = i10;
        this.f16658b = "";
        this.f16659c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16655f, this.f16657a);
        bundle.putString(f16656g, this.f16658b);
        bundle.putBundle(h, this.f16659c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f16657a != o1Var.f16657a || !TextUtils.equals(this.f16658b, o1Var.f16658b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16658b, Integer.valueOf(this.f16657a));
    }

    public o1(String str, Bundle bundle) {
        this.f16657a = 0;
        str.getClass();
        this.f16658b = str;
        bundle.getClass();
        this.f16659c = new Bundle(bundle);
    }
}
