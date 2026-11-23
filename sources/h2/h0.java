package h2;

import android.os.Message;
import java.util.ArrayList;
public final class h0 {
    public Message f13759a;

    public final void a() {
        this.f13759a = null;
        ArrayList arrayList = i0.f13762b;
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
        Message message = this.f13759a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
