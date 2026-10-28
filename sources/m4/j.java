package m4;

import a8.yb;
import android.os.Bundle;
public final class j {
    public static final String f18079f;
    public static final String f18080g;
    public static final String h;
    public static final String f18081i;
    public static final String f18082j;
    public static final String f18083k;
    public final int f18084a;
    public final int f18085b;
    public final String f18086c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.n0.f9691a;
        f18079f = Integer.toString(0, 36);
        f18080g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f18081i = Integer.toString(3, 36);
        f18082j = Integer.toString(4, 36);
        f18083k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f18084a = i10;
        this.f18085b = i11;
        this.f18086c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f18079f, 0);
        int i11 = bundle.getInt(f18082j, 0);
        String string = bundle.getString(f18080g);
        string.getClass();
        String str = h;
        yb.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f18081i);
        int i13 = bundle.getInt(f18083k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
