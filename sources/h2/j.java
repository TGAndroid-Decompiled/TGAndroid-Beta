package h2;

import java.util.ArrayDeque;
public abstract class j implements d {
    public final i f10856a;
    public final g[] f10859e;
    public final h[] f10860f;
    public int f10861g;
    public int h;
    public g f10862i;
    public e f10863j;
    public boolean f10864k;
    public boolean f10865l;
    public int f10866m;
    public final Object f10857b = new Object();
    public long f10867n = -9223372036854775807L;
    public final ArrayDeque f10858c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public j(g[] gVarArr, h[] hVarArr) {
        this.f10859e = gVarArr;
        this.f10861g = gVarArr.length;
        for (int i10 = 0; i10 < this.f10861g; i10++) {
            this.f10859e[i10] = f();
        }
        this.f10860f = hVarArr;
        this.h = hVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f10860f[i11] = g();
        }
        i iVar = new i(this);
        this.f10856a = iVar;
        iVar.start();
    }

    @Override
    public final void a(long j3) {
        boolean z10;
        synchronized (this.f10857b) {
            try {
                if (this.f10861g != this.f10859e.length && !this.f10864k) {
                    z10 = false;
                    e2.d.g(z10);
                    this.f10867n = j3;
                }
                z10 = true;
                e2.d.g(z10);
                this.f10867n = j3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object d() {
        boolean z10;
        g gVar;
        synchronized (this.f10857b) {
            try {
                e eVar = this.f10863j;
                if (eVar == null) {
                    if (this.f10862i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    int i10 = this.f10861g;
                    if (i10 == 0) {
                        gVar = null;
                    } else {
                        g[] gVarArr = this.f10859e;
                        int i11 = i10 - 1;
                        this.f10861g = i11;
                        gVar = gVarArr[i11];
                    }
                    this.f10862i = gVar;
                } else {
                    throw eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public abstract g f();

    @Override
    public final void flush() {
        synchronized (this.f10857b) {
            try {
                this.f10864k = true;
                this.f10866m = 0;
                g gVar = this.f10862i;
                if (gVar != null) {
                    gVar.i();
                    g[] gVarArr = this.f10859e;
                    int i10 = this.f10861g;
                    this.f10861g = i10 + 1;
                    gVarArr[i10] = gVar;
                    this.f10862i = null;
                }
                while (!this.f10858c.isEmpty()) {
                    g gVar2 = (g) this.f10858c.removeFirst();
                    gVar2.i();
                    g[] gVarArr2 = this.f10859e;
                    int i11 = this.f10861g;
                    this.f10861g = i11 + 1;
                    gVarArr2[i11] = gVar2;
                }
                while (!this.d.isEmpty()) {
                    ((h) this.d.removeFirst()).j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract h g();

    public abstract e h(Throwable th2);

    public abstract e i(g gVar, h hVar, boolean z10);

    public final boolean j() {
        e h;
        boolean z10;
        synchronized (this.f10857b) {
            while (!this.f10865l) {
                try {
                    if (!this.f10858c.isEmpty() && this.h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f10857b.wait();
                } finally {
                }
            }
            if (this.f10865l) {
                return false;
            }
            g gVar = (g) this.f10858c.removeFirst();
            h[] hVarArr = this.f10860f;
            int i10 = this.h - 1;
            this.h = i10;
            h hVar = hVarArr[i10];
            boolean z11 = this.f10864k;
            this.f10864k = false;
            if (gVar.c(4)) {
                hVar.a(4);
            } else {
                hVar.f10852c = gVar.h;
                if (gVar.c(134217728)) {
                    hVar.a(134217728);
                }
                if (!l(gVar.h)) {
                    hVar.f10853e = true;
                }
                try {
                    h = i(gVar, hVar, z11);
                } catch (OutOfMemoryError e7) {
                    h = h(e7);
                } catch (RuntimeException e10) {
                    h = h(e10);
                }
                if (h != null) {
                    synchronized (this.f10857b) {
                        this.f10863j = h;
                    }
                    return false;
                }
            }
            synchronized (this.f10857b) {
                try {
                    if (this.f10864k) {
                        hVar.j();
                    } else if (hVar.f10853e) {
                        this.f10866m++;
                        hVar.j();
                    } else {
                        hVar.d = this.f10866m;
                        this.f10866m = 0;
                        this.d.addLast(hVar);
                    }
                    gVar.i();
                    g[] gVarArr = this.f10859e;
                    int i11 = this.f10861g;
                    this.f10861g = i11 + 1;
                    gVarArr[i11] = gVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override
    public final h c() {
        synchronized (this.f10857b) {
            try {
                e eVar = this.f10863j;
                if (eVar == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (h) this.d.removeFirst();
                }
                throw eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l(long j3) {
        boolean z10;
        synchronized (this.f10857b) {
            long j10 = this.f10867n;
            if (j10 != -9223372036854775807L && j3 < j10) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override
    public final void e(g gVar) {
        boolean z10;
        synchronized (this.f10857b) {
            try {
                e eVar = this.f10863j;
                if (eVar == null) {
                    if (gVar == this.f10862i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    this.f10858c.addLast(gVar);
                    if (!this.f10858c.isEmpty() && this.h > 0) {
                        this.f10857b.notify();
                    }
                    this.f10862i = null;
                } else {
                    throw eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(h hVar) {
        synchronized (this.f10857b) {
            hVar.i();
            h[] hVarArr = this.f10860f;
            int i10 = this.h;
            this.h = i10 + 1;
            hVarArr[i10] = hVar;
            if (!this.f10858c.isEmpty() && this.h > 0) {
                this.f10857b.notify();
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.f10857b) {
            this.f10865l = true;
            this.f10857b.notify();
        }
        try {
            this.f10856a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
