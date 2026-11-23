package d4;

import a8.ma;
import h2.l0;
import java.util.ArrayDeque;
public abstract class j implements c4.e {
    public final ArrayDeque f7841a = new ArrayDeque();
    public final ArrayDeque f7842b;
    public final ArrayDeque f7843c;
    public h d;
    public long f7844e;
    public long f7845f;
    public long f7846g;

    public j() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f7841a.add(new c4.i());
        }
        this.f7842b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f7842b;
            a1.c cVar = new a1.c(this, 20);
            ?? obj = new Object();
            obj.f7840c = cVar;
            arrayDeque.add(obj);
        }
        this.f7843c = new ArrayDeque();
        this.f7846g = -9223372036854775807L;
    }

    @Override
    public final void a(long j3) {
        this.f7846g = j3;
    }

    @Override
    public final void b(long j3) {
        this.f7844e = j3;
    }

    @Override
    public final Object d() {
        boolean z10;
        if (this.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        ArrayDeque arrayDeque = this.f7841a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.d = hVar;
        return hVar;
    }

    @Override
    public final void e(Object obj) {
        boolean z10;
        c4.i iVar = (c4.i) obj;
        if (iVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        h hVar = (h) iVar;
        if (!hVar.isEndOfStream()) {
            long j3 = hVar.f18224e;
            if (j3 != Long.MIN_VALUE) {
                long j10 = this.f7846g;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    hVar.clear();
                    this.f7841a.add(hVar);
                    this.d = null;
                }
            }
        }
        long j11 = this.f7845f;
        this.f7845f = 1 + j11;
        hVar.f7839s = j11;
        this.f7843c.add(hVar);
        this.d = null;
    }

    public abstract ob.c f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f7845f = 0L;
        this.f7844e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f7843c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f7841a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            String str = l0.f13778a;
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
        ArrayDeque arrayDeque = this.f7842b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f7843c;
            if (!arrayDeque2.isEmpty()) {
                String str = l0.f13778a;
                if (((h) arrayDeque2.peek()).f18224e <= this.f7844e) {
                    h hVar = (h) arrayDeque2.poll();
                    boolean isEndOfStream = hVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f7841a;
                    if (isEndOfStream) {
                        c4.j jVar = (c4.j) arrayDeque.pollFirst();
                        jVar.addFlag(4);
                        hVar.clear();
                        arrayDeque3.add(hVar);
                        return jVar;
                    }
                    g(hVar);
                    if (i()) {
                        ob.c f10 = f();
                        c4.j jVar2 = (c4.j) arrayDeque.pollFirst();
                        long j3 = hVar.f18224e;
                        jVar2.timeUs = j3;
                        jVar2.f4385a = f10;
                        jVar2.f4386b = j3;
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
