package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13155a;
    public static final String f13156b;
    public static final String f13157c;
    public static final String d;
    public static final String f13158e;

    static {
        String str = l0.f13815a;
        f13155a = Integer.toString(0, 36);
        f13156b = Integer.toString(1, 36);
        f13157c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13158e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13155a, spanned.getSpanStart(obj));
        bundle2.putInt(f13156b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13157c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13158e, bundle);
        }
        return bundle2;
    }
}
