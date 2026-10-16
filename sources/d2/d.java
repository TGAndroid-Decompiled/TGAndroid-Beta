package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.m0;
public abstract class d {
    public static final String f6319a;
    public static final String f6320b;
    public static final String f6321c;
    public static final String d;
    public static final String e;

    static {
        String str = m0.f8375a;
        f6319a = Integer.toString(0, 36);
        f6320b = Integer.toString(1, 36);
        f6321c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f6319a, spanned.getSpanStart(obj));
        bundle2.putInt(f6320b, spanned.getSpanEnd(obj));
        bundle2.putInt(f6321c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
