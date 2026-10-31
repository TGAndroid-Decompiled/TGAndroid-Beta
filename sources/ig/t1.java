package ig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class t1 {
    public s1 f8469a;
    public final HashMap f8470b = new HashMap();
    public final ArrayList f8471c = new ArrayList();

    public final boolean a() {
        return !this.f8471c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f8470b.put(uuid, runnable);
        this.f8471c.add(uuid);
        org.telegram.messenger.i0.g3(new gg.c(this, 9));
    }

    public final void c() {
        ArrayList arrayList = this.f8471c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f8470b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.i0.g3(new gg.c(this, 9));
    }
}
