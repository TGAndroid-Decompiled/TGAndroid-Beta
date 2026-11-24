package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class p5a {
    public static final w59 d;
    public static final w59 e;
    public static final w59 f;
    public static final w59 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        d = w59Var;
        e = mm5.u(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        xpe.a(7, objArr);
        f = mm5.o(7, objArr);
        g = w59Var;
        String str = g8c.a;
        h = "0";
        i = "1";
        j = "2";
    }

    public p5a(int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        gre.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", z);
        this.a = i2;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putString(i, this.b);
        bundle.putBundle(j, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p5a) {
            p5a p5aVar = (p5a) obj;
            if (this.a == p5aVar.a && TextUtils.equals(this.b, p5aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public p5a(String str, Bundle bundle) {
        this.a = 0;
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
