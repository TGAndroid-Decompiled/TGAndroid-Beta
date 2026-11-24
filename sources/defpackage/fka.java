package defpackage;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
public abstract class fka implements ga3 {
    public final ud4 a;
    public final la3[] e;
    public final na3[] f;
    public int g;
    public int h;
    public la3 i;
    public ja3 j;
    public boolean k;
    public boolean l;
    public int m;
    public Executor o;
    public eka p;
    public eka q;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public fka(la3[] la3VarArr, na3[] na3VarArr) {
        this.e = la3VarArr;
        this.g = la3VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = na3VarArr;
        this.h = na3VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        ud4 ud4Var = new ud4(this);
        this.a = ud4Var;
        ud4Var.start();
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
            jte.p(z);
            this.n = j;
        }
    }

    @Override
    public final Object d() {
        boolean z;
        la3 la3Var;
        synchronized (this.b) {
            ja3 ja3Var = this.j;
            if (ja3Var == null) {
                if (this.i == null) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
                int i = this.g;
                if (i == 0) {
                    la3Var = null;
                } else {
                    la3[] la3VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    la3Var = la3VarArr[i2];
                }
                this.i = la3Var;
            } else {
                throw ja3Var;
            }
        }
        return la3Var;
    }

    public la3 f() {
        return new la3(1, 0);
    }

    @Override
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            la3 la3Var = this.i;
            if (la3Var != null) {
                n(la3Var, false);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                n((la3) this.c.removeFirst(), false);
            }
            while (!this.d.isEmpty()) {
                ((na3) this.d.removeFirst()).release();
            }
        }
    }

    public na3 g() {
        return new SimpleDecoderOutputBuffer(new yu3(this, (byte) 17));
    }

    public ja3 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    public abstract ja3 i(la3 la3Var, na3 na3Var, boolean z);

    public final boolean j() {
        ja3 h;
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
            la3 la3Var = (la3) this.c.removeFirst();
            na3[] na3VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            na3 na3Var = na3VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (la3Var.isEndOfStream()) {
                na3Var.addFlag(4);
            } else {
                na3Var.timeUs = la3Var.e;
                if (la3Var.isFirstSample()) {
                    na3Var.addFlag(134217728);
                }
                if (!l(la3Var.e)) {
                    na3Var.shouldBeSkipped = true;
                }
                try {
                    h = i(la3Var, na3Var, z2);
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
                    na3Var.release();
                } else {
                    boolean z3 = na3Var.shouldBeSkipped;
                    int i2 = this.m;
                    if (z3) {
                        this.m = i2 + 1;
                        na3Var.release();
                    } else {
                        na3Var.skippedOutputBufferCount = i2;
                        this.m = 0;
                        this.d.addLast(na3Var);
                        eka ekaVar = this.p;
                        Executor executor = this.o;
                        if (ekaVar != null && executor != null) {
                            executor.execute(ekaVar);
                        }
                    }
                }
                n(la3Var, true);
            }
            return true;
        }
    }

    @Override
    public final na3 c() {
        synchronized (this.b) {
            ja3 ja3Var = this.j;
            if (ja3Var == null) {
                if (this.d.isEmpty()) {
                    return null;
                }
                return (na3) this.d.removeFirst();
            }
            throw ja3Var;
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
    public final void e(la3 la3Var) {
        boolean z;
        synchronized (this.b) {
            ja3 ja3Var = this.j;
            if (ja3Var == null) {
                if (la3Var == this.i) {
                    z = true;
                } else {
                    z = false;
                }
                jte.f(z);
                this.c.addLast(la3Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } else {
                throw ja3Var;
            }
        }
    }

    public final void n(la3 la3Var, boolean z) {
        la3Var.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = la3Var;
        eka ekaVar = this.q;
        Executor executor = this.o;
        if (z && ekaVar != null && executor != null) {
            executor.execute(ekaVar);
        }
    }

    public final void o(na3 na3Var) {
        synchronized (this.b) {
            na3Var.clear();
            na3[] na3VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            na3VarArr[i] = na3Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void p(final fa3 fa3Var, Executor executor) {
        synchronized (this.b) {
            this.o = executor;
            this.p = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    fa3 fa3Var2 = fa3Var;
                    switch (b) {
                        case 0:
                            fa3Var2.a();
                            return;
                        default:
                            fa3Var2.c();
                            return;
                    }
                }
            };
            this.q = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    fa3 fa3Var2 = fa3Var;
                    switch (b) {
                        case 0:
                            fa3Var2.a();
                            return;
                        default:
                            fa3Var2.c();
                            return;
                    }
                }
            };
        }
    }

    public final void q(int i) {
        boolean z;
        int i2 = this.g;
        la3[] la3VarArr = this.e;
        if (i2 == la3VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        for (la3 la3Var : la3VarArr) {
            la3Var.c(i);
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
