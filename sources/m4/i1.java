package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class i1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f15860e;
    public static final String f15861f;
    public static final String f15862g;
    public static final String h;
    public final int f15863a;
    public final String f15864b;
    public final Bundle f15865c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f15860e = e9.i0.t(7, objArr);
        String str = e2.d0.f8529a;
        f15861f = Integer.toString(0, 36);
        f15862g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f15863a = i10;
        this.f15864b = "";
        this.f15865c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f15863a != i1Var.f15863a || !TextUtils.equals(this.f15864b, i1Var.f15864b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f15864b, Integer.valueOf(this.f15863a));
    }

    public i1(String str, Bundle bundle) {
        this.f15863a = 0;
        this.f15864b = str;
        bundle.getClass();
        this.f15865c = new Bundle(bundle);
    }
}
