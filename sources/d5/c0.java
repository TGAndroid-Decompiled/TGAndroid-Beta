package d5;

import android.os.Message;
import java.util.ArrayList;

public final class c0 {

    public Message f4780a;

    public final void a() {
        this.f4780a = null;
        ArrayList arrayList = d0.f4781b;
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
        Message message = this.f4780a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
