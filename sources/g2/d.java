package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13117a;
    public static final String f13118b;
    public static final String f13119c;
    public static final String d;
    public static final String f13120e;

    static {
        String str = l0.f13778a;
        f13117a = Integer.toString(0, 36);
        f13118b = Integer.toString(1, 36);
        f13119c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13120e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13117a, spanned.getSpanStart(obj));
        bundle2.putInt(f13118b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13119c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13120e, bundle);
        }
        return bundle2;
    }
}
