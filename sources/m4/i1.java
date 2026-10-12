package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class i1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f15859e;
    public static final String f15860f;
    public static final String f15861g;
    public static final String h;
    public final int f15862a;
    public final String f15863b;
    public final Bundle f15864c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f15859e = e9.i0.t(7, objArr);
        String str = e2.d0.f8529a;
        f15860f = Integer.toString(0, 36);
        f15861g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f15862a = i10;
        this.f15863b = "";
        this.f15864c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f15862a != i1Var.f15862a || !TextUtils.equals(this.f15863b, i1Var.f15863b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f15863b, Integer.valueOf(this.f15862a));
    }

    public i1(String str, Bundle bundle) {
        this.f15862a = 0;
        this.f15863b = str;
        bundle.getClass();
        this.f15864c = new Bundle(bundle);
    }
}
