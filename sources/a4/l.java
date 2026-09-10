package a4;

import e2.d0;
import java.util.ArrayDeque;
public abstract class l implements z3.e {
    public final ArrayDeque f267a = new ArrayDeque();
    public final ArrayDeque f268b;
    public final ArrayDeque f269c;
    public j d;
    public long e;
    public long f270f;
    public long f271g;

    public l() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f267a.add(new z3.i());
        }
        this.f268b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f268b;
            a1.c cVar = new a1.c(this, 1);
            ?? obj = new Object();
            obj.f266c = cVar;
            arrayDeque.add(obj);
        }
        this.f269c = new ArrayDeque();
        this.f271g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f271g = j3;
    }

    @Override
    public final void b(long j3) {
        this.e = j3;
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
        ArrayDeque arrayDeque = this.f267a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        j jVar = (j) arrayDeque.pollFirst();
        this.d = jVar;
        return jVar;
    }

    @Override
    public final void e(Object obj) {
        boolean z10;
        z3.i iVar = (z3.i) obj;
        if (iVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        j jVar = (j) iVar;
        if (!jVar.isEndOfStream()) {
            long j3 = jVar.e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f271g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    jVar.clear();
                    this.f267a.add(jVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f270f;
        this.f270f = 1 + j11;
        jVar.f265s = j11;
        this.f269c.add(jVar);
        this.d = null;
    }

    public abstract m f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f270f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f269c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f267a;
            if (isEmpty) {
                break;
            }
            j jVar = (j) arrayDeque2.poll();
            String str = d0.f7188a;
            jVar.clear();
            arrayDeque.add(jVar);
        }
        j jVar2 = this.d;
        if (jVar2 != null) {
            jVar2.clear();
            arrayDeque.add(jVar2);
            this.d = null;
        }
    }

    public abstract void g(j jVar);

    @Override
    public z3.j c() {
        ArrayDeque arrayDeque = this.f268b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f269c;
            if (!arrayDeque2.isEmpty()) {
                String str = d0.f7188a;
                if (((j) arrayDeque2.peek()).e <= this.e) {
                    j jVar = (j) arrayDeque2.poll();
                    boolean isEndOfStream = jVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f267a;
                    if (isEndOfStream) {
                        z3.j jVar2 = (z3.j) arrayDeque.pollFirst();
                        jVar2.addFlag(4);
                        jVar.clear();
                        arrayDeque3.add(jVar);
                        return jVar2;
                    }
                    g(jVar);
                    if (i()) {
                        m f7 = f();
                        z3.j jVar3 = (z3.j) arrayDeque.pollFirst();
                        long j3 = jVar.e;
                        jVar3.timeUs = j3;
                        jVar3.f47213a = f7;
                        jVar3.f47214b = j3;
                        jVar.clear();
                        arrayDeque3.add(jVar);
                        return jVar3;
                    }
                    jVar.clear();
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
