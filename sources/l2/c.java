package l2;

import java.util.HashMap;
import java.util.Map;
public final class c {
    public final HashMap f19363a;

    public c(int i7) {
        switch (i7) {
            case 1:
                this.f19363a = new HashMap();
                return;
            default:
                this.f19363a = new HashMap();
                return;
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f19363a.remove(runnable);
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f19363a;
        for (Map.Entry entry : hashMap.entrySet()) {
            org.telegram.messenger.g0.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }
}
