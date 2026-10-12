package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class p1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f15566f;
    public static final String f15567g;
    public static final String h;
    public final int f15568a;
    public final String f15569b;
    public final Bundle f15570c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8372a;
        f15566f = Integer.toString(0, 36);
        f15567g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public p1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f15568a = i10;
        this.f15569b = "";
        this.f15570c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f15566f, this.f15568a);
        bundle.putString(f15567g, this.f15569b);
        bundle.putBundle(h, this.f15570c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f15568a != p1Var.f15568a || !TextUtils.equals(this.f15569b, p1Var.f15569b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f15569b, Integer.valueOf(this.f15568a));
    }

    public p1(String str, Bundle bundle) {
        this.f15568a = 0;
        str.getClass();
        this.f15569b = str;
        bundle.getClass();
        this.f15570c = new Bundle(bundle);
    }
}
