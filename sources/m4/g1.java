package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class g1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14816f;
    public static final String f14817g;
    public static final String h;
    public final int f14818a;
    public final String f14819b;
    public final Bundle f14820c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7870a;
        f14816f = Integer.toString(0, 36);
        f14817g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public g1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14818a = i10;
        this.f14819b = "";
        this.f14820c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f14818a != g1Var.f14818a || !TextUtils.equals(this.f14819b, g1Var.f14819b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14819b, Integer.valueOf(this.f14818a));
    }

    public g1(String str, Bundle bundle) {
        this.f14818a = 0;
        this.f14819b = str;
        bundle.getClass();
        this.f14820c = new Bundle(bundle);
    }
}
