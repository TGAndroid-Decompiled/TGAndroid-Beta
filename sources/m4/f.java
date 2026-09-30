package m4;

import android.os.Bundle;
public final class f {
    public static final String f14795f;
    public static final String f14796g;
    public static final String h;
    public static final String f14797i;
    public static final String f14798j;
    public static final String f14799k;
    public final int f14800a;
    public final int f14801b;
    public final String f14802c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7882a;
        f14795f = Integer.toString(0, 36);
        f14796g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14797i = Integer.toString(3, 36);
        f14798j = Integer.toString(4, 36);
        f14799k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14800a = i10;
        this.f14801b = i11;
        this.f14802c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14795f, 0);
        int i11 = bundle.getInt(f14798j, 0);
        String string = bundle.getString(f14796g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14797i);
        int i13 = bundle.getInt(f14799k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
