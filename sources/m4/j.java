package m4;

import android.os.Bundle;
import v7.t6;
public final class j {
    public static final String f12777f;
    public static final String f12778g;
    public static final String h;
    public static final String f12779i;
    public static final String f12780j;
    public static final String f12781k;
    public final int f12782a;
    public final int f12783b;
    public final String f12784c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.l0.f6165a;
        f12777f = Integer.toString(0, 36);
        f12778g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f12779i = Integer.toString(3, 36);
        f12780j = Integer.toString(4, 36);
        f12781k = Integer.toString(5, 36);
    }

    public j(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f12782a = i10;
        this.f12783b = i11;
        this.f12784c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static j a(Bundle bundle) {
        int i10 = bundle.getInt(f12777f, 0);
        int i11 = bundle.getInt(f12780j, 0);
        String string = bundle.getString(f12778g);
        string.getClass();
        String str = h;
        t6.f(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f12779i);
        int i13 = bundle.getInt(f12781k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j(i10, i11, string, i12, bundle2, i13);
    }
}
