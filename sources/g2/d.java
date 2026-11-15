package g2;

import android.os.Bundle;
import android.text.Spanned;
import h2.l0;
public abstract class d {
    public static final String f12809a;
    public static final String f12810b;
    public static final String f12811c;
    public static final String d;
    public static final String f12812e;

    static {
        String str = l0.f13471a;
        f12809a = Integer.toString(0, 36);
        f12810b = Integer.toString(1, 36);
        f12811c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f12812e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f12809a, spanned.getSpanStart(obj));
        bundle2.putInt(f12810b, spanned.getSpanEnd(obj));
        bundle2.putInt(f12811c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i7);
        if (bundle != null) {
            bundle2.putBundle(f12812e, bundle);
        }
        return bundle2;
    }
}
