package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.m0;
public abstract class e {
    public static final String f13460a;
    public static final String f13461b;
    public static final String f13462c;
    public static final String d;
    public static final String f13463e;

    static {
        String str = m0.f14114a;
        f13460a = Integer.toString(0, 36);
        f13461b = Integer.toString(1, 36);
        f13462c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13463e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13460a, spanned.getSpanStart(obj));
        bundle2.putInt(f13461b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13462c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13463e, bundle);
        }
        return bundle2;
    }
}
