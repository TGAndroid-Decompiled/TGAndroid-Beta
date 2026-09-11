package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class d {
    public static final String f6513a;
    public static final String f6514b;
    public static final String f6515c;
    public static final String d;
    public static final String f6516e;

    static {
        String str = d0.f8737a;
        f6513a = Integer.toString(0, 36);
        f6514b = Integer.toString(1, 36);
        f6515c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f6516e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f6513a, spanned.getSpanStart(obj));
        bundle2.putInt(f6514b, spanned.getSpanEnd(obj));
        bundle2.putInt(f6515c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f6516e, bundle);
        }
        return bundle2;
    }
}
