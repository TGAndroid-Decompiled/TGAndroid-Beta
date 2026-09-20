package k9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference f13543a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (h.f13546k) {
            try {
                ArrayList arrayList = new ArrayList(h.f13547l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h hVar = (h) obj;
                    if (hVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.f13553i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).f13542a;
                            if (!z10) {
                                ((na.c) hVar2.h.get()).c();
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
