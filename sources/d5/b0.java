package d5;

import android.os.Message;
import java.util.ArrayList;
public final class b0 {
    public Message f4334a;

    public final void a() {
        this.f4334a = null;
        ArrayList arrayList = c0.f4336b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Message message = this.f4334a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
