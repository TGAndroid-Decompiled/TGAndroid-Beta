package f5;

import ag.v0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class m {
    public final y f6601a;
    public final a0 f6602b;
    public final k f6603c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f6604e;
    public final ArrayDeque f6605f;
    public final Object f6606g;
    public boolean h;
    public final boolean f6607i;

    public m(Looper looper, y yVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, kVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f6606g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f6605f;
        if (!arrayDeque.isEmpty()) {
            a0 a0Var = this.f6602b;
            if (!a0Var.f6568a.hasMessages(0)) {
                a0Var.getClass();
                z b10 = a0.b();
                Message obtainMessage = a0Var.f6568a.obtainMessage(0);
                b10.f6647a = obtainMessage;
                Handler handler = a0Var.f6568a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f6604e;
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

    public final void c(int i10, j jVar) {
        f();
        this.f6605f.add(new v0(new CopyOnWriteArraySet(this.d), i10, jVar, 3));
    }

    public final void d() {
        f();
        synchronized (this.f6606g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k kVar = this.f6603c;
            lVar.d = true;
            if (lVar.f6600c) {
                lVar.f6600c = false;
                kVar.e(lVar.f6598a, lVar.f6599b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, j jVar) {
        c(i10, jVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f6607i) {
            return;
        }
        if (Thread.currentThread() == this.f6602b.f6568a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, k kVar) {
        this.f6601a = yVar;
        this.d = copyOnWriteArraySet;
        this.f6603c = kVar;
        this.f6606g = new Object();
        this.f6604e = new ArrayDeque();
        this.f6605f = new ArrayDeque();
        this.f6602b = yVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                m mVar = m.this;
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar2 = mVar.f6603c;
                    if (!lVar.d && lVar.f6600c) {
                        g c3 = lVar.f6599b.c();
                        lVar.f6599b = new c2.u();
                        lVar.f6600c = false;
                        kVar2.e(lVar.f6598a, c3);
                    }
                    if (mVar.f6602b.f6568a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f6607i = true;
    }
}
