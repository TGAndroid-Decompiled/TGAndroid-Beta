package e2;

import android.content.Context;
import ci.v7;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class w {
    public static w f8285f;
    public boolean f8286a;
    public int f8287b;
    public final Object f8288c;
    public final Object d;
    public final Object e;

    public w(ai.a aVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = aVar;
        this.f8288c = pVar;
        this.d = cVarArr;
        this.f8286a = z10;
        this.f8287b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f8285f == null) {
                    f8285f = new w(context);
                }
                wVar = f8285f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f8287b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f8282a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f8286a && this.f8287b == i10) {
                    return;
                }
                this.f8286a = true;
                this.f8287b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f8283b.execute(new com.google.firebase.messaging.s(vVar2, 4));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.f8288c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f8287b = 0;
        e.execute(new v7(17, this, context));
    }
}
