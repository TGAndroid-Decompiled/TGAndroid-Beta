package l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f16026b = new AtomicReference();
    public final Context f16027a;

    public g(Context context) {
        this.f16027a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f16028k) {
            try {
                Iterator it = ((a0.e) h.f16029l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16027a.unregisterReceiver(this);
    }
}
