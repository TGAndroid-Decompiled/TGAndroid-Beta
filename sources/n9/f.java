package n9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f implements com.google.android.gms.common.api.internal.b {
    public static final AtomicReference f20291a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (h.f20294k) {
            try {
                ArrayList arrayList = new ArrayList(h.f20295l.values());
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    h hVar = (h) obj;
                    if (hVar.f20299e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.f20302i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).f20290a;
                            if (!z10) {
                                ((ra.d) hVar2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
