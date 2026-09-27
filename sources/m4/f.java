package m4;

import android.os.Bundle;
public final class f {
    public static final String f14806f;
    public static final String f14807g;
    public static final String h;
    public static final String f14808i;
    public static final String f14809j;
    public static final String f14810k;
    public final int f14811a;
    public final int f14812b;
    public final String f14813c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7872a;
        f14806f = Integer.toString(0, 36);
        f14807g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14808i = Integer.toString(3, 36);
        f14809j = Integer.toString(4, 36);
        f14810k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14811a = i10;
        this.f14812b = i11;
        this.f14813c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14806f, 0);
        int i11 = bundle.getInt(f14809j, 0);
        String string = bundle.getString(f14807g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14808i);
        int i13 = bundle.getInt(f14810k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
