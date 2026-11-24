package defpackage;

import android.text.Spannable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
public final class pj2 {
    public final WeakReference a;
    public final HashMap b = new HashMap();

    public pj2(Spannable spannable) {
        this.a = new WeakReference(spannable);
    }
}
