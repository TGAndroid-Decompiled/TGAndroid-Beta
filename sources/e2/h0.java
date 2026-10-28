package e2;

import android.os.Message;
import java.util.ArrayList;
public final class h0 {
    public Message f9667a;

    public final void a() {
        this.f9667a = null;
        ArrayList arrayList = i0.f9670b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f9667a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
