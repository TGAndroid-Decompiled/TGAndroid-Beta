package defpackage;

import android.os.Bundle;
public final class cs2 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final Bundle e;

    static {
        String str = g8c.a;
        f = "0";
        g = "1";
        h = "2";
        i = "3";
        j = "4";
        k = "5";
    }

    public cs2(int i2, int i3, String str, int i4, Bundle bundle, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
        this.e = bundle;
    }

    public static cs2 a(Bundle bundle) {
        int i2 = bundle.getInt(f, 0);
        int i3 = bundle.getInt(j, 0);
        String string = bundle.getString(g);
        string.getClass();
        String str = h;
        gre.f(bundle.containsKey(str));
        int i4 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(i);
        int i5 = bundle.getInt(k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new cs2(i2, i3, string, i4, bundle2, i5);
    }
}
