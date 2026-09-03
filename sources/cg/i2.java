package cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class i2 {
    public h2 f2411a;
    public final HashMap f2412b = new HashMap();
    public final ArrayList f2413c = new ArrayList();

    public final boolean a() {
        return !this.f2413c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f2412b.put(uuid, runnable);
        this.f2413c.add(uuid);
        AndroidUtilities.runOnUIThread(new ag.d(this, 15));
    }

    public final void c() {
        ArrayList arrayList = this.f2413c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f2412b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new ag.d(this, 15));
    }
}
