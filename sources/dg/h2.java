package dg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class h2 {
    public g2 f4556a;
    public final HashMap f4557b = new HashMap();
    public final ArrayList f4558c = new ArrayList();

    public final boolean a() {
        return !this.f4558c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f4557b.put(uuid, runnable);
        this.f4558c.add(uuid);
        AndroidUtilities.runOnUIThread(new ag.e(this, 20));
    }

    public final void c() {
        ArrayList arrayList = this.f4558c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f4557b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new ag.e(this, 20));
    }
}
