package m4;

import android.os.Bundle;
public final class f {
    public static final String f16069f;
    public static final String f16070g;
    public static final String h;
    public static final String f16071i;
    public static final String f16072j;
    public static final String f16073k;
    public final int f16074a;
    public final int f16075b;
    public final String f16076c;
    public final int d;
    public final Bundle f16077e;

    static {
        String str = e2.d0.f8532a;
        f16069f = Integer.toString(0, 36);
        f16070g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16071i = Integer.toString(3, 36);
        f16072j = Integer.toString(4, 36);
        f16073k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f16074a = i10;
        this.f16075b = i11;
        this.f16076c = str;
        this.d = i12;
        this.f16077e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f16069f, 0);
        int i11 = bundle.getInt(f16072j, 0);
        String string = bundle.getString(f16070g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f16071i);
        int i13 = bundle.getInt(f16073k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
