package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import v7.u6;
public final class o1 {
    public static final x1 d = e9.n0.y(40010);
    public static final x1 e;
    public static final String f16648f;
    public static final String f16649g;
    public static final String h;
    public final int f16650a;
    public final String f16651b;
    public final Bundle f16652c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        e9.s.d(7, objArr);
        e = e9.n0.s(7, objArr);
        String str = e2.m0.f8254a;
        f16648f = Integer.toString(0, 36);
        f16649g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public o1(int i10) {
        u6.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f16650a = i10;
        this.f16651b = "";
        this.f16652c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f16648f, this.f16650a);
        bundle.putString(f16649g, this.f16651b);
        bundle.putBundle(h, this.f16652c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (this.f16650a != o1Var.f16650a || !TextUtils.equals(this.f16651b, o1Var.f16651b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f16651b, Integer.valueOf(this.f16650a));
    }

    public o1(String str, Bundle bundle) {
        this.f16650a = 0;
        str.getClass();
        this.f16651b = str;
        bundle.getClass();
        this.f16652c = new Bundle(bundle);
    }
}
