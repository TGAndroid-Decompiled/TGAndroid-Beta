package m4;

import android.os.Bundle;
public final class f {
    public static final String f14735f;
    public static final String f14736g;
    public static final String h;
    public static final String f14737i;
    public static final String f14738j;
    public static final String f14739k;
    public final int f14740a;
    public final int f14741b;
    public final String f14742c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7887a;
        f14735f = Integer.toString(0, 36);
        f14736g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14737i = Integer.toString(3, 36);
        f14738j = Integer.toString(4, 36);
        f14739k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14740a = i10;
        this.f14741b = i11;
        this.f14742c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14735f, 0);
        int i11 = bundle.getInt(f14738j, 0);
        String string = bundle.getString(f14736g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14737i);
        int i13 = bundle.getInt(f14739k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
