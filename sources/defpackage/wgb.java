package defpackage;

import android.os.Message;
import java.util.ArrayList;
public final class wgb {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = xgb.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
