package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bi.g3;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f7216a;
    public final z f7217b;
    public final n f7218c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f7219f;
    public final Object f7220g;
    public boolean h;
    public final boolean f7221i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f7220g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new o(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f7219f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f7217b;
            if (!zVar.f7243a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f7243a.obtainMessage(1);
                b10.f7241a = obtainMessage;
                Handler handler = zVar.f7243a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i10, m mVar) {
        f();
        this.f7219f.add(new g3(new CopyOnWriteArraySet(this.d), i10, mVar, 7));
    }

    public final void d() {
        f();
        synchronized (this.f7220g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f7218c;
            oVar.d = true;
            if (oVar.f7215c) {
                oVar.f7215c = false;
                nVar.a(oVar.f7213a, oVar.f7214b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, m mVar) {
        c(i10, mVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f7221i) {
            return;
        }
        if (Thread.currentThread() == this.f7217b.f7243a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f7216a = xVar;
        this.d = copyOnWriteArraySet;
        this.f7218c = nVar;
        this.f7220g = new Object();
        this.e = new ArrayDeque();
        this.f7219f = new ArrayDeque();
        this.f7217b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f7218c;
                    if (!oVar.d && oVar.f7215c) {
                        b2.q d = oVar.f7214b.d();
                        oVar.f7214b = new b2.p();
                        oVar.f7215c = false;
                        nVar2.a(oVar.f7213a, d);
                    }
                    if (pVar.f7217b.f7243a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f7221i = z10;
    }
}
