package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class d {
    public static final String f6540a;
    public static final String f6541b;
    public static final String f6542c;
    public static final String d;
    public static final String f6543e;

    static {
        String str = d0.f8765a;
        f6540a = Integer.toString(0, 36);
        f6541b = Integer.toString(1, 36);
        f6542c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f6543e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f6540a, spanned.getSpanStart(obj));
        bundle2.putInt(f6541b, spanned.getSpanEnd(obj));
        bundle2.putInt(f6542c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f6543e, bundle);
        }
        return bundle2;
    }
}
