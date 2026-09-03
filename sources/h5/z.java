package h5;

import android.os.Message;
import java.util.ArrayList;
public final class z {
    public Message f6994a;

    public final void a() {
        this.f6994a = null;
        ArrayList arrayList = a0.f6912b;
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
        Message message = this.f6994a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
