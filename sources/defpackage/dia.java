package defpackage;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
public abstract class dia implements u83 {
    public final ub4 a;
    public final z83[] e;
    public final b93[] f;
    public int g;
    public int h;
    public z83 i;
    public x83 j;
    public boolean k;
    public boolean l;
    public int m;
    public Executor o;
    public cia p;
    public cia q;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public dia(z83[] z83VarArr, b93[] b93VarArr) {
        this.e = z83VarArr;
        this.g = z83VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = b93VarArr;
        this.h = b93VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        ub4 ub4Var = new ub4(this);
        this.a = ub4Var;
        ub4Var.start();
    }

    @Override
    public final void a(long j) {
        boolean z;
        synchronized (this.b) {
            if (this.g != this.e.length && !this.k) {
                z = false;
            } else {
                z = true;
            }
            gre.p(z);
            this.n = j;
        }
    }

    @Override
    public final Object d() {
        boolean z;
        z83 z83Var;
        synchronized (this.b) {
            x83 x83Var = this.j;
            if (x83Var == null) {
                if (this.i == null) {
                    z = true;
                } else {
                    z = false;
                }
                gre.p(z);
                int i = this.g;
                if (i == 0) {
                    z83Var = null;
                } else {
                    z83[] z83VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    z83Var = z83VarArr[i2];
                }
                this.i = z83Var;
            } else {
                throw x83Var;
            }
        }
        return z83Var;
    }

    public z83 f() {
        return new z83(1, 0);
    }

    @Override
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            z83 z83Var = this.i;
            if (z83Var != null) {
                n(z83Var, false);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                n((z83) this.c.removeFirst(), false);
            }
            while (!this.d.isEmpty()) {
                ((b93) this.d.removeFirst()).release();
            }
        }
    }

    public b93 g() {
        return new SimpleDecoderOutputBuffer(new kx3(this, (byte) 14));
    }

    public x83 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    public abstract x83 i(z83 z83Var, b93 b93Var, boolean z);

    public final boolean j() {
        x83 h;
        boolean z;
        synchronized (this.b) {
            while (!this.l) {
                if (!this.c.isEmpty() && this.h > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            z83 z83Var = (z83) this.c.removeFirst();
            b93[] b93VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            b93 b93Var = b93VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (z83Var.isEndOfStream()) {
                b93Var.addFlag(4);
            } else {
                b93Var.timeUs = z83Var.e;
                if (z83Var.isFirstSample()) {
                    b93Var.addFlag(134217728);
                }
                if (!l(z83Var.e)) {
                    b93Var.shouldBeSkipped = true;
                }
                try {
                    h = i(z83Var, b93Var, z2);
                } catch (OutOfMemoryError e) {
                    h = h(e);
                } catch (RuntimeException e2) {
                    h = h(e2);
                }
                if (h != null) {
                    synchronized (this.b) {
                        this.j = h;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    b93Var.release();
                } else {
                    boolean z3 = b93Var.shouldBeSkipped;
                    int i2 = this.m;
                    if (z3) {
                        this.m = i2 + 1;
                        b93Var.release();
                    } else {
                        b93Var.skippedOutputBufferCount = i2;
                        this.m = 0;
                        this.d.addLast(b93Var);
                        cia ciaVar = this.p;
                        Executor executor = this.o;
                        if (ciaVar != null && executor != null) {
                            executor.execute(ciaVar);
                        }
                    }
                }
                n(z83Var, true);
            }
            return true;
        }
    }

    @Override
    public final b93 c() {
        synchronized (this.b) {
            x83 x83Var = this.j;
            if (x83Var == null) {
                if (this.d.isEmpty()) {
                    return null;
                }
                return (b93) this.d.removeFirst();
            }
            throw x83Var;
        }
    }

    public final boolean l(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            if (j2 != -9223372036854775807L && j < j2) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override
    public final void e(z83 z83Var) {
        boolean z;
        synchronized (this.b) {
            x83 x83Var = this.j;
            if (x83Var == null) {
                if (z83Var == this.i) {
                    z = true;
                } else {
                    z = false;
                }
                gre.f(z);
                this.c.addLast(z83Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } else {
                throw x83Var;
            }
        }
    }

    public final void n(z83 z83Var, boolean z) {
        z83Var.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = z83Var;
        cia ciaVar = this.q;
        Executor executor = this.o;
        if (z && ciaVar != null && executor != null) {
            executor.execute(ciaVar);
        }
    }

    public final void o(b93 b93Var) {
        synchronized (this.b) {
            b93Var.clear();
            b93[] b93VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            b93VarArr[i] = b93Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void p(final t83 t83Var, Executor executor) {
        synchronized (this.b) {
            this.o = executor;
            this.p = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    t83 t83Var2 = t83Var;
                    switch (b) {
                        case 0:
                            t83Var2.a();
                            return;
                        default:
                            t83Var2.c();
                            return;
                    }
                }
            };
            this.q = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    t83 t83Var2 = t83Var;
                    switch (b) {
                        case 0:
                            t83Var2.a();
                            return;
                        default:
                            t83Var2.c();
                            return;
                    }
                }
            };
        }
    }

    public final void q(int i) {
        boolean z;
        int i2 = this.g;
        z83[] z83VarArr = this.e;
        if (i2 == z83VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        for (z83 z83Var : z83VarArr) {
            z83Var.c(i);
        }
    }

    @Override
    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
