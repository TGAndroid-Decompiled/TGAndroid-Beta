package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class zif {
    public static WeakReference b;
    public final qa4 a;

    public zif(Context context) {
        this.a = new h05(context, txd.a, wn.g, new uif((byte) 19));
    }

    public static synchronized zif a(LaunchActivity launchActivity) {
        zif zifVar;
        synchronized (zif.class) {
            WeakReference weakReference = b;
            if (weakReference == null) {
                zifVar = null;
            } else {
                zifVar = (zif) weakReference.get();
            }
            if (zifVar == null) {
                zifVar = new zif(launchActivity.getApplicationContext());
                b = new WeakReference(zifVar);
            }
        }
        return zifVar;
    }
}
