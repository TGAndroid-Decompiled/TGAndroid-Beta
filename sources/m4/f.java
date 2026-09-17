package m4;

import android.os.Bundle;
public final class f {
    public static final String f14512f;
    public static final String f14513g;
    public static final String h;
    public static final String f14514i;
    public static final String f14515j;
    public static final String f14516k;
    public final int f14517a;
    public final int f14518b;
    public final String f14519c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7888a;
        f14512f = Integer.toString(0, 36);
        f14513g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14514i = Integer.toString(3, 36);
        f14515j = Integer.toString(4, 36);
        f14516k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14517a = i10;
        this.f14518b = i11;
        this.f14519c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14512f, 0);
        int i11 = bundle.getInt(f14515j, 0);
        String string = bundle.getString(f14513g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14514i);
        int i13 = bundle.getInt(f14516k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
