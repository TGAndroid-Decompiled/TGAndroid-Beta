package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class r7a {
    public static final y79 d;
    public static final y79 e;
    public static final y79 f;
    public static final y79 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        d = y79Var;
        e = mo5.u(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        ase.a(7, objArr);
        f = mo5.o(7, objArr);
        g = y79Var;
        String str = hac.a;
        h = "0";
        i = "1";
        j = "2";
    }

    public r7a(int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        jte.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", z);
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
        if (obj instanceof r7a) {
            r7a r7aVar = (r7a) obj;
            if (this.a == r7aVar.a && TextUtils.equals(this.b, r7aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public r7a(String str, Bundle bundle) {
        this.a = 0;
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
