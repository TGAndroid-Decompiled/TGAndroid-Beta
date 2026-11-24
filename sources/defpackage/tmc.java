package defpackage;

import android.os.SystemClock;
import j$.util.Collection;
import java.util.WeakHashMap;
public final class tmc implements Runnable {
    public final umc a;

    public tmc(umc umcVar) {
        this.a = umcVar;
    }

    @Override
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        umc umcVar = this.a;
        WeakHashMap weakHashMap = umcVar.e;
        Collection.EL.removeIf(weakHashMap.entrySet(), new vd((byte) 3, uptimeMillis));
        if (weakHashMap.isEmpty()) {
            umcVar.a();
        } else {
            umcVar.d.postDelayed(this, 250L);
        }
    }
}
