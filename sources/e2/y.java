package e2;

import android.os.Message;
import java.util.ArrayList;
public final class y {
    public Message f8591a;

    public final void a() {
        this.f8591a = null;
        ArrayList arrayList = z.f8592b;
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
        Message message = this.f8591a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
