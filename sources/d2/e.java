package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class e {
    public static final String f7452a;
    public static final String f7453b;
    public static final String f7454c;
    public static final String d;
    public static final String e;

    static {
        String str = d0.f7885a;
        f7452a = Integer.toString(0, 36);
        f7453b = Integer.toString(1, 36);
        f7454c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f7452a, spanned.getSpanStart(obj));
        bundle2.putInt(f7453b, spanned.getSpanEnd(obj));
        bundle2.putInt(f7454c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
