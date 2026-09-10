package og;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class y1 {
    public x1 f14570a;
    public final HashMap f14571b = new HashMap();
    public final ArrayList f14572c = new ArrayList();

    public final boolean a() {
        return !this.f14572c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f14571b.put(uuid, runnable);
        this.f14572c.add(uuid);
        AndroidUtilities.runOnUIThread(new gg.v1(this, 27));
    }

    public final void c() {
        ArrayList arrayList = this.f14572c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f14571b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new gg.v1(this, 27));
    }
}
