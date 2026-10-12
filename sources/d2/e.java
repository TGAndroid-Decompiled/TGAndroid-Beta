package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class e {
    public static final String f8090a;
    public static final String f8091b;
    public static final String f8092c;
    public static final String d;
    public static final String f8093e;

    static {
        String str = d0.f8529a;
        f8090a = Integer.toString(0, 36);
        f8091b = Integer.toString(1, 36);
        f8092c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f8093e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f8090a, spanned.getSpanStart(obj));
        bundle2.putInt(f8091b, spanned.getSpanEnd(obj));
        bundle2.putInt(f8092c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f8093e, bundle);
        }
        return bundle2;
    }
}
