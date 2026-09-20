package m4;

import android.os.Bundle;
public final class f {
    public static final String f14720f;
    public static final String f14721g;
    public static final String h;
    public static final String f14722i;
    public static final String f14723j;
    public static final String f14724k;
    public final int f14725a;
    public final int f14726b;
    public final String f14727c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7888a;
        f14720f = Integer.toString(0, 36);
        f14721g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14722i = Integer.toString(3, 36);
        f14723j = Integer.toString(4, 36);
        f14724k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14725a = i10;
        this.f14726b = i11;
        this.f14727c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14720f, 0);
        int i11 = bundle.getInt(f14723j, 0);
        String string = bundle.getString(f14721g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14722i);
        int i13 = bundle.getInt(f14724k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
