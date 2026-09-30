package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class g1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 e;
    public static final String f14831f;
    public static final String f14832g;
    public static final String h;
    public final int f14833a;
    public final String f14834b;
    public final Bundle f14835c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        e = e9.i0.t(7, objArr);
        String str = e2.d0.f7882a;
        f14831f = Integer.toString(0, 36);
        f14832g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public g1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f14833a = i10;
        this.f14834b = "";
        this.f14835c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f14833a != g1Var.f14833a || !TextUtils.equals(this.f14834b, g1Var.f14834b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f14834b, Integer.valueOf(this.f14833a));
    }

    public g1(String str, Bundle bundle) {
        this.f14833a = 0;
        this.f14834b = str;
        bundle.getClass();
        this.f14835c = new Bundle(bundle);
    }
}
