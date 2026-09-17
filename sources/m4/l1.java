package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16022e;
    public static final String f16023f;
    public static final String f16024g;
    public static final String h;
    public final int f16025a;
    public final String f16026b;
    public final Bundle f16027c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16022e = e9.i0.t(7, objArr);
        String str = e2.d0.f8765a;
        f16023f = Integer.toString(0, 36);
        f16024g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16025a = i10;
        this.f16026b = "";
        this.f16027c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f16025a != l1Var.f16025a || !TextUtils.equals(this.f16026b, l1Var.f16026b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16026b, Integer.valueOf(this.f16025a));
    }

    public l1(String str, Bundle bundle) {
        this.f16025a = 0;
        this.f16026b = str;
        bundle.getClass();
        this.f16027c = new Bundle(bundle);
    }
}
