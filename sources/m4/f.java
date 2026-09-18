package m4;

import android.os.Bundle;
public final class f {
    public static final String f14684f;
    public static final String f14685g;
    public static final String h;
    public static final String f14686i;
    public static final String f14687j;
    public static final String f14688k;
    public final int f14689a;
    public final int f14690b;
    public final String f14691c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7887a;
        f14684f = Integer.toString(0, 36);
        f14685g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14686i = Integer.toString(3, 36);
        f14687j = Integer.toString(4, 36);
        f14688k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14689a = i10;
        this.f14690b = i11;
        this.f14691c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14684f, 0);
        int i11 = bundle.getInt(f14687j, 0);
        String string = bundle.getString(f14685g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14686i);
        int i13 = bundle.getInt(f14688k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
