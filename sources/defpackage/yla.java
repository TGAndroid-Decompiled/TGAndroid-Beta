package defpackage;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
public abstract class yla implements n93 {
    public final rd4 a;
    public final s93[] e;
    public final u93[] f;
    public int g;
    public int h;
    public s93 i;
    public q93 j;
    public boolean k;
    public boolean l;
    public int m;
    public Executor o;
    public xla p;
    public xla q;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public yla(s93[] s93VarArr, u93[] u93VarArr) {
        this.e = s93VarArr;
        this.g = s93VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = u93VarArr;
        this.h = u93VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        rd4 rd4Var = new rd4(this);
        this.a = rd4Var;
        rd4Var.start();
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
            yve.p(z);
            this.n = j;
        }
    }

    @Override
    public final Object d() {
        boolean z;
        s93 s93Var;
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var == null) {
                if (this.i == null) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
                int i = this.g;
                if (i == 0) {
                    s93Var = null;
                } else {
                    s93[] s93VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    s93Var = s93VarArr[i2];
                }
                this.i = s93Var;
            } else {
                throw q93Var;
            }
        }
        return s93Var;
    }

    public s93 f() {
        return new s93(1, 0);
    }

    @Override
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            s93 s93Var = this.i;
            if (s93Var != null) {
                n(s93Var, false);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                n((s93) this.c.removeFirst(), false);
            }
            while (!this.d.isEmpty()) {
                ((u93) this.d.removeFirst()).release();
            }
        }
    }

    public u93 g() {
        return new SimpleDecoderOutputBuffer(new lu3(this, (byte) 17));
    }

    public q93 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    public abstract q93 i(s93 s93Var, u93 u93Var, boolean z);

    public final boolean j() {
        q93 h;
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
            s93 s93Var = (s93) this.c.removeFirst();
            u93[] u93VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            u93 u93Var = u93VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (s93Var.isEndOfStream()) {
                u93Var.addFlag(4);
            } else {
                u93Var.timeUs = s93Var.e;
                if (s93Var.isFirstSample()) {
                    u93Var.addFlag(134217728);
                }
                if (!l(s93Var.e)) {
                    u93Var.shouldBeSkipped = true;
                }
                try {
                    h = i(s93Var, u93Var, z2);
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
                    u93Var.release();
                } else {
                    boolean z3 = u93Var.shouldBeSkipped;
                    int i2 = this.m;
                    if (z3) {
                        this.m = i2 + 1;
                        u93Var.release();
                    } else {
                        u93Var.skippedOutputBufferCount = i2;
                        this.m = 0;
                        this.d.addLast(u93Var);
                        xla xlaVar = this.p;
                        Executor executor = this.o;
                        if (xlaVar != null && executor != null) {
                            executor.execute(xlaVar);
                        }
                    }
                }
                n(s93Var, true);
            }
            return true;
        }
    }

    @Override
    public final u93 c() {
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var == null) {
                if (this.d.isEmpty()) {
                    return null;
                }
                return (u93) this.d.removeFirst();
            }
            throw q93Var;
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
    public final void e(s93 s93Var) {
        boolean z;
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var == null) {
                if (s93Var == this.i) {
                    z = true;
                } else {
                    z = false;
                }
                yve.f(z);
                this.c.addLast(s93Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } else {
                throw q93Var;
            }
        }
    }

    public final void n(s93 s93Var, boolean z) {
        s93Var.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = s93Var;
        xla xlaVar = this.q;
        Executor executor = this.o;
        if (z && xlaVar != null && executor != null) {
            executor.execute(xlaVar);
        }
    }

    public final void o(u93 u93Var) {
        synchronized (this.b) {
            u93Var.clear();
            u93[] u93VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            u93VarArr[i] = u93Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void p(final m93 m93Var, Executor executor) {
        synchronized (this.b) {
            this.o = executor;
            this.p = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    m93 m93Var2 = m93Var;
                    switch (b) {
                        case 0:
                            m93Var2.a();
                            return;
                        default:
                            m93Var2.b();
                            return;
                    }
                }
            };
            this.q = new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    m93 m93Var2 = m93Var;
                    switch (b) {
                        case 0:
                            m93Var2.a();
                            return;
                        default:
                            m93Var2.b();
                            return;
                    }
                }
            };
        }
    }

    public final void q(int i) {
        boolean z;
        int i2 = this.g;
        s93[] s93VarArr = this.e;
        if (i2 == s93VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        for (s93 s93Var : s93VarArr) {
            s93Var.c(i);
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
