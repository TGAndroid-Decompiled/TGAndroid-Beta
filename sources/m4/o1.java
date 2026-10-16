package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f15296f;
    public static final String f15297g;
    public static final String h;
    public final int f15298a;
    public final String f15299b;
    public final Bundle f15300c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8375a;
        f15296f = Integer.toString(0, 36);
        f15297g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f15298a = i10;
        this.f15299b = "";
        this.f15300c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f15296f, this.f15298a);
        bundle.putString(f15297g, this.f15299b);
        bundle.putBundle(h, this.f15300c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f15298a != o1Var.f15298a || !TextUtils.equals(this.f15299b, o1Var.f15299b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f15299b, Integer.valueOf(this.f15298a));
    }

    public o1(String str, Bundle bundle) {
        this.f15298a = 0;
        str.getClass();
        this.f15299b = str;
        bundle.getClass();
        this.f15300c = new Bundle(bundle);
    }
}
