package e2;

import android.os.Message;
import java.util.ArrayList;
public final class y {
    public Message f8590a;

    public final void a() {
        this.f8590a = null;
        ArrayList arrayList = z.f8591b;
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
        Message message = this.f8590a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
