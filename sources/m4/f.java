package m4;

import android.os.Bundle;
public final class f {
    public static final String f16065f;
    public static final String f16066g;
    public static final String h;
    public static final String f16067i;
    public static final String f16068j;
    public static final String f16069k;
    public final int f16070a;
    public final int f16071b;
    public final String f16072c;
    public final int d;
    public final Bundle f16073e;

    static {
        String str = e2.d0.f8532a;
        f16065f = Integer.toString(0, 36);
        f16066g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16067i = Integer.toString(3, 36);
        f16068j = Integer.toString(4, 36);
        f16069k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16070a = i10;
        this.f16071b = i11;
        this.f16072c = str;
        this.d = i12;
        this.f16073e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16065f, 0);
        int i11 = bundle.getInt(f16068j, 0);
        String string = bundle.getString(f16066g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16067i);
        int i13 = bundle.getInt(f16069k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
