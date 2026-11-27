package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class hi4 implements pd0 {
    public static final AtomicReference a = new AtomicReference();

    @Override
    public final void a(boolean z) {
        synchronized (ji4.k) {
            ArrayList arrayList = new ArrayList(ji4.l.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ji4 ji4Var = (ji4) obj;
                if (ji4Var.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it = ji4Var.i.iterator();
                    while (it.hasNext()) {
                        ji4 ji4Var2 = ((gi4) it.next()).a;
                        if (!z) {
                            ((hb3) ji4Var2.h.get()).c();
                        }
                    }
                }
            }
        }
    }
}
