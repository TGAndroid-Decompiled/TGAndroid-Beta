package m4;

import android.os.Bundle;
public final class f {
    public static final String f15805f;
    public static final String f15806g;
    public static final String h;
    public static final String f15807i;
    public static final String f15808j;
    public static final String f15809k;
    public final int f15810a;
    public final int f15811b;
    public final String f15812c;
    public final int d;
    public final Bundle f15813e;

    static {
        String str = e2.d0.f8529a;
        f15805f = Integer.toString(0, 36);
        f15806g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f15807i = Integer.toString(3, 36);
        f15808j = Integer.toString(4, 36);
        f15809k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f15810a = i10;
        this.f15811b = i11;
        this.f15812c = str;
        this.d = i12;
        this.f15813e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f15805f, 0);
        int i11 = bundle.getInt(f15808j, 0);
        String string = bundle.getString(f15806g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f15807i);
        int i13 = bundle.getInt(f15809k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
