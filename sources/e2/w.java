package e2;

import android.content.Context;
import di.b4;
import di.s8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class w {
    public static w f9725f;
    public boolean f9726a;
    public int f9727b;
    public final Object f9728c;
    public final Object d;
    public final Object e;

    public w(bi.a aVar, com.google.android.gms.common.api.internal.p pVar, l6.c[] cVarArr, boolean z10, int i10) {
        this.e = aVar;
        this.f9728c = pVar;
        this.d = cVarArr;
        this.f9726a = z10;
        this.f9727b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f9725f == null) {
                    f9725f = new w(context);
                }
                wVar = f9725f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f9727b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f9722a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f9726a && this.f9727b == i10) {
                    return;
                }
                this.f9726a = true;
                this.f9727b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f9723b.execute(new s8(vVar2, 6));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.f9728c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f9727b = 0;
        e.execute(new b4(26, this, context));
    }
}
