package m4;

import android.os.Bundle;
public final class f {
    public static final String f16084f;
    public static final String f16085g;
    public static final String h;
    public static final String f16086i;
    public static final String f16087j;
    public static final String f16088k;
    public final int f16089a;
    public final int f16090b;
    public final String f16091c;
    public final int d;
    public final Bundle f16092e;

    static {
        String str = e2.d0.f8531a;
        f16084f = Integer.toString(0, 36);
        f16085g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16086i = Integer.toString(3, 36);
        f16087j = Integer.toString(4, 36);
        f16088k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16089a = i10;
        this.f16090b = i11;
        this.f16091c = str;
        this.d = i12;
        this.f16092e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16084f, 0);
        int i11 = bundle.getInt(f16087j, 0);
        String string = bundle.getString(f16085g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16086i);
        int i13 = bundle.getInt(f16088k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
