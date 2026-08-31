package n3;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final gg.h f15224a;
    public final Object f15225b = new Object();
    public final ArrayDeque f15226c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] f15227e;
    public final j[] f15228f;
    public int f15229g;
    public int h;
    public i f15230i;
    public g f15231j;
    public boolean f15232k;
    public boolean f15233l;
    public int f15234m;

    public l(i[] iVarArr, j[] jVarArr) {
        this.f15227e = iVarArr;
        this.f15229g = iVarArr.length;
        for (int i10 = 0; i10 < this.f15229g; i10++) {
            this.f15227e[i10] = e();
        }
        this.f15228f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f15228f[i11] = f();
        }
        gg.h hVar = new gg.h(this);
        this.f15224a = hVar;
        hVar.start();
    }

    @Override
    public final Object b() {
        synchronized (this.f15225b) {
            try {
                g gVar = this.f15231j;
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
        synchronized (this.f15225b) {
            try {
                g gVar = this.f15231j;
                if (gVar == null) {
                    if (this.f15230i == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    int i10 = this.f15229g;
                    if (i10 == 0) {
                        iVar = null;
                    } else {
                        i[] iVarArr = this.f15227e;
                        int i11 = i10 - 1;
                        this.f15229g = i11;
                        iVar = iVarArr[i11];
                    }
                    this.f15230i = iVar;
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
        synchronized (this.f15225b) {
            try {
                g gVar = this.f15231j;
                if (gVar == null) {
                    if (iVar == this.f15230i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.f(z4);
                    this.f15226c.addLast(iVar);
                    if (!this.f15226c.isEmpty() && this.h > 0) {
                        this.f15225b.notify();
                    }
                    this.f15230i = null;
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
        synchronized (this.f15225b) {
            try {
                this.f15232k = true;
                this.f15234m = 0;
                i iVar = this.f15230i;
                if (iVar != null) {
                    iVar.b();
                    i[] iVarArr = this.f15227e;
                    int i10 = this.f15229g;
                    this.f15229g = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.f15230i = null;
                }
                while (!this.f15226c.isEmpty()) {
                    i iVar2 = (i) this.f15226c.removeFirst();
                    iVar2.b();
                    i[] iVarArr2 = this.f15227e;
                    int i11 = this.f15229g;
                    this.f15229g = i11 + 1;
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
        synchronized (this.f15225b) {
            while (!this.f15233l) {
                try {
                    if (!this.f15226c.isEmpty() && this.h > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                    this.f15225b.wait();
                } finally {
                }
            }
            if (this.f15233l) {
                return false;
            }
            i iVar = (i) this.f15226c.removeFirst();
            j[] jVarArr = this.f15228f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z10 = this.f15232k;
            this.f15232k = false;
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
                    synchronized (this.f15225b) {
                        this.f15231j = g10;
                    }
                    return false;
                }
            }
            synchronized (this.f15225b) {
                try {
                    if (this.f15232k) {
                        jVar.i();
                    } else if (jVar.e(Integer.MIN_VALUE)) {
                        this.f15234m++;
                        jVar.i();
                    } else {
                        jVar.d = this.f15234m;
                        this.f15234m = 0;
                        this.d.addLast(jVar);
                    }
                    iVar.b();
                    i[] iVarArr = this.f15227e;
                    int i11 = this.f15229g;
                    this.f15229g = i11 + 1;
                    iVarArr[i11] = iVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void j(j jVar) {
        synchronized (this.f15225b) {
            jVar.b();
            j[] jVarArr = this.f15228f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f15226c.isEmpty() && this.h > 0) {
                this.f15225b.notify();
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.f15225b) {
            this.f15233l = true;
            this.f15225b.notify();
        }
        try {
            this.f15224a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
