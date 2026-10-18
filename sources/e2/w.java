package e2;

import android.content.Context;
import ci.u7;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class w {
    public static w f8286f;
    public boolean f8287a;
    public int f8288b;
    public final Object f8289c;
    public final Object d;
    public final Object e;

    public w(ai.a aVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = aVar;
        this.f8289c = pVar;
        this.d = cVarArr;
        this.f8287a = z10;
        this.f8288b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f8286f == null) {
                    f8286f = new w(context);
                }
                wVar = f8286f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f8288b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f8283a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f8287a && this.f8288b == i10) {
                    return;
                }
                this.f8287a = true;
                this.f8288b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f8284b.execute(new com.google.firebase.messaging.s(vVar2, 4));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.f8289c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f8288b = 0;
        e.execute(new u7(17, this, context));
    }
}
