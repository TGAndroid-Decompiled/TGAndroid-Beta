package h5;

import android.os.Message;
import java.util.ArrayList;
public final class z {
    public Message f7315a;

    public final void a() {
        this.f7315a = null;
        ArrayList arrayList = a0.f7225b;
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
        Message message = this.f7315a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
