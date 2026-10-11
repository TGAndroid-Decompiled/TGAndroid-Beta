package m4;

import android.os.Bundle;
public final class f {
    public static final String f16120f;
    public static final String f16121g;
    public static final String h;
    public static final String f16122i;
    public static final String f16123j;
    public static final String f16124k;
    public final int f16125a;
    public final int f16126b;
    public final String f16127c;
    public final int d;
    public final Bundle f16128e;

    static {
        String str = e2.d0.f8531a;
        f16120f = Integer.toString(0, 36);
        f16121g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16122i = Integer.toString(3, 36);
        f16123j = Integer.toString(4, 36);
        f16124k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16125a = i10;
        this.f16126b = i11;
        this.f16127c = str;
        this.d = i12;
        this.f16128e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16120f, 0);
        int i11 = bundle.getInt(f16123j, 0);
        String string = bundle.getString(f16121g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16122i);
        int i13 = bundle.getInt(f16124k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
