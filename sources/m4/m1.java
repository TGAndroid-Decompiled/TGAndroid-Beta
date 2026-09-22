package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14613f;
    public static final String f14614g;
    public static final String h;
    public final int f14615a;
    public final String f14616b;
    public final Bundle f14617c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7885a;
        f14613f = Integer.toString(0, 36);
        f14614g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public m1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14615a = i10;
        this.f14616b = "";
        this.f14617c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f14615a != m1Var.f14615a || !TextUtils.equals(this.f14616b, m1Var.f14616b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14616b, Integer.valueOf(this.f14615a));
    }

    public m1(String str, Bundle bundle) {
        this.f14615a = 0;
        this.f14616b = str;
        bundle.getClass();
        this.f14617c = new Bundle(bundle);
    }
}
