package h2;

import android.os.Message;
import java.util.ArrayList;
public final class h0 {
    public Message f14094a;

    public final void a() {
        this.f14094a = null;
        ArrayList arrayList = i0.f14097b;
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
        Message message = this.f14094a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
