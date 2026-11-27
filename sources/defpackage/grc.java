package defpackage;

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;
public final class grc implements Runnable {
    public final hrc a;

    public grc(hrc hrcVar) {
        this.a = hrcVar;
    }

    @Override
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        hrc hrcVar = this.a;
        WeakHashMap weakHashMap = hrcVar.e;
        Collection.EL.removeIf(weakHashMap.entrySet(), new hh((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            hrcVar.a();
        } else {
            hrcVar.d.postDelayed(this, 250L);
        }
    }
}
