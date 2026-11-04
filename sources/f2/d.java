package f2;

import android.os.Bundle;
import android.text.Spanned;
import g2.n0;
public abstract class d {
    public static final String f11382a;
    public static final String f11383b;
    public static final String f11384c;
    public static final String d;
    public static final String f11385e;

    static {
        String str = n0.f11873a;
        f11382a = Integer.toString(0, 36);
        f11383b = Integer.toString(1, 36);
        f11384c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f11385e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11382a, spanned.getSpanStart(obj));
        bundle2.putInt(f11383b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11384c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i3);
        if (bundle != null) {
            bundle2.putBundle(f11385e, bundle);
        }
        return bundle2;
    }
}
