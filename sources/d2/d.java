package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.m0;
public abstract class d {
    public static final String f7784a;
    public static final String f7785b;
    public static final String f7786c;
    public static final String d;
    public static final String e;

    static {
        String str = m0.f8259a;
        f7784a = Integer.toString(0, 36);
        f7785b = Integer.toString(1, 36);
        f7786c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f7784a, spanned.getSpanStart(obj));
        bundle2.putInt(f7785b, spanned.getSpanEnd(obj));
        bundle2.putInt(f7786c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
