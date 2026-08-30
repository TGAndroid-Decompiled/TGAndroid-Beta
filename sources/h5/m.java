package h5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class m {
    public final y f6960a;
    public final a0 f6961b;
    public final k f6962c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f6963f;
    public final Object f6964g;
    public boolean h;
    public final boolean f6965i;

    public m(Looper looper, y yVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, kVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f6964g) {
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
        ArrayDeque arrayDeque = this.f6963f;
        if (!arrayDeque.isEmpty()) {
            a0 a0Var = this.f6961b;
            if (!a0Var.f6926a.hasMessages(0)) {
                a0Var.getClass();
                z b10 = a0.b();
                Message obtainMessage = a0Var.f6926a.obtainMessage(0);
                b10.f7007a = obtainMessage;
                Handler handler = a0Var.f6926a;
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

    public final void c(int i10, j jVar) {
        f();
        this.f6963f.add(new ah.a(new CopyOnWriteArraySet(this.d), i10, jVar, 4));
    }

    public final void d() {
        f();
        synchronized (this.f6964g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k kVar = this.f6962c;
            lVar.d = true;
            if (lVar.f6959c) {
                lVar.f6959c = false;
                kVar.d(lVar.f6957a, lVar.f6958b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, j jVar) {
        c(i10, jVar);
        b();
    }

    public final void f() {
        boolean z4;
        if (!this.f6965i) {
            return;
        }
        if (Thread.currentThread() == this.f6961b.f6926a.getLooper().getThread()) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, k kVar, boolean z4) {
        this.f6960a = yVar;
        this.d = copyOnWriteArraySet;
        this.f6962c = kVar;
        this.f6964g = new Object();
        this.e = new ArrayDeque();
        this.f6963f = new ArrayDeque();
        this.f6961b = yVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                m mVar = m.this;
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar2 = mVar.f6962c;
                    if (!lVar.d && lVar.f6959c) {
                        g c3 = lVar.f6958b.c();
                        lVar.f6958b = new c2.u();
                        lVar.f6959c = false;
                        kVar2.d(lVar.f6957a, c3);
                    }
                    if (mVar.f6961b.f6926a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f6965i = z4;
    }
}
