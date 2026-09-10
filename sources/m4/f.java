package m4;

import android.os.Bundle;
public final class f {
    public static final String f13336f;
    public static final String f13337g;
    public static final String h;
    public static final String f13338i;
    public static final String f13339j;
    public static final String f13340k;
    public final int f13341a;
    public final int f13342b;
    public final String f13343c;
    public final int d;
    public final Bundle e;

    static {
        String str = e2.d0.f7188a;
        f13336f = Integer.toString(0, 36);
        f13337g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f13338i = Integer.toString(3, 36);
        f13339j = Integer.toString(4, 36);
        f13340k = Integer.toString(5, 36);
    }

    public f(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f13341a = i10;
        this.f13342b = i11;
        this.f13343c = str;
        this.d = i12;
        this.e = bundle;
    }

    public static f a(Bundle bundle) {
        int i10 = bundle.getInt(f13336f, 0);
        int i11 = bundle.getInt(f13339j, 0);
        String string = bundle.getString(f13337g);
        string.getClass();
        String str = h;
        e2.d.b(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f13338i);
        int i13 = bundle.getInt(f13340k, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new f(i10, i11, string, i12, bundle2, i13);
    }
}
