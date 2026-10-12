package l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f14622b = new AtomicReference();
    public final Context f14623a;

    public g(Context context) {
        this.f14623a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f14624k) {
            try {
                Iterator it = ((a0.e) h.f14625l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14623a.unregisterReceiver(this);
    }
}
