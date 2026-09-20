package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14830f;
    public static final String f14831g;
    public static final String h;
    public final int f14832a;
    public final String f14833b;
    public final Bundle f14834c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7888a;
        f14830f = Integer.toString(0, 36);
        f14831g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14832a = i10;
        this.f14833b = "";
        this.f14834c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f14832a != l1Var.f14832a || !TextUtils.equals(this.f14833b, l1Var.f14833b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14833b, Integer.valueOf(this.f14832a));
    }

    public l1(String str, Bundle bundle) {
        this.f14832a = 0;
        this.f14833b = str;
        bundle.getClass();
        this.f14834c = new Bundle(bundle);
    }
}
