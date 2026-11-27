package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class ii4 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ii4(Context context) {
        this.a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (ji4.k) {
            Iterator it = ((ks) ji4.l.values()).iterator();
            while (it.hasNext()) {
                ((ji4) it.next()).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}
