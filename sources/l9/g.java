package l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f15965b = new AtomicReference();
    public final Context f15966a;

    public g(Context context) {
        this.f15966a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f15967k) {
            try {
                Iterator it = ((a0.e) h.f15968l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15966a.unregisterReceiver(this);
    }
}
