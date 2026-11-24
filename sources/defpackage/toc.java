package defpackage;

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;
public final class toc implements Runnable {
    public final uoc a;

    public toc(uoc uocVar) {
        this.a = uocVar;
    }

    @Override
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        uoc uocVar = this.a;
        WeakHashMap weakHashMap = uocVar.e;
        Collection.EL.removeIf(weakHashMap.entrySet(), new ve((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            uocVar.a();
        } else {
            uocVar.d.postDelayed(this, 250L);
        }
    }
}
