package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.m0;
public abstract class e {
    public static final String f13458a;
    public static final String f13459b;
    public static final String f13460c;
    public static final String d;
    public static final String f13461e;

    static {
        String str = m0.f14112a;
        f13458a = Integer.toString(0, 36);
        f13459b = Integer.toString(1, 36);
        f13460c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13461e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13458a, spanned.getSpanStart(obj));
        bundle2.putInt(f13459b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13460c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13461e, bundle);
        }
        return bundle2;
    }
}
