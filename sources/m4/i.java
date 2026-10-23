package m4;

import android.os.Bundle;
import v7.u6;
public final class i {
    public static final String f16616f;
    public static final String f16617g;
    public static final String h;
    public static final String f16618i;
    public static final String f16619j;
    public static final String f16620k;
    public final int f16621a;
    public final int f16622b;
    public final String f16623c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.m0.f8259a;
        f16616f = Integer.toString(0, 36);
        f16617g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16618i = Integer.toString(3, 36);
        f16619j = Integer.toString(4, 36);
        f16620k = Integer.toString(5, 36);
    }

    public i(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16621a = i10;
        this.f16622b = i11;
        this.f16623c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static i a(Bundle bundle) {
        int i10 = bundle.getInt(f16616f, 0);
        int i11 = bundle.getInt(f16619j, 0);
        String string = bundle.getString(f16617g);
        string.getClass();
        String str = h;
        u6.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16618i);
        int i13 = bundle.getInt(f16620k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i10, i11, string, i12, bundle2, i13);
    }
}
