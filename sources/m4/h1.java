package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class h1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16114e;
    public static final String f16115f;
    public static final String f16116g;
    public static final String h;
    public final int f16117a;
    public final String f16118b;
    public final Bundle f16119c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16114e = e9.i0.t(7, objArr);
        String str = e2.d0.f8532a;
        f16115f = Integer.toString(0, 36);
        f16116g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public h1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16117a = i10;
        this.f16118b = "";
        this.f16119c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f16117a != h1Var.f16117a || !TextUtils.equals(this.f16118b, h1Var.f16118b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16118b, Integer.valueOf(this.f16117a));
    }

    public h1(String str, Bundle bundle) {
        this.f16117a = 0;
        this.f16118b = str;
        bundle.getClass();
        this.f16119c = new Bundle(bundle);
    }
}
