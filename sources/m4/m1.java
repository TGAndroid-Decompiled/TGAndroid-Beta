package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14625f;
    public static final String f14626g;
    public static final String h;
    public final int f14627a;
    public final String f14628b;
    public final Bundle f14629c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7888a;
        f14625f = Integer.toString(0, 36);
        f14626g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public m1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14627a = i10;
        this.f14628b = "";
        this.f14629c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f14627a != m1Var.f14627a || !TextUtils.equals(this.f14628b, m1Var.f14628b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14628b, Integer.valueOf(this.f14627a));
    }

    public m1(String str, Bundle bundle) {
        this.f14627a = 0;
        this.f14628b = str;
        bundle.getClass();
        this.f14629c = new Bundle(bundle);
    }
}
