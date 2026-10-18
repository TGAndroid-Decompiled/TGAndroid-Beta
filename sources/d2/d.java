package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.m0;
public abstract class d {
    public static final String f7775a;
    public static final String f7776b;
    public static final String f7777c;
    public static final String d;
    public static final String e;

    static {
        String str = m0.f8255a;
        f7775a = Integer.toString(0, 36);
        f7776b = Integer.toString(1, 36);
        f7777c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f7775a, spanned.getSpanStart(obj));
        bundle2.putInt(f7776b, spanned.getSpanEnd(obj));
        bundle2.putInt(f7777c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
