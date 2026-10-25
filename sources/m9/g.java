package m9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f18376b = new AtomicReference();
    public final Context f18377a;

    public g(Context context) {
        this.f18377a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f18378k) {
            try {
                Iterator it = ((a0.e) h.f18379l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f18377a.unregisterReceiver(this);
    }
}
