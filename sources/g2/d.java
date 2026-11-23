package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13118a;
    public static final String f13119b;
    public static final String f13120c;
    public static final String d;
    public static final String f13121e;

    static {
        String str = l0.f13778a;
        f13118a = Integer.toString(0, 36);
        f13119b = Integer.toString(1, 36);
        f13120c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13121e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13118a, spanned.getSpanStart(obj));
        bundle2.putInt(f13119b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13120c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13121e, bundle);
        }
        return bundle2;
    }
}
