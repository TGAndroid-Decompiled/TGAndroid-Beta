package m4;

import android.os.Bundle;
import v7.u6;
public final class j {
    public static final String f15463f;
    public static final String f15464g;
    public static final String h;
    public static final String f15465i;
    public static final String f15466j;
    public static final String f15467k;
    public final int f15468a;
    public final int f15469b;
    public final String f15470c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.m0.f8372a;
        f15463f = Integer.toString(0, 36);
        f15464g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f15465i = Integer.toString(3, 36);
        f15466j = Integer.toString(4, 36);
        f15467k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f15468a = i10;
        this.f15469b = i11;
        this.f15470c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f15463f, 0);
        int i11 = bundle.getInt(f15466j, 0);
        String string = bundle.getString(f15464g);
        string.getClass();
        String str = h;
        u6.g(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f15465i);
        int i13 = bundle.getInt(f15467k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
