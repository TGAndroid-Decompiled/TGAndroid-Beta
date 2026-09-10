package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class n1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f13456f;
    public static final String f13457g;
    public static final String h;
    public final int f13458a;
    public final String f13459b;
    public final Bundle f13460c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7188a;
        f13456f = Integer.toString(0, 36);
        f13457g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public n1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f13458a = i10;
        this.f13459b = "";
        this.f13460c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f13458a != n1Var.f13458a || !TextUtils.equals(this.f13459b, n1Var.f13459b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f13459b, Integer.valueOf(this.f13458a));
    }

    public n1(String str, Bundle bundle) {
        this.f13458a = 0;
        this.f13459b = str;
        bundle.getClass();
        this.f13460c = new Bundle(bundle);
    }
}
