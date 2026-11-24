package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class ig4 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ig4(Context context) {
        this.a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (jg4.k) {
            Iterator it = ((js) jg4.l.values()).iterator();
            while (it.hasNext()) {
                ((jg4) it.next()).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}
