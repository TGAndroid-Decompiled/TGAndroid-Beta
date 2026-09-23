package e2;

import android.os.Message;
import java.util.ArrayList;
public final class y {
    public Message f7924a;

    public final void a() {
        this.f7924a = null;
        ArrayList arrayList = z.f7925b;
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
        Message message = this.f7924a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
