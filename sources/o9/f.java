package o9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f20871b = new AtomicReference();
    public final Context f20872a;

    public f(Context context) {
        this.f20872a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f20873k) {
            try {
                Iterator it = ((a0.e) g.f20874l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20872a.unregisterReceiver(this);
    }
}
