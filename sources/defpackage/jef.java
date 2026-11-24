package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class jef {
    public static WeakReference b;
    public final u84 a;

    public jef(Context context) {
        this.a = new by4(context, dtd.a, vn.g, new eef((byte) 19));
    }

    public static synchronized jef a(LaunchActivity launchActivity) {
        jef jefVar;
        synchronized (jef.class) {
            WeakReference weakReference = b;
            if (weakReference == null) {
                jefVar = null;
            } else {
                jefVar = (jef) weakReference.get();
            }
            if (jefVar == null) {
                jefVar = new jef(launchActivity.getApplicationContext());
                b = new WeakReference(jefVar);
            }
        }
        return jefVar;
    }
}
