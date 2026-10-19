package m4;

import android.os.Bundle;
import v7.u6;
public final class i {
    public static final String f16555f;
    public static final String f16556g;
    public static final String h;
    public static final String f16557i;
    public static final String f16558j;
    public static final String f16559k;
    public final int f16560a;
    public final int f16561b;
    public final String f16562c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.m0.f8254a;
        f16555f = Integer.toString(0, 36);
        f16556g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16557i = Integer.toString(3, 36);
        f16558j = Integer.toString(4, 36);
        f16559k = Integer.toString(5, 36);
    }

    public i(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16560a = i10;
        this.f16561b = i11;
        this.f16562c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static i a(Bundle bundle) {
        int i10 = bundle.getInt(f16555f, 0);
        int i11 = bundle.getInt(f16558j, 0);
        String string = bundle.getString(f16556g);
        string.getClass();
        String str = h;
        u6.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16557i);
        int i13 = bundle.getInt(f16559k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i10, i11, string, i12, bundle2, i13);
    }
}
