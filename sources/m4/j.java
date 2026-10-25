package m4;

import a8.yb;
import android.os.Bundle;
public final class j {
    public static final String f18080f;
    public static final String f18081g;
    public static final String h;
    public static final String f18082i;
    public static final String f18083j;
    public static final String f18084k;
    public final int f18085a;
    public final int f18086b;
    public final String f18087c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.n0.f9692a;
        f18080f = Integer.toString(0, 36);
        f18081g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f18082i = Integer.toString(3, 36);
        f18083j = Integer.toString(4, 36);
        f18084k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f18085a = i10;
        this.f18086b = i11;
        this.f18087c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f18080f, 0);
        int i11 = bundle.getInt(f18083j, 0);
        String string = bundle.getString(f18081g);
        string.getClass();
        String str = h;
        yb.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f18082i);
        int i13 = bundle.getInt(f18084k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
