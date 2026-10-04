package m4;

import android.os.Bundle;
public final class f {
    public static final String f16129f;
    public static final String f16130g;
    public static final String h;
    public static final String f16131i;
    public static final String f16132j;
    public static final String f16133k;
    public final int f16134a;
    public final int f16135b;
    public final String f16136c;
    public final int d;
    public final Bundle f16137e;

    static {
        String str = e2.d0.f8537a;
        f16129f = Integer.toString(0, 36);
        f16130g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16131i = Integer.toString(3, 36);
        f16132j = Integer.toString(4, 36);
        f16133k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16134a = i10;
        this.f16135b = i11;
        this.f16136c = str;
        this.d = i12;
        this.f16137e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16129f, 0);
        int i11 = bundle.getInt(f16132j, 0);
        String string = bundle.getString(f16130g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16131i);
        int i13 = bundle.getInt(f16133k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
