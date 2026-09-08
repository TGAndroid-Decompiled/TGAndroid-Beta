package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f8795a;
    public final z f8796b;
    public final n f8797c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f8798e;
    public final ArrayDeque f8799f;
    public final Object f8800g;
    public boolean h;
    public final boolean f8801i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f8800g) {
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
        ArrayDeque arrayDeque = this.f8799f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f8796b;
            if (!zVar.f8826a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f8826a.obtainMessage(1);
                b10.f8824a = obtainMessage;
                Handler handler = zVar.f8826a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f8798e;
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
        this.f8799f.add(new ah.p(new CopyOnWriteArraySet(this.d), i10, mVar, 9));
    }

    public final void d() {
        f();
        synchronized (this.f8800g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f8797c;
            oVar.d = true;
            if (oVar.f8794c) {
                oVar.f8794c = false;
                nVar.c(oVar.f8792a, oVar.f8793b.d());
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
        if (!this.f8801i) {
            return;
        }
        if (Thread.currentThread() == this.f8796b.f8826a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f8795a = xVar;
        this.d = copyOnWriteArraySet;
        this.f8797c = nVar;
        this.f8800g = new Object();
        this.f8798e = new ArrayDeque();
        this.f8799f = new ArrayDeque();
        this.f8796b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f8797c;
                    if (!oVar.d && oVar.f8794c) {
                        b2.q d = oVar.f8793b.d();
                        oVar.f8793b = new b2.p();
                        oVar.f8794c = false;
                        nVar2.c(oVar.f8792a, d);
                    }
                    if (pVar.f8796b.f8826a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f8801i = z10;
    }
}
