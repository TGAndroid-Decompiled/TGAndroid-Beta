package k9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f13530b = new AtomicReference();
    public final Context f13531a;

    public g(Context context) {
        this.f13531a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f13532k) {
            try {
                Iterator it = ((a0.e) h.f13533l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13531a.unregisterReceiver(this);
    }
}
