package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f13544b = new AtomicReference();
    public final Context f13545a;

    public g(Context context) {
        this.f13545a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f13546k) {
            try {
                Iterator it = ((a0.e) h.f13547l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13545a.unregisterReceiver(this);
    }
}
