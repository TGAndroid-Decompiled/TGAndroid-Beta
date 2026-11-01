package m4;

import android.os.Bundle;
import v7.t6;
public final class j {
    public static final String f12778f;
    public static final String f12779g;
    public static final String h;
    public static final String f12780i;
    public static final String f12781j;
    public static final String f12782k;
    public final int f12783a;
    public final int f12784b;
    public final String f12785c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.l0.f6165a;
        f12778f = Integer.toString(0, 36);
        f12779g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f12780i = Integer.toString(3, 36);
        f12781j = Integer.toString(4, 36);
        f12782k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f12783a = i10;
        this.f12784b = i11;
        this.f12785c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f12778f, 0);
        int i11 = bundle.getInt(f12781j, 0);
        String string = bundle.getString(f12779g);
        string.getClass();
        String str = h;
        t6.f(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f12780i);
        int i13 = bundle.getInt(f12782k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
