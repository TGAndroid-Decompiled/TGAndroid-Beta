package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class h1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14566f;
    public static final String f14567g;
    public static final String h;
    public final int f14568a;
    public final String f14569b;
    public final Bundle f14570c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7871a;
        f14566f = Integer.toString(0, 36);
        f14567g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public h1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14568a = i10;
        this.f14569b = "";
        this.f14570c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f14568a != h1Var.f14568a || !TextUtils.equals(this.f14569b, h1Var.f14569b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14569b, Integer.valueOf(this.f14568a));
    }

    public h1(String str, Bundle bundle) {
        this.f14568a = 0;
        this.f14569b = str;
        bundle.getClass();
        this.f14570c = new Bundle(bundle);
    }
}
