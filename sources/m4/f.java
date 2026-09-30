package m4;

import android.os.Bundle;
public final class f {
    public static final String f14780f;
    public static final String f14781g;
    public static final String h;
    public static final String f14782i;
    public static final String f14783j;
    public static final String f14784k;
    public final int f14785a;
    public final int f14786b;
    public final String f14787c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7870a;
        f14780f = Integer.toString(0, 36);
        f14781g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14782i = Integer.toString(3, 36);
        f14783j = Integer.toString(4, 36);
        f14784k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14785a = i10;
        this.f14786b = i11;
        this.f14787c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14780f, 0);
        int i11 = bundle.getInt(f14783j, 0);
        String string = bundle.getString(f14781g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14782i);
        int i13 = bundle.getInt(f14784k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
