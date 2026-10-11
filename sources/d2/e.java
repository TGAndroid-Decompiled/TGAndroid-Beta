package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class e {
    public static final String f8092a;
    public static final String f8093b;
    public static final String f8094c;
    public static final String d;
    public static final String f8095e;

    static {
        String str = d0.f8531a;
        f8092a = Integer.toString(0, 36);
        f8093b = Integer.toString(1, 36);
        f8094c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f8095e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f8092a, spanned.getSpanStart(obj));
        bundle2.putInt(f8093b, spanned.getSpanEnd(obj));
        bundle2.putInt(f8094c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f8095e, bundle);
        }
        return bundle2;
    }
}
