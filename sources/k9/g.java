package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f14739b = new AtomicReference();
    public final Context f14740a;

    public g(Context context) {
        this.f14740a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f14741k) {
            try {
                Iterator it = ((a0.e) h.f14742l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14740a.unregisterReceiver(this);
    }
}
