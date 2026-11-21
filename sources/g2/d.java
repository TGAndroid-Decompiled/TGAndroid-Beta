package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f13152a;
    public static final String f13153b;
    public static final String f13154c;
    public static final String d;
    public static final String f13155e;

    static {
        String str = l0.f13812a;
        f13152a = Integer.toString(0, 36);
        f13153b = Integer.toString(1, 36);
        f13154c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f13155e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f13152a, spanned.getSpanStart(obj));
        bundle2.putInt(f13153b, spanned.getSpanEnd(obj));
        bundle2.putInt(f13154c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f13155e, bundle);
        }
        return bundle2;
    }
}
