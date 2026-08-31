package b9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import w8.h;
public final class d {
    public static WeakReference f1905b;
    public final a8.e f1906a;

    public d(Context context) {
        this.f1906a = new j(context, d7.d.f4297a, com.google.android.gms.common.api.b.f2649i, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f1905b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f1905b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f1902e.f1894a = 2;
        this.f1906a.e(1, new c(new b[]{bVar}));
    }
}
