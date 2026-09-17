package m4;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class l1 {
    public static final e9.a1 d = e9.i0.z(40010);
    public static final e9.a1 f15995e;
    public static final String f15996f;
    public static final String f15997g;
    public static final String h;
    public final int f15998a;
    public final String f15999b;
    public final Bundle f16000c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.q.d(7, objArr);
        f15995e = e9.i0.t(7, objArr);
        String str = e2.d0.f8737a;
        f15996f = Integer.toString(0, 36);
        f15997g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public l1(int i10) {
        e2.d.a("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f15998a = i10;
        this.f15999b = "";
        this.f16000c = Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f15998a != l1Var.f15998a || !TextUtils.equals(this.f15999b, l1Var.f15999b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f15999b, Integer.valueOf(this.f15998a));
    }

    public l1(String str, Bundle bundle) {
        this.f15998a = 0;
        this.f15999b = str;
        bundle.getClass();
        this.f16000c = new Bundle(bundle);
    }
}
