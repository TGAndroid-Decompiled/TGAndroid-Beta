package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.t6;
public final class p1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f12894f;
    public static final String f12895g;
    public static final String h;
    public final int f12896a;
    public final String f12897b;
    public final Bundle f12898c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.l0.f6165a;
        f12894f = Integer.toString(0, 36);
        f12895g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public p1(int i10) {
        t6.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f12896a = i10;
        this.f12897b = "";
        this.f12898c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f12894f, this.f12896a);
        bundle.putString(f12895g, this.f12897b);
        bundle.putBundle(h, this.f12898c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (this.f12896a != p1Var.f12896a || !TextUtils.equals(this.f12897b, p1Var.f12897b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f12897b, Integer.valueOf(this.f12896a));
    }

    public p1(String str, Bundle bundle) {
        this.f12896a = 0;
        str.getClass();
        this.f12897b = str;
        bundle.getClass();
        this.f12898c = new Bundle(bundle);
    }
}
