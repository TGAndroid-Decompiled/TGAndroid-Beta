package m4;

import android.os.Bundle;
public final class f {
    public static final String f14502f;
    public static final String f14503g;
    public static final String h;
    public static final String f14504i;
    public static final String f14505j;
    public static final String f14506k;
    public final int f14507a;
    public final int f14508b;
    public final String f14509c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7883a;
        f14502f = Integer.toString(0, 36);
        f14503g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14504i = Integer.toString(3, 36);
        f14505j = Integer.toString(4, 36);
        f14506k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14507a = i10;
        this.f14508b = i11;
        this.f14509c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14502f, 0);
        int i11 = bundle.getInt(f14505j, 0);
        String string = bundle.getString(f14503g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14504i);
        int i13 = bundle.getInt(f14506k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
