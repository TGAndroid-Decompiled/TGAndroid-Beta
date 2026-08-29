package f5;

import android.os.Message;
import java.util.ArrayList;
public final class z {
    public Message f6647a;

    public final void a() {
        this.f6647a = null;
        ArrayList arrayList = a0.f6567b;
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
        Message message = this.f6647a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
