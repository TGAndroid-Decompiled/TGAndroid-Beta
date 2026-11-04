package g2;

import android.os.Message;
import java.util.ArrayList;
public final class i0 {
    public Message f11853a;

    public final void a() {
        this.f11853a = null;
        ArrayList arrayList = j0.f11856b;
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
        Message message = this.f11853a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
