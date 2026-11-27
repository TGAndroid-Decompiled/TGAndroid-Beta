package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class h9a {
    public static final j99 d;
    public static final j99 e;
    public static final j99 f;
    public static final j99 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        d = j99Var;
        e = po5.u(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        rue.a(7, objArr);
        f = po5.o(7, objArr);
        g = j99Var;
        String str = gcc.a;
        h = "0";
        i = "1";
        j = "2";
    }

    public h9a(int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        yve.e("commandCode shouldn't be COMMAND_CODE_CUSTOM", z);
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
        if (obj instanceof h9a) {
            h9a h9aVar = (h9a) obj;
            if (this.a == h9aVar.a && TextUtils.equals(this.b, h9aVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public h9a(String str, Bundle bundle) {
        this.a = 0;
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
