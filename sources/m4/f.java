package m4;

import android.os.Bundle;
public final class f {
    public static final String f16134f;
    public static final String f16135g;
    public static final String h;
    public static final String f16136i;
    public static final String f16137j;
    public static final String f16138k;
    public final int f16139a;
    public final int f16140b;
    public final String f16141c;
    public final int d;
    public final Bundle f16142e;

    static {
        String str = e2.d0.f8538a;
        f16134f = Integer.toString(0, 36);
        f16135g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16136i = Integer.toString(3, 36);
        f16137j = Integer.toString(4, 36);
        f16138k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16139a = i10;
        this.f16140b = i11;
        this.f16141c = str;
        this.d = i12;
        this.f16142e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16134f, 0);
        int i11 = bundle.getInt(f16137j, 0);
        String string = bundle.getString(f16135g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16136i);
        int i13 = bundle.getInt(f16138k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
