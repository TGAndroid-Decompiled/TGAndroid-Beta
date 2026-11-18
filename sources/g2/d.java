package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13123a;
    public static final String f13124b;
    public static final String f13125c;
    public static final String d;
    public static final String f13126e;

    static {
        String str = l0.f13783a;
        f13123a = Integer.toString(0, 36);
        f13124b = Integer.toString(1, 36);
        f13125c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13126e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13123a, spanned.getSpanStart(obj));
        bundle2.putInt(f13124b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13125c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13126e, bundle);
        }
        return bundle2;
    }
}
