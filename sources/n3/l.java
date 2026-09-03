package n3;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final fg.h f14234a;
    public final Object f14235b = new Object();
    public final ArrayDeque f14236c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] e;
    public final j[] f14237f;
    public int f14238g;
    public int h;
    public i f14239i;
    public g f14240j;
    public boolean f14241k;
    public boolean f14242l;
    public int f14243m;

    public l(i[] iVarArr, j[] jVarArr) {
        this.e = iVarArr;
        this.f14238g = iVarArr.length;
        for (int i10 = 0; i10 < this.f14238g; i10++) {
            this.e[i10] = e();
        }
        this.f14237f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f14237f[i11] = f();
        }
        fg.h hVar = new fg.h(this);
        this.f14234a = hVar;
        hVar.start();
    }

    @Override
    public final Object b() {
        synchronized (this.f14235b) {
            try {
                g gVar = this.f14240j;
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
        synchronized (this.f14235b) {
            try {
                g gVar = this.f14240j;
                if (gVar == null) {
                    if (this.f14239i == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    int i10 = this.f14238g;
                    if (i10 == 0) {
                        iVar = null;
                    } else {
                        i[] iVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f14238g = i11;
                        iVar = iVarArr[i11];
                    }
                    this.f14239i = iVar;
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
        synchronized (this.f14235b) {
            try {
                g gVar = this.f14240j;
                if (gVar == null) {
                    if (iVar == this.f14239i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.f(z4);
                    this.f14236c.addLast(iVar);
                    if (!this.f14236c.isEmpty() && this.h > 0) {
                        this.f14235b.notify();
                    }
                    this.f14239i = null;
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
        synchronized (this.f14235b) {
            try {
                this.f14241k = true;
                this.f14243m = 0;
                i iVar = this.f14239i;
                if (iVar != null) {
                    iVar.b();
                    i[] iVarArr = this.e;
                    int i10 = this.f14238g;
                    this.f14238g = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.f14239i = null;
                }
                while (!this.f14236c.isEmpty()) {
                    i iVar2 = (i) this.f14236c.removeFirst();
                    iVar2.b();
                    i[] iVarArr2 = this.e;
                    int i11 = this.f14238g;
                    this.f14238g = i11 + 1;
                    iVarArr2[i11] = iVar2;
                }
                while (!this.d.isEmpty()) {
                    ((j) this.d.removeFirst()).j();
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
        synchronized (this.f14235b) {
            while (!this.f14242l) {
                try {
                    if (!this.f14236c.isEmpty() && this.h > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                    this.f14235b.wait();
                } finally {
                }
            }
            if (this.f14242l) {
                return false;
            }
            i iVar = (i) this.f14236c.removeFirst();
            j[] jVarArr = this.f14237f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z10 = this.f14241k;
            this.f14241k = false;
            if (iVar.d(4)) {
                jVar.a(4);
            } else {
                if (iVar.d(Integer.MIN_VALUE)) {
                    jVar.a(Integer.MIN_VALUE);
                }
                if (iVar.d(134217728)) {
                    jVar.a(134217728);
                }
                try {
                    g10 = h(iVar, jVar, z10);
                } catch (OutOfMemoryError e) {
                    g10 = g(e);
                } catch (RuntimeException e6) {
                    g10 = g(e6);
                }
                if (g10 != null) {
                    synchronized (this.f14235b) {
                        this.f14240j = g10;
                    }
                    return false;
                }
            }
            synchronized (this.f14235b) {
                try {
                    if (this.f14241k) {
                        jVar.j();
                    } else if (jVar.d(Integer.MIN_VALUE)) {
                        this.f14243m++;
                        jVar.j();
                    } else {
                        jVar.d = this.f14243m;
                        this.f14243m = 0;
                        this.d.addLast(jVar);
                    }
                    iVar.b();
                    i[] iVarArr = this.e;
                    int i11 = this.f14238g;
                    this.f14238g = i11 + 1;
                    iVarArr[i11] = iVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void j(j jVar) {
        synchronized (this.f14235b) {
            jVar.b();
            j[] jVarArr = this.f14237f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f14236c.isEmpty() && this.h > 0) {
                this.f14235b.notify();
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.f14235b) {
            this.f14242l = true;
            this.f14235b.notify();
        }
        try {
            this.f14234a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
