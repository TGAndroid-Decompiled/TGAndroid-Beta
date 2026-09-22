package a4;

import e2.d0;
import java.util.ArrayDeque;
public abstract class l implements z3.f {
    public final ArrayDeque f269a = new ArrayDeque();
    public final ArrayDeque f270b;
    public final ArrayDeque f271c;
    public j d;
    public long e;
    public long f272f;
    public long f273g;

    public l() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f269a.add(new z3.j());
        }
        this.f270b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f270b;
            a1.c cVar = new a1.c(this, 1);
            ?? obj = new Object();
            obj.f268c = cVar;
            arrayDeque.add(obj);
        }
        this.f271c = new ArrayDeque();
        this.f273g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f273g = j3;
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
        ArrayDeque arrayDeque = this.f269a;
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
        z3.j jVar = (z3.j) obj;
        if (jVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        j jVar2 = (j) jVar;
        if (!jVar2.isEndOfStream()) {
            long j3 = jVar2.e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f273g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    jVar2.clear();
                    this.f269a.add(jVar2);
                    this.d = null;
                }
            }
        }
        long j11 = this.f272f;
        this.f272f = 1 + j11;
        jVar2.f267s = j11;
        this.f271c.add(jVar2);
        this.d = null;
    }

    public abstract m f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f272f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f271c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f269a;
            if (isEmpty) {
                break;
            }
            j jVar = (j) arrayDeque2.poll();
            String str = d0.f7885a;
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
    public z3.k c() {
        ArrayDeque arrayDeque = this.f270b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f271c;
            if (!arrayDeque2.isEmpty()) {
                String str = d0.f7885a;
                if (((j) arrayDeque2.peek()).e <= this.e) {
                    j jVar = (j) arrayDeque2.poll();
                    boolean isEndOfStream = jVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f269a;
                    if (isEndOfStream) {
                        z3.k kVar = (z3.k) arrayDeque.pollFirst();
                        kVar.addFlag(4);
                        jVar.clear();
                        arrayDeque3.add(jVar);
                        return kVar;
                    }
                    g(jVar);
                    if (i()) {
                        m f7 = f();
                        z3.k kVar2 = (z3.k) arrayDeque.pollFirst();
                        long j3 = jVar.e;
                        kVar2.timeUs = j3;
                        kVar2.f48090a = f7;
                        kVar2.f48091b = j3;
                        jVar.clear();
                        arrayDeque3.add(jVar);
                        return kVar2;
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
