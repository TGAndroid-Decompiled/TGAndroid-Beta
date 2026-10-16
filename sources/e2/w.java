package e2;

import android.content.Context;
import di.x8;
import di.y6;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class w {
    public static w f8408f;
    public boolean f8409a;
    public int f8410b;
    public final Object f8411c;
    public final Object d;
    public final Object e;

    public w(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.f8411c = pVar;
        this.d = cVarArr;
        this.f8409a = z10;
        this.f8410b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f8408f == null) {
                    f8408f = new w(context);
                }
                wVar = f8408f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f8410b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f8405a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f8409a && this.f8410b == i10) {
                    return;
                }
                this.f8409a = true;
                this.f8410b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f8406b.execute(new x8(vVar2, 10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.f8411c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f8410b = 0;
        e.execute(new y6(20, this, context));
    }
}
