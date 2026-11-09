package d4;

import a8.ia;
import h2.m0;
import java.util.ArrayDeque;
public abstract class j implements c4.e {
    public final ArrayDeque f8176a = new ArrayDeque();
    public final ArrayDeque f8177b;
    public final ArrayDeque f8178c;
    public h d;
    public long f8179e;
    public long f8180f;
    public long f8181g;

    public j() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f8176a.add(new c4.i());
        }
        this.f8177b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f8177b;
            a1.c cVar = new a1.c(this, 24);
            ?? obj = new Object();
            obj.f8175c = cVar;
            arrayDeque.add(obj);
        }
        this.f8178c = new ArrayDeque();
        this.f8181g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f8181g = j3;
    }

    @Override
    public final void b(long j3) {
        this.f8179e = j3;
    }

    @Override
    public final Object d() {
        boolean z9;
        if (this.d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        ArrayDeque arrayDeque = this.f8176a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.d = hVar;
        return hVar;
    }

    @Override
    public final void e(Object obj) {
        boolean z9;
        c4.i iVar = (c4.i) obj;
        if (iVar == this.d) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        h hVar = (h) iVar;
        if (!hVar.isEndOfStream()) {
            long j3 = hVar.f17176e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f8181g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    hVar.clear();
                    this.f8176a.add(hVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f8180f;
        this.f8180f = 1 + j11;
        hVar.f8174s = j11;
        this.f8178c.add(hVar);
        this.d = null;
    }

    public abstract d6.i f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f8180f = 0L;
        this.f8179e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f8178c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f8176a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            String str = m0.f14112a;
            hVar.clear();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.d;
        if (hVar2 != null) {
            hVar2.clear();
            arrayDeque.add(hVar2);
            this.d = null;
        }
    }

    public abstract void g(h hVar);

    @Override
    public c4.j c() {
        ArrayDeque arrayDeque = this.f8177b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f8178c;
            if (!arrayDeque2.isEmpty()) {
                String str = m0.f14112a;
                if (((h) arrayDeque2.peek()).f17176e <= this.f8179e) {
                    h hVar = (h) arrayDeque2.poll();
                    boolean isEndOfStream = hVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f8176a;
                    if (isEndOfStream) {
                        c4.j jVar = (c4.j) arrayDeque.pollFirst();
                        jVar.addFlag(4);
                        hVar.clear();
                        arrayDeque3.add(hVar);
                        return jVar;
                    }
                    g(hVar);
                    if (i()) {
                        d6.i f10 = f();
                        c4.j jVar2 = (c4.j) arrayDeque.pollFirst();
                        long j3 = hVar.f17176e;
                        jVar2.timeUs = j3;
                        jVar2.f5285a = f10;
                        jVar2.f5286b = j3;
                        hVar.clear();
                        arrayDeque3.add(hVar);
                        return jVar2;
                    }
                    hVar.clear();
                    arrayDeque3.add(hVar);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean i();

    @Override
    public void release() {
    }
}
