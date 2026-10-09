package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class e {
    public static final String f8093a;
    public static final String f8094b;
    public static final String f8095c;
    public static final String d;
    public static final String f8096e;

    static {
        String str = d0.f8532a;
        f8093a = Integer.toString(0, 36);
        f8094b = Integer.toString(1, 36);
        f8095c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f8096e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f8093a, spanned.getSpanStart(obj));
        bundle2.putInt(f8094b, spanned.getSpanEnd(obj));
        bundle2.putInt(f8095c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f8096e, bundle);
        }
        return bundle2;
    }
}
