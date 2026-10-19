package m4;

import android.os.Bundle;
import v7.u6;
public final class i {
    public static final String f16553f;
    public static final String f16554g;
    public static final String h;
    public static final String f16555i;
    public static final String f16556j;
    public static final String f16557k;
    public final int f16558a;
    public final int f16559b;
    public final String f16560c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.m0.f8252a;
        f16553f = Integer.toString(0, 36);
        f16554g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16555i = Integer.toString(3, 36);
        f16556j = Integer.toString(4, 36);
        f16557k = Integer.toString(5, 36);
    }

    public i(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16558a = i10;
        this.f16559b = i11;
        this.f16560c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static i a(Bundle bundle) {
        int i10 = bundle.getInt(f16553f, 0);
        int i11 = bundle.getInt(f16556j, 0);
        String string = bundle.getString(f16554g);
        string.getClass();
        String str = h;
        u6.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16555i);
        int i13 = bundle.getInt(f16557k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i10, i11, string, i12, bundle2, i13);
    }
}
