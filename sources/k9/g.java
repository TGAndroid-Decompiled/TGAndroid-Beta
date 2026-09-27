package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f13532b = new AtomicReference();
    public final Context f13533a;

    public g(Context context) {
        this.f13533a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f13534k) {
            try {
                Iterator it = ((a0.e) h.f13535l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13533a.unregisterReceiver(this);
    }
}
