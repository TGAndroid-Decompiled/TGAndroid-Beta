package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class d {
    public static final String f6227a;
    public static final String f6228b;
    public static final String f6229c;
    public static final String d;
    public static final String e;

    static {
        String str = d0.f7188a;
        f6227a = Integer.toString(0, 36);
        f6228b = Integer.toString(1, 36);
        f6229c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f6227a, spanned.getSpanStart(obj));
        bundle2.putInt(f6228b, spanned.getSpanEnd(obj));
        bundle2.putInt(f6229c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
