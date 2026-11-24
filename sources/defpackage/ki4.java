package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class ki4 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ki4(Context context) {
        this.a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (li4.k) {
            Iterator it = ((kt) li4.l.values()).iterator();
            while (it.hasNext()) {
                ((li4) it.next()).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}
