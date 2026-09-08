package m4;

import android.os.Bundle;
public final class f {
    public static final String f15905f;
    public static final String f15906g;
    public static final String h;
    public static final String f15907i;
    public static final String f15908j;
    public static final String f15909k;
    public final int f15910a;
    public final int f15911b;
    public final String f15912c;
    public final int d;
    public final Bundle f15913e;

    static {
        String str = e2.d0.f8765a;
        f15905f = Integer.toString(0, 36);
        f15906g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f15907i = Integer.toString(3, 36);
        f15908j = Integer.toString(4, 36);
        f15909k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f15910a = i10;
        this.f15911b = i11;
        this.f15912c = str;
        this.d = i12;
        this.f15913e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f15905f, 0);
        int i11 = bundle.getInt(f15908j, 0);
        String string = bundle.getString(f15906g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f15907i);
        int i13 = bundle.getInt(f15909k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
