package n3;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final gg.h f15226a;
    public final Object f15227b = new Object();
    public final ArrayDeque f15228c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] f15229e;
    public final j[] f15230f;
    public int f15231g;
    public int h;
    public i f15232i;
    public g f15233j;
    public boolean f15234k;
    public boolean f15235l;
    public int f15236m;

    public l(i[] iVarArr, j[] jVarArr) {
        this.f15229e = iVarArr;
        this.f15231g = iVarArr.length;
        for (int i10 = 0; i10 < this.f15231g; i10++) {
            this.f15229e[i10] = e();
        }
        this.f15230f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f15230f[i11] = f();
        }
        gg.h hVar = new gg.h(this);
        this.f15226a = hVar;
        hVar.start();
    }

    @Override
    public final Object b() {
        synchronized (this.f15227b) {
            try {
                g gVar = this.f15233j;
                if (gVar == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (j) this.d.removeFirst();
                }
                throw gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final Object c() {
        boolean z4;
        i iVar;
        synchronized (this.f15227b) {
            try {
                g gVar = this.f15233j;
                if (gVar == null) {
                    if (this.f15232i == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    int i10 = this.f15231g;
                    if (i10 == 0) {
                        iVar = null;
                    } else {
                        i[] iVarArr = this.f15229e;
                        int i11 = i10 - 1;
                        this.f15231g = i11;
                        iVar = iVarArr[i11];
                    }
                    this.f15232i = iVar;
                } else {
                    throw gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override
    public final void d(Object obj) {
        boolean z4;
        i iVar = (i) obj;
        synchronized (this.f15227b) {
            try {
                g gVar = this.f15233j;
                if (gVar == null) {
                    if (iVar == this.f15232i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.f(z4);
                    this.f15228c.addLast(iVar);
                    if (!this.f15228c.isEmpty() && this.h > 0) {
                        this.f15227b.notify();
                    }
                    this.f15232i = null;
                } else {
                    throw gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract i e();

    public abstract j f();

    @Override
    public final void flush() {
        synchronized (this.f15227b) {
            try {
                this.f15234k = true;
                this.f15236m = 0;
                i iVar = this.f15232i;
                if (iVar != null) {
                    iVar.b();
                    i[] iVarArr = this.f15229e;
                    int i10 = this.f15231g;
                    this.f15231g = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.f15232i = null;
                }
                while (!this.f15228c.isEmpty()) {
                    i iVar2 = (i) this.f15228c.removeFirst();
                    iVar2.b();
                    i[] iVarArr2 = this.f15229e;
                    int i11 = this.f15231g;
                    this.f15231g = i11 + 1;
                    iVarArr2[i11] = iVar2;
                }
                while (!this.d.isEmpty()) {
                    ((j) this.d.removeFirst()).i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract g g(Throwable th2);

    public abstract g h(i iVar, j jVar, boolean z4);

    public final boolean i() {
        g g10;
        boolean z4;
        synchronized (this.f15227b) {
            while (!this.f15235l) {
                try {
                    if (!this.f15228c.isEmpty() && this.h > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                    this.f15227b.wait();
                } finally {
                }
            }
            if (this.f15235l) {
                return false;
            }
            i iVar = (i) this.f15228c.removeFirst();
            j[] jVarArr = this.f15230f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z10 = this.f15234k;
            this.f15234k = false;
            if (iVar.e(4)) {
                jVar.a(4);
            } else {
                if (iVar.e(Integer.MIN_VALUE)) {
                    jVar.a(Integer.MIN_VALUE);
                }
                if (iVar.e(134217728)) {
                    jVar.a(134217728);
                }
                try {
                    g10 = h(iVar, jVar, z10);
                } catch (OutOfMemoryError e6) {
                    g10 = g(e6);
                } catch (RuntimeException e10) {
                    g10 = g(e10);
                }
                if (g10 != null) {
                    synchronized (this.f15227b) {
                        this.f15233j = g10;
                    }
                    return false;
                }
            }
            synchronized (this.f15227b) {
                try {
                    if (this.f15234k) {
                        jVar.i();
                    } else if (jVar.e(Integer.MIN_VALUE)) {
                        this.f15236m++;
                        jVar.i();
                    } else {
                        jVar.d = this.f15236m;
                        this.f15236m = 0;
                        this.d.addLast(jVar);
                    }
                    iVar.b();
                    i[] iVarArr = this.f15229e;
                    int i11 = this.f15231g;
                    this.f15231g = i11 + 1;
                    iVarArr[i11] = iVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void j(j jVar) {
        synchronized (this.f15227b) {
            jVar.b();
            j[] jVarArr = this.f15230f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f15228c.isEmpty() && this.h > 0) {
                this.f15227b.notify();
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.f15227b) {
            this.f15235l = true;
            this.f15227b.notify();
        }
        try {
            this.f15226a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
