package m4;

import android.os.Bundle;
import v7.u6;
public final class i {
    public static final String f15193f;
    public static final String f15194g;
    public static final String h;
    public static final String f15195i;
    public static final String f15196j;
    public static final String f15197k;
    public final int f15198a;
    public final int f15199b;
    public final String f15200c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.m0.f8375a;
        f15193f = Integer.toString(0, 36);
        f15194g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f15195i = Integer.toString(3, 36);
        f15196j = Integer.toString(4, 36);
        f15197k = Integer.toString(5, 36);
    }

    public i(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f15198a = i10;
        this.f15199b = i11;
        this.f15200c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static i a(Bundle bundle) {
        int i10 = bundle.getInt(f15193f, 0);
        int i11 = bundle.getInt(f15196j, 0);
        String string = bundle.getString(f15194g);
        string.getClass();
        String str = h;
        u6.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f15195i);
        int i13 = bundle.getInt(f15197k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i10, i11, string, i12, bundle2, i13);
    }
}
