package m4;

import android.os.Bundle;
public final class f {
    public static final String f16139f;
    public static final String f16140g;
    public static final String h;
    public static final String f16141i;
    public static final String f16142j;
    public static final String f16143k;
    public final int f16144a;
    public final int f16145b;
    public final String f16146c;
    public final int d;
    public final Bundle f16147e;

    static {
        String str = e2.d0.f8538a;
        f16139f = Integer.toString(0, 36);
        f16140g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16141i = Integer.toString(3, 36);
        f16142j = Integer.toString(4, 36);
        f16143k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16144a = i10;
        this.f16145b = i11;
        this.f16146c = str;
        this.d = i12;
        this.f16147e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16139f, 0);
        int i11 = bundle.getInt(f16142j, 0);
        String string = bundle.getString(f16140g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16141i);
        int i13 = bundle.getInt(f16143k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
