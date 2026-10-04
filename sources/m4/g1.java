package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class g1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16172e;
    public static final String f16173f;
    public static final String f16174g;
    public static final String h;
    public final int f16175a;
    public final String f16176b;
    public final Bundle f16177c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16172e = e9.i0.t(7, objArr);
        String str = e2.d0.f8538a;
        f16173f = Integer.toString(0, 36);
        f16174g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public g1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16175a = i10;
        this.f16176b = "";
        this.f16177c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f16175a != g1Var.f16175a || !TextUtils.equals(this.f16176b, g1Var.f16176b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16176b, Integer.valueOf(this.f16175a));
    }

    public g1(String str, Bundle bundle) {
        this.f16175a = 0;
        this.f16176b = str;
        bundle.getClass();
        this.f16177c = new Bundle(bundle);
    }
}
