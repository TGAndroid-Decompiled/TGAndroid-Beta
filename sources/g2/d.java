package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13126a;
    public static final String f13127b;
    public static final String f13128c;
    public static final String d;
    public static final String f13129e;

    static {
        String str = l0.f13786a;
        f13126a = Integer.toString(0, 36);
        f13127b = Integer.toString(1, 36);
        f13128c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13129e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13126a, spanned.getSpanStart(obj));
        bundle2.putInt(f13127b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13128c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13129e, bundle);
        }
        return bundle2;
    }
}
