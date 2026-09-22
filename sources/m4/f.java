package m4;

import android.os.Bundle;
public final class f {
    public static final String f14500f;
    public static final String f14501g;
    public static final String h;
    public static final String f14502i;
    public static final String f14503j;
    public static final String f14504k;
    public final int f14505a;
    public final int f14506b;
    public final String f14507c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7885a;
        f14500f = Integer.toString(0, 36);
        f14501g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14502i = Integer.toString(3, 36);
        f14503j = Integer.toString(4, 36);
        f14504k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14505a = i10;
        this.f14506b = i11;
        this.f14507c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14500f, 0);
        int i11 = bundle.getInt(f14503j, 0);
        String string = bundle.getString(f14501g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14502i);
        int i13 = bundle.getInt(f14504k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
