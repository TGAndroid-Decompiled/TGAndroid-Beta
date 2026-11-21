package o9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements com.google.android.gms.common.api.internal.b {
    public static final AtomicReference f21780a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (g.f21783k) {
            try {
                ArrayList arrayList = new ArrayList(g.f21784l.values());
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    g gVar = (g) obj;
                    if (gVar.f21788e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f21791i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f21779a;
                            if (!z10) {
                                ((sa.c) gVar2.h.get()).c();
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
