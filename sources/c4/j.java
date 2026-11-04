package c4;

import b8.zb;
import g2.n0;
import java.util.ArrayDeque;
public abstract class j implements b4.e {
    public final ArrayDeque f4204a = new ArrayDeque();
    public final ArrayDeque f4205b;
    public final ArrayDeque f4206c;
    public h d;
    public long f4207e;
    public long f4208f;
    public long f4209g;

    public j() {
        for (int i3 = 0; i3 < 10; i3++) {
            this.f4204a.add(new b4.i());
        }
        this.f4205b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f4205b;
            a1.c cVar = new a1.c(this, 9);
            ?? obj = new Object();
            obj.f4203c = cVar;
            arrayDeque.add(obj);
        }
        this.f4206c = new ArrayDeque();
        this.f4209g = -9223372036854775807L;
    }

    @Override
    public final void a(long j10) {
        this.f4209g = j10;
    }

    @Override
    public final void b(long j10) {
        this.f4207e = j10;
    }

    @Override
    public final Object d() {
        boolean z10;
        if (this.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        ArrayDeque arrayDeque = this.f4204a;
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
        b4.i iVar = (b4.i) obj;
        if (iVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        h hVar = (h) iVar;
        if (!hVar.isEndOfStream()) {
            long j10 = hVar.f16158e;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f4209g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    hVar.clear();
                    this.f4204a.add(hVar);
                    this.d = null;
                }
            }
        }
        long j12 = this.f4208f;
        this.f4208f = 1 + j12;
        hVar.f4202s = j12;
        this.f4206c.add(hVar);
        this.d = null;
    }

    public abstract android.support.v4.media.c f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f4208f = 0L;
        this.f4207e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f4206c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f4204a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            String str = n0.f11873a;
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
    public b4.j c() {
        ArrayDeque arrayDeque = this.f4205b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f4206c;
            if (!arrayDeque2.isEmpty()) {
                String str = n0.f11873a;
                if (((h) arrayDeque2.peek()).f16158e <= this.f4207e) {
                    h hVar = (h) arrayDeque2.poll();
                    boolean isEndOfStream = hVar.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.f4204a;
                    if (isEndOfStream) {
                        b4.j jVar = (b4.j) arrayDeque.pollFirst();
                        jVar.addFlag(4);
                        hVar.clear();
                        arrayDeque3.add(hVar);
                        return jVar;
                    }
                    g(hVar);
                    if (i()) {
                        android.support.v4.media.c f10 = f();
                        b4.j jVar2 = (b4.j) arrayDeque.pollFirst();
                        long j10 = hVar.f16158e;
                        jVar2.timeUs = j10;
                        jVar2.f2370a = f10;
                        jVar2.f2371b = j10;
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
