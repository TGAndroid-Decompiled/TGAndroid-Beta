package e2;

import android.content.Context;
import ci.qc;
import ci.x8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f8582f;
    public boolean f8583a;
    public int f8584b;
    public final Object f8585c;
    public final Object d;
    public final Object f8586e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.f8586e = rVar;
        this.f8585c = pVar;
        this.d = cVarArr;
        this.f8583a = z10;
        this.f8584b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f8582f == null) {
                    f8582f = new u(context);
                }
                uVar = f8582f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.f8586e) {
            i10 = this.f8584b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f8579a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.f8586e) {
            try {
                if (this.f8583a && this.f8584b == i10) {
                    return;
                }
                this.f8583a = true;
                this.f8584b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f8580b.execute(new qc(tVar2, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f8585c = g10;
        this.d = new CopyOnWriteArrayList();
        this.f8586e = new Object();
        this.f8584b = 0;
        g10.execute(new x8(12, this, context));
    }
}
