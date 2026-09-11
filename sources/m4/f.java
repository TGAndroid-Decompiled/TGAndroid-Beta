package m4;

import android.os.Bundle;
public final class f {
    public static final String f15878f;
    public static final String f15879g;
    public static final String h;
    public static final String f15880i;
    public static final String f15881j;
    public static final String f15882k;
    public final int f15883a;
    public final int f15884b;
    public final String f15885c;
    public final int d;
    public final Bundle f15886e;

    static {
        String str = e2.d0.f8737a;
        f15878f = Integer.toString(0, 36);
        f15879g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f15880i = Integer.toString(3, 36);
        f15881j = Integer.toString(4, 36);
        f15882k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f15883a = i10;
        this.f15884b = i11;
        this.f15885c = str;
        this.d = i12;
        this.f15886e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f15878f, 0);
        int i11 = bundle.getInt(f15881j, 0);
        String string = bundle.getString(f15879g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f15880i);
        int i13 = bundle.getInt(f15882k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
