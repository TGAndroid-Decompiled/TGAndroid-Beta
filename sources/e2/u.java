package e2;

import android.content.Context;
import di.b7;
import di.nb;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f8782f;
    public boolean f8783a;
    public int f8784b;
    public final Object f8785c;
    public final Object d;
    public final Object f8786e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.f8786e = rVar;
        this.f8785c = pVar;
        this.d = cVarArr;
        this.f8783a = z10;
        this.f8784b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f8782f == null) {
                    f8782f = new u(context);
                }
                uVar = f8782f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.f8786e) {
            i10 = this.f8784b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f8779a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.f8786e) {
            try {
                if (this.f8783a && this.f8784b == i10) {
                    return;
                }
                this.f8783a = true;
                this.f8784b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f8780b.execute(new nb(tVar2, 7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f8785c = g10;
        this.d = new CopyOnWriteArrayList();
        this.f8786e = new Object();
        this.f8784b = 0;
        g10.execute(new b7(18, this, context));
    }
}
