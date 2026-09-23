package m4;

import android.os.Bundle;
public final class f {
    public static final String f14525f;
    public static final String f14526g;
    public static final String h;
    public static final String f14527i;
    public static final String f14528j;
    public static final String f14529k;
    public final int f14530a;
    public final int f14531b;
    public final String f14532c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7871a;
        f14525f = Integer.toString(0, 36);
        f14526g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14527i = Integer.toString(3, 36);
        f14528j = Integer.toString(4, 36);
        f14529k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14530a = i10;
        this.f14531b = i11;
        this.f14532c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14525f, 0);
        int i11 = bundle.getInt(f14528j, 0);
        String string = bundle.getString(f14526g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14527i);
        int i13 = bundle.getInt(f14529k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
