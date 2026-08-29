package ag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class n2 {
    public m2 f617a;
    public final HashMap f618b = new HashMap();
    public final ArrayList f619c = new ArrayList();

    public final boolean a() {
        return !this.f619c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f618b.put(uuid, runnable);
        this.f619c.add(uuid);
        AndroidUtilities.runOnUIThread(new a4.g(this, 4));
    }

    public final void c() {
        ArrayList arrayList = this.f619c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f618b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new a4.g(this, 4));
    }
}
