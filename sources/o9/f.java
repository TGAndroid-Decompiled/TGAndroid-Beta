package o9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f21781b = new AtomicReference();
    public final Context f21782a;

    public f(Context context) {
        this.f21782a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f21783k) {
            try {
                Iterator it = ((a0.e) g.f21784l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f21782a.unregisterReceiver(this);
    }
}
