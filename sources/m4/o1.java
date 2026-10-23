package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f16717f;
    public static final String f16718g;
    public static final String h;
    public final int f16719a;
    public final String f16720b;
    public final Bundle f16721c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8259a;
        f16717f = Integer.toString(0, 36);
        f16718g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16719a = i10;
        this.f16720b = "";
        this.f16721c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16717f, this.f16719a);
        bundle.putString(f16718g, this.f16720b);
        bundle.putBundle(h, this.f16721c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f16719a != o1Var.f16719a || !TextUtils.equals(this.f16720b, o1Var.f16720b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16720b, Integer.valueOf(this.f16719a));
    }

    public o1(String str, Bundle bundle) {
        this.f16719a = 0;
        str.getClass();
        this.f16720b = str;
        bundle.getClass();
        this.f16721c = new Bundle(bundle);
    }
}
