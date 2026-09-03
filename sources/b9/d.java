package b9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import w8.h;
public final class d {
    public static WeakReference f1767b;
    public final a8.e f1768a;

    public d(Context context) {
        this.f1768a = new j(context, d7.d.f4206a, com.google.android.gms.common.api.b.f2704i, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f1767b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f1767b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f1759a = 2;
        this.f1768a.e(1, new c(new b[]{bVar}));
    }
}
