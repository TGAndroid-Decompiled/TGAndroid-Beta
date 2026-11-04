package o4;

import android.os.Bundle;
import b8.zb;
public final class i {
    public static final String f20666f;
    public static final String f20667g;
    public static final String h;
    public static final String f20668i;
    public static final String f20669j;
    public static final String f20670k;
    public final int f20671a;
    public final int f20672b;
    public final String f20673c;
    public final int d;
    public final Bundle f20674e;

    static {
        String str = g2.n0.f11873a;
        f20666f = Integer.toString(0, 36);
        f20667g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f20668i = Integer.toString(3, 36);
        f20669j = Integer.toString(4, 36);
        f20670k = Integer.toString(5, 36);
    }

    public i(int i3, int i10, String str, int i11, Bundle bundle, int i12) {
        this.f20671a = i3;
        this.f20672b = i10;
        this.f20673c = str;
        this.d = i11;
        this.f20674e = bundle;
    }

    public static i a(Bundle bundle) {
        int i3 = bundle.getInt(f20666f, 0);
        int i10 = bundle.getInt(f20669j, 0);
        String string = bundle.getString(f20667g);
        string.getClass();
        String str = h;
        zb.f(bundle.containsKey(str));
        int i11 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f20668i);
        int i12 = bundle.getInt(f20670k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i3, i10, string, i11, bundle2, i12);
    }
}
