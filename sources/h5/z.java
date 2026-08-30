package h5;

import android.os.Message;
import java.util.ArrayList;
public final class z {
    public Message f7007a;

    public final void a() {
        this.f7007a = null;
        ArrayList arrayList = a0.f6925b;
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
        Message message = this.f7007a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
