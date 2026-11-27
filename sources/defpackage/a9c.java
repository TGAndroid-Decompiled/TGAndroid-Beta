package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class a9c {
    public z8c a;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public final boolean a() {
        return !this.c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.b.put(uuid, runnable);
        this.c.add(uuid);
        hl.c3(new azb(this, (byte) 7));
    }

    public final void c() {
        ArrayList arrayList = this.c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        hl.c3(new azb(this, (byte) 7));
    }
}
