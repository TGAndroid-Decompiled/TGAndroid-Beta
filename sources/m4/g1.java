package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class g1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14815f;
    public static final String f14816g;
    public static final String h;
    public final int f14817a;
    public final String f14818b;
    public final Bundle f14819c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7870a;
        f14815f = Integer.toString(0, 36);
        f14816g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public g1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14817a = i10;
        this.f14818b = "";
        this.f14819c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f14817a != g1Var.f14817a || !TextUtils.equals(this.f14818b, g1Var.f14818b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14818b, Integer.valueOf(this.f14817a));
    }

    public g1(String str, Bundle bundle) {
        this.f14817a = 0;
        this.f14818b = str;
        bundle.getClass();
        this.f14819c = new Bundle(bundle);
    }
}
