package m4;

import android.os.Bundle;
public final class f {
    public static final String f14764f;
    public static final String f14765g;
    public static final String h;
    public static final String f14766i;
    public static final String f14767j;
    public static final String f14768k;
    public final int f14769a;
    public final int f14770b;
    public final String f14771c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7870a;
        f14764f = Integer.toString(0, 36);
        f14765g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f14766i = Integer.toString(3, 36);
        f14767j = Integer.toString(4, 36);
        f14768k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f14769a = i10;
        this.f14770b = i11;
        this.f14771c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f14764f, 0);
        int i11 = bundle.getInt(f14767j, 0);
        String string = bundle.getString(f14765g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f14766i);
        int i13 = bundle.getInt(f14768k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
