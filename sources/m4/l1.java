package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14845f;
    public static final String f14846g;
    public static final String h;
    public final int f14847a;
    public final String f14848b;
    public final Bundle f14849c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7887a;
        f14845f = Integer.toString(0, 36);
        f14846g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14847a = i10;
        this.f14848b = "";
        this.f14849c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f14847a != l1Var.f14847a || !TextUtils.equals(this.f14848b, l1Var.f14848b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14848b, Integer.valueOf(this.f14847a));
    }

    public l1(String str, Bundle bundle) {
        this.f14847a = 0;
        this.f14848b = str;
        bundle.getClass();
        this.f14849c = new Bundle(bundle);
    }
}
