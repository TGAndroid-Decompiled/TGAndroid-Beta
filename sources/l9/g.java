package l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f11704b = new AtomicReference();
    public final Context f11705a;

    public g(Context context) {
        this.f11705a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f11706k) {
            try {
                Iterator it = ((a0.e) h.f11707l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11705a.unregisterReceiver(this);
    }
}
