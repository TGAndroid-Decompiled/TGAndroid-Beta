package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14794f;
    public static final String f14795g;
    public static final String h;
    public final int f14796a;
    public final String f14797b;
    public final Bundle f14798c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7887a;
        f14794f = Integer.toString(0, 36);
        f14795g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14796a = i10;
        this.f14797b = "";
        this.f14798c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f14796a != l1Var.f14796a || !TextUtils.equals(this.f14797b, l1Var.f14797b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14797b, Integer.valueOf(this.f14796a));
    }

    public l1(String str, Bundle bundle) {
        this.f14796a = 0;
        this.f14797b = str;
        bundle.getClass();
        this.f14798c = new Bundle(bundle);
    }
}
