package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class i1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f16136e;
    public static final String f16137f;
    public static final String f16138g;
    public static final String h;
    public final int f16139a;
    public final String f16140b;
    public final Bundle f16141c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f16136e = e9.i0.t(7, objArr);
        String str = e2.d0.f8531a;
        f16137f = Integer.toString(0, 36);
        f16138g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public i1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16139a = i10;
        this.f16140b = "";
        this.f16141c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f16139a != i1Var.f16139a || !TextUtils.equals(this.f16140b, i1Var.f16140b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16140b, Integer.valueOf(this.f16139a));
    }

    public i1(String str, Bundle bundle) {
        this.f16139a = 0;
        this.f16140b = str;
        bundle.getClass();
        this.f16141c = new Bundle(bundle);
    }
}
