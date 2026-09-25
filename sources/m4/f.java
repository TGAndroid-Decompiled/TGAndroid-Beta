package m4;

import android.os.Bundle;
public final class f {
    public static final String f14779f;
    public static final String f14780g;
    public static final String h;
    public static final String f14781i;
    public static final String f14782j;
    public static final String f14783k;
    public final int f14784a;
    public final int f14785b;
    public final String f14786c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7870a;
        f14779f = Integer.toString(0, 36);
        f14780g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14781i = Integer.toString(3, 36);
        f14782j = Integer.toString(4, 36);
        f14783k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14784a = i10;
        this.f14785b = i11;
        this.f14786c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14779f, 0);
        int i11 = bundle.getInt(f14782j, 0);
        String string = bundle.getString(f14780g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14781i);
        int i13 = bundle.getInt(f14783k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
