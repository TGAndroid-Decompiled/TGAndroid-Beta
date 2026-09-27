package e2;

import ai.s1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f7900a;
    public final z f7901b;
    public final n f7902c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f7903f;
    public final Object f7904g;
    public boolean h;
    public final boolean f7905i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f7904g) {
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
        ArrayDeque arrayDeque = this.f7903f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f7901b;
            if (!zVar.f7927a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f7927a.obtainMessage(1);
                b10.f7925a = obtainMessage;
                Handler handler = zVar.f7927a;
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
        this.f7903f.add(new s1(new CopyOnWriteArraySet(this.d), i10, mVar, 8));
    }

    public final void d() {
        f();
        synchronized (this.f7904g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f7902c;
            oVar.d = true;
            if (oVar.f7899c) {
                oVar.f7899c = false;
                nVar.e(oVar.f7897a, oVar.f7898b.d());
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
        if (!this.f7905i) {
            return;
        }
        if (Thread.currentThread() == this.f7901b.f7927a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f7900a = xVar;
        this.d = copyOnWriteArraySet;
        this.f7902c = nVar;
        this.f7904g = new Object();
        this.e = new ArrayDeque();
        this.f7903f = new ArrayDeque();
        this.f7901b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f7902c;
                    if (!oVar.d && oVar.f7899c) {
                        b2.q d = oVar.f7898b.d();
                        oVar.f7898b = new b2.p();
                        oVar.f7899c = false;
                        nVar2.e(oVar.f7897a, d);
                    }
                    if (pVar.f7901b.f7927a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f7905i = z10;
    }
}
