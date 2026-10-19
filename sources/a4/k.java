package a4;

import e2.m0;
import java.util.ArrayDeque;
import v7.u6;
public abstract class k implements z3.e {
    public final ArrayDeque f273a = new ArrayDeque();
    public final ArrayDeque f274b;
    public final ArrayDeque f275c;
    public i d;
    public long e;
    public long f276f;
    public long f277g;

    public k() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f273a.add(new z3.i());
        }
        this.f274b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f274b;
            a1.c cVar = new a1.c(this, 1);
            ?? obj = new Object();
            obj.f272c = cVar;
            arrayDeque.add(obj);
        }
        this.f275c = new ArrayDeque();
        this.f277g = -9223372036854775807L;
    }

    @Override
    public final void a(long j10) {
        this.f277g = j10;
    }

    @Override
    public final void b(long j10) {
        this.e = j10;
    }

    @Override
    public final Object d() {
        boolean z10;
        if (this.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        ArrayDeque arrayDeque = this.f273a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        i iVar = (i) arrayDeque.pollFirst();
        this.d = iVar;
        return iVar;
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
        u6.g(z10);
        i iVar2 = (i) iVar;
        if (!iVar2.isEndOfStream()) {
            long j10 = iVar2.e;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f277g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    iVar2.clear();
                    this.f273a.add(iVar2);
                    this.d = null;
                }
            }
        }
        long j12 = this.f276f;
        this.f276f = 1 + j12;
        iVar2.f271s = j12;
        this.f275c.add(iVar2);
        this.d = null;
    }

    public abstract l f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f276f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f275c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f273a;
            if (isEmpty) {
                break;
            }
            i iVar = (i) arrayDeque2.poll();
            String str = m0.f8254a;
            iVar.clear();
            arrayDeque.add(iVar);
        }
        i iVar2 = this.d;
        if (iVar2 != null) {
            iVar2.clear();
            arrayDeque.add(iVar2);
            this.d = null;
        }
    }

    public abstract void g(i iVar);

    @Override
    public z3.j c() {
        ArrayDeque arrayDeque = this.f274b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f275c;
            if (!arrayDeque2.isEmpty()) {
                String str = m0.f8254a;
                if (((i) arrayDeque2.peek()).e <= this.e) {
                    i iVar = (i) arrayDeque2.poll();
                    boolean isEndOfStream = iVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f273a;
                    if (isEndOfStream) {
                        z3.j jVar = (z3.j) arrayDeque.pollFirst();
                        jVar.addFlag(4);
                        iVar.clear();
                        arrayDeque3.add(iVar);
                        return jVar;
                    }
                    g(iVar);
                    if (i()) {
                        l f7 = f();
                        z3.j jVar2 = (z3.j) arrayDeque.pollFirst();
                        long j10 = iVar.e;
                        jVar2.timeUs = j10;
                        jVar2.f50651a = f7;
                        jVar2.f50652b = j10;
                        iVar.clear();
                        arrayDeque3.add(iVar);
                        return jVar2;
                    }
                    iVar.clear();
                    arrayDeque3.add(iVar);
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
