package a4;

import e2.d0;
import java.util.ArrayDeque;
public abstract class l implements z3.e {
    public final ArrayDeque f276a = new ArrayDeque();
    public final ArrayDeque f277b;
    public final ArrayDeque f278c;
    public j d;
    public long f279e;
    public long f280f;
    public long f281g;

    public l() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f276a.add(new z3.i());
        }
        this.f277b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f277b;
            a1.c cVar = new a1.c(this, 1);
            ?? kVar = new dd.k();
            kVar.f275n = cVar;
            arrayDeque.add(kVar);
        }
        this.f278c = new ArrayDeque();
        this.f281g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f281g = j3;
    }

    @Override
    public final void b(long j3) {
        this.f279e = j3;
    }

    @Override
    public final Object d() {
        boolean z10;
        if (this.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        ArrayDeque arrayDeque = this.f276a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        j jVar = (j) arrayDeque.pollFirst();
        this.d = jVar;
        return jVar;
    }

    @Override
    public final void e(z3.i iVar) {
        boolean z10;
        if (iVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        j jVar = (j) iVar;
        if (!jVar.c(4)) {
            long j3 = jVar.h;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f281g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    jVar.i();
                    this.f276a.add(jVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f280f;
        this.f280f = 1 + j11;
        jVar.f274w = j11;
        this.f278c.add(jVar);
        this.d = null;
    }

    public abstract m f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f280f = 0L;
        this.f279e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f278c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f276a;
            if (isEmpty) {
                break;
            }
            j jVar = (j) arrayDeque2.poll();
            String str = d0.f8737a;
            jVar.i();
            arrayDeque.add(jVar);
        }
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.i();
            arrayDeque.add(jVar2);
            this.d = null;
        }
    }

    public abstract void g(j jVar);

    @Override
    public z3.j c() {
        ArrayDeque arrayDeque = this.f277b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f278c;
            if (!arrayDeque2.isEmpty()) {
                String str = d0.f8737a;
                if (((j) arrayDeque2.peek()).h <= this.f279e) {
                    j jVar = (j) arrayDeque2.poll();
                    boolean c10 = jVar.c(4);
                    ArrayDeque arrayDeque3 = this.f276a;
                    if (c10) {
                        z3.j jVar2 = (z3.j) arrayDeque.pollFirst();
                        jVar2.a(4);
                        jVar.i();
                        arrayDeque3.add(jVar);
                        return jVar2;
                    }
                    g(jVar);
                    if (i()) {
                        m f7 = f();
                        z3.j jVar3 = (z3.j) arrayDeque.pollFirst();
                        long j3 = jVar.h;
                        jVar3.f10852c = j3;
                        jVar3.f50699f = f7;
                        jVar3.h = j3;
                        jVar.i();
                        arrayDeque3.add(jVar);
                        return jVar3;
                    }
                    jVar.i();
                    arrayDeque3.add(jVar);
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
