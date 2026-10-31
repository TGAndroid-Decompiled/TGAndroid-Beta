package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.l0;
public abstract class e {
    public static final String f5686a;
    public static final String f5687b;
    public static final String f5688c;
    public static final String d;
    public static final String e;

    static {
        String str = l0.f6165a;
        f5686a = Integer.toString(0, 36);
        f5687b = Integer.toString(1, 36);
        f5688c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f5686a, spanned.getSpanStart(obj));
        bundle2.putInt(f5687b, spanned.getSpanEnd(obj));
        bundle2.putInt(f5688c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
