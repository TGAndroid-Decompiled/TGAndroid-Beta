package m4;

import android.os.Bundle;
public final class f {
    public static final String f16130f;
    public static final String f16131g;
    public static final String h;
    public static final String f16132i;
    public static final String f16133j;
    public static final String f16134k;
    public final int f16135a;
    public final int f16136b;
    public final String f16137c;
    public final int d;
    public final Bundle f16138e;

    static {
        String str = e2.d0.f8537a;
        f16130f = Integer.toString(0, 36);
        f16131g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16132i = Integer.toString(3, 36);
        f16133j = Integer.toString(4, 36);
        f16134k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16135a = i10;
        this.f16136b = i11;
        this.f16137c = str;
        this.d = i12;
        this.f16138e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16130f, 0);
        int i11 = bundle.getInt(f16133j, 0);
        String string = bundle.getString(f16131g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16132i);
        int i13 = bundle.getInt(f16134k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
