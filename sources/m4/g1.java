package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class g1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16168e;
    public static final String f16169f;
    public static final String f16170g;
    public static final String h;
    public final int f16171a;
    public final String f16172b;
    public final Bundle f16173c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16168e = e9.i0.t(7, objArr);
        String str = e2.d0.f8537a;
        f16169f = Integer.toString(0, 36);
        f16170g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public g1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16171a = i10;
        this.f16172b = "";
        this.f16173c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f16171a != g1Var.f16171a || !TextUtils.equals(this.f16172b, g1Var.f16172b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16172b, Integer.valueOf(this.f16171a));
    }

    public g1(String str, Bundle bundle) {
        this.f16171a = 0;
        this.f16172b = str;
        bundle.getClass();
        this.f16173c = new Bundle(bundle);
    }
}
