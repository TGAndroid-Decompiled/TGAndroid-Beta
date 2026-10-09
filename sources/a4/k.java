package a4;

import e2.d0;
import java.util.ArrayDeque;
public abstract class k implements z3.e {
    public final ArrayDeque f290a = new ArrayDeque();
    public final ArrayDeque f291b;
    public final ArrayDeque f292c;
    public i d;
    public long f293e;
    public long f294f;
    public long f295g;

    public k() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f290a.add(new z3.i());
        }
        this.f291b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f291b;
            a1.c cVar = new a1.c(this, 1);
            ?? obj = new Object();
            obj.f289c = cVar;
            arrayDeque.add(obj);
        }
        this.f292c = new ArrayDeque();
        this.f295g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f295g = j3;
    }

    @Override
    public final void b(long j3) {
        this.f293e = j3;
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
        ArrayDeque arrayDeque = this.f290a;
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
        e2.d.b(z10);
        i iVar2 = (i) iVar;
        if (!iVar2.isEndOfStream()) {
            long j3 = iVar2.f10986e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f295g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    iVar2.clear();
                    this.f290a.add(iVar2);
                    this.d = null;
                }
            }
        }
        long j11 = this.f294f;
        this.f294f = 1 + j11;
        iVar2.f288s = j11;
        this.f292c.add(iVar2);
        this.d = null;
    }

    public abstract l f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f294f = 0L;
        this.f293e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f292c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f290a;
            if (isEmpty) {
                break;
            }
            i iVar = (i) arrayDeque2.poll();
            String str = d0.f8532a;
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
        ArrayDeque arrayDeque = this.f291b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f292c;
            if (!arrayDeque2.isEmpty()) {
                String str = d0.f8532a;
                if (((i) arrayDeque2.peek()).f10986e <= this.f293e) {
                    i iVar = (i) arrayDeque2.poll();
                    boolean isEndOfStream = iVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f290a;
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
                        long j3 = iVar.f10986e;
                        jVar2.timeUs = j3;
                        jVar2.f53504a = f7;
                        jVar2.f53505b = j3;
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
