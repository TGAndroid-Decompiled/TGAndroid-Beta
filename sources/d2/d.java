package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.m0;
public abstract class d {
    public static final String f7773a;
    public static final String f7774b;
    public static final String f7775c;
    public static final String d;
    public static final String e;

    static {
        String str = m0.f8253a;
        f7773a = Integer.toString(0, 36);
        f7774b = Integer.toString(1, 36);
        f7775c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f7773a, spanned.getSpanStart(obj));
        bundle2.putInt(f7774b, spanned.getSpanEnd(obj));
        bundle2.putInt(f7775c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
