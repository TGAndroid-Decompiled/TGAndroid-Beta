package n3;

import java.util.ArrayDeque;
public abstract class l implements e {
    public final fg.h f14249a;
    public final Object f14250b = new Object();
    public final ArrayDeque f14251c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] e;
    public final j[] f14252f;
    public int f14253g;
    public int h;
    public i f14254i;
    public g f14255j;
    public boolean f14256k;
    public boolean f14257l;
    public int f14258m;

    public l(i[] iVarArr, j[] jVarArr) {
        this.e = iVarArr;
        this.f14253g = iVarArr.length;
        for (int i10 = 0; i10 < this.f14253g; i10++) {
            this.e[i10] = e();
        }
        this.f14252f = jVarArr;
        this.h = jVarArr.length;
        for (int i11 = 0; i11 < this.h; i11++) {
            this.f14252f[i11] = f();
        }
        fg.h hVar = new fg.h(this);
        this.f14249a = hVar;
        hVar.start();
    }

    @Override
    public final Object b() {
        synchronized (this.f14250b) {
            try {
                g gVar = this.f14255j;
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
        synchronized (this.f14250b) {
            try {
                g gVar = this.f14255j;
                if (gVar == null) {
                    if (this.f14254i == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.i(z4);
                    int i10 = this.f14253g;
                    if (i10 == 0) {
                        iVar = null;
                    } else {
                        i[] iVarArr = this.e;
                        int i11 = i10 - 1;
                        this.f14253g = i11;
                        iVar = iVarArr[i11];
                    }
                    this.f14254i = iVar;
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
        synchronized (this.f14250b) {
            try {
                g gVar = this.f14255j;
                if (gVar == null) {
                    if (iVar == this.f14254i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h5.a.f(z4);
                    this.f14251c.addLast(iVar);
                    if (!this.f14251c.isEmpty() && this.h > 0) {
                        this.f14250b.notify();
                    }
                    this.f14254i = null;
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
        synchronized (this.f14250b) {
            try {
                this.f14256k = true;
                this.f14258m = 0;
                i iVar = this.f14254i;
                if (iVar != null) {
                    iVar.c();
                    i[] iVarArr = this.e;
                    int i10 = this.f14253g;
                    this.f14253g = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.f14254i = null;
                }
                while (!this.f14251c.isEmpty()) {
                    i iVar2 = (i) this.f14251c.removeFirst();
                    iVar2.c();
                    i[] iVarArr2 = this.e;
                    int i11 = this.f14253g;
                    this.f14253g = i11 + 1;
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
        synchronized (this.f14250b) {
            while (!this.f14257l) {
                try {
                    if (!this.f14251c.isEmpty() && this.h > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                    this.f14250b.wait();
                } finally {
                }
            }
            if (this.f14257l) {
                return false;
            }
            i iVar = (i) this.f14251c.removeFirst();
            j[] jVarArr = this.f14252f;
            int i10 = this.h - 1;
            this.h = i10;
            j jVar = jVarArr[i10];
            boolean z10 = this.f14256k;
            this.f14256k = false;
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
                } catch (OutOfMemoryError e) {
                    g10 = g(e);
                } catch (RuntimeException e6) {
                    g10 = g(e6);
                }
                if (g10 != null) {
                    synchronized (this.f14250b) {
                        this.f14255j = g10;
                    }
                    return false;
                }
            }
            synchronized (this.f14250b) {
                try {
                    if (this.f14256k) {
                        jVar.j();
                    } else if (jVar.e(Integer.MIN_VALUE)) {
                        this.f14258m++;
                        jVar.j();
                    } else {
                        jVar.d = this.f14258m;
                        this.f14258m = 0;
                        this.d.addLast(jVar);
                    }
                    iVar.c();
                    i[] iVarArr = this.e;
                    int i11 = this.f14253g;
                    this.f14253g = i11 + 1;
                    iVarArr[i11] = iVar;
                } finally {
                }
            }
            return true;
        }
    }

    public final void j(j jVar) {
        synchronized (this.f14250b) {
            jVar.c();
            j[] jVarArr = this.f14252f;
            int i10 = this.h;
            this.h = i10 + 1;
            jVarArr[i10] = jVar;
            if (!this.f14251c.isEmpty() && this.h > 0) {
                this.f14250b.notify();
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.f14250b) {
            this.f14257l = true;
            this.f14250b.notify();
        }
        try {
            this.f14249a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
