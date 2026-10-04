package d2;

import android.os.Bundle;
import android.text.Spanned;
import e2.d0;
public abstract class e {
    public static final String f8044a;
    public static final String f8045b;
    public static final String f8046c;
    public static final String d;
    public static final String f8047e;

    static {
        String str = d0.f8538a;
        f8044a = Integer.toString(0, 36);
        f8045b = Integer.toString(1, 36);
        f8046c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f8047e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f8044a, spanned.getSpanStart(obj));
        bundle2.putInt(f8045b, spanned.getSpanEnd(obj));
        bundle2.putInt(f8046c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i10);
        if (bundle != null) {
            bundle2.putBundle(f8047e, bundle);
        }
        return bundle2;
    }
}
