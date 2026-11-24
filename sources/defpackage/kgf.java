package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class kgf {
    public static WeakReference b;
    public final ua4 a;

    public kgf(Context context) {
        this.a = new c05(context, gvd.a, wo.g, new fgf((byte) 19));
    }

    public static synchronized kgf a(LaunchActivity launchActivity) {
        kgf kgfVar;
        synchronized (kgf.class) {
            WeakReference weakReference = b;
            if (weakReference == null) {
                kgfVar = null;
            } else {
                kgfVar = (kgf) weakReference.get();
            }
            if (kgfVar == null) {
                kgfVar = new kgf(launchActivity.getApplicationContext());
                b = new WeakReference(kgfVar);
            }
        }
        return kgfVar;
    }
}
