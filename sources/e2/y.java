package e2;

import android.os.Message;
import java.util.ArrayList;
public final class y {
    public Message f7923a;

    public final void a() {
        this.f7923a = null;
        ArrayList arrayList = z.f7924b;
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
        Message message = this.f7923a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
