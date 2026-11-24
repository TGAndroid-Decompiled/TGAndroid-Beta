package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
public final class zw2 implements Executor, Closeable {
    public static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(zw2.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(zw2.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(zw2.class, "_isTerminated$volatile");
    public static final lo5 w = new lo5("NOT_IN_STACK");
    private volatile int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile long controlState$volatile;
    public final String d;
    public final wx4 e;
    public final wx4 f;
    public final ca9 h;
    private volatile long parkedWorkersStack$volatile;

    public zw2(int i, long j, String str, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.e = new rb6();
                        this.f = new rb6();
                        this.h = new ca9((i + 1) << 1);
                        this.controlState$volatile = i << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    v0b.a(ug8.n(j, "Idle worker keep alive time ", " must be positive"));
                    throw null;
                }
                v0b.a(tb4.n(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            v0b.a(b00.g(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        v0b.a(tb4.n(i, "Core pool size ", " should be at least 1"));
        throw null;
    }

    public final int a() {
        boolean z;
        synchronized (this.h) {
            if (s.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = r;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.a) {
                return 0;
            }
            if (i >= this.b) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 > 0 && this.h.b(i3) == null) {
                xw2 xw2Var = new xw2(this, i3);
                this.h.c(i3, xw2Var);
                if (i3 == ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    int i4 = i2 + 1;
                    xw2Var.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final void b(Runnable runnable, boolean z) {
        zfb cgbVar;
        long j;
        xw2 xw2Var;
        boolean a;
        yw2 yw2Var;
        dgb.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof zfb) {
            cgbVar = (zfb) runnable;
            cgbVar.a = nanoTime;
            cgbVar.b = z;
        } else {
            cgbVar = new cgb(nanoTime, z, runnable);
        }
        boolean z2 = cgbVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        if (z2) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof xw2) {
            xw2Var = (xw2) currentThread;
        } else {
            xw2Var = null;
        }
        if (xw2Var == null || xw2Var.n != this) {
            xw2Var = null;
        }
        if (xw2Var != null && (yw2Var = xw2Var.c) != yw2.e && (cgbVar.b || yw2Var != yw2.b)) {
            xw2Var.h = true;
            pyc pycVar = xw2Var.a;
            pycVar.getClass();
            cgbVar = (zfb) ex.a(pycVar, pyc.f, cgbVar);
            if (cgbVar != null) {
                AtomicReferenceArray atomicReferenceArray = pycVar.a;
                if (pycVar.a() != 127) {
                    if (cgbVar.b) {
                        pyc.c.incrementAndGet(pycVar);
                    }
                    int intVolatile = ex.a.getIntVolatile(pycVar, pyc.g) & 127;
                    while (atomicReferenceArray.get(intVolatile) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(intVolatile, cgbVar);
                    pyc.b.incrementAndGet(pycVar);
                }
            }
            cgbVar = null;
        }
        if (cgbVar != null) {
            if (cgbVar.b) {
                a = this.f.a(cgbVar);
            } else {
                a = this.e.a(cgbVar);
            }
            if (!a) {
                throw new RejectedExecutionException(b00.j(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z2) {
            if (!e() && !d(j)) {
                e();
            }
        } else if (e() || d(atomicLongFieldUpdater.get(this))) {
        } else {
            e();
        }
    }

    public final void c(xw2 xw2Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = xw2Var.c();
                    while (true) {
                        if (c == w) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            xw2 xw2Var2 = (xw2) c;
                            int b = xw2Var2.b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = xw2Var2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                zw2 zw2Var = this;
                if (atomicLongFieldUpdater.compareAndSet(zw2Var, j, j2 | i3)) {
                    return;
                }
                this = zw2Var;
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw2.close():void");
    }

    public final boolean d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        zw2 zw2Var;
        lo5 lo5Var;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            xw2 xw2Var = (xw2) this.h.b((int) (2097151 & j));
            if (xw2Var == null) {
                xw2Var = null;
                zw2Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = xw2Var.c();
                while (true) {
                    lo5Var = w;
                    if (c == lo5Var) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        xw2 xw2Var2 = (xw2) c;
                        i = xw2Var2.b();
                        if (i != 0) {
                            break;
                        }
                        c = xw2Var2.c();
                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                        this = this;
                    }
                }
                if (i >= 0) {
                    zw2 zw2Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(zw2Var2, j, j2 | i);
                    zw2Var = zw2Var2;
                    if (compareAndSet) {
                        xw2Var.g(lo5Var);
                    }
                    this = zw2Var;
                } else {
                    continue;
                }
            }
            if (xw2Var == null) {
                return false;
            }
            if (xw2.r.compareAndSet(xw2Var, -1, 0)) {
                LockSupport.unpark(xw2Var);
                return true;
            }
            this = zw2Var;
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ca9 ca9Var = this.h;
        int a = ca9Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            xw2 xw2Var = (xw2) ca9Var.b(i6);
            if (xw2Var != null) {
                pyc pycVar = xw2Var.a;
                pycVar.getClass();
                Object objectVolatile = ex.a.getObjectVolatile(pycVar, pyc.f);
                int a2 = pycVar.a();
                if (objectVolatile != null) {
                    a2++;
                }
                int ordinal = xw2Var.c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i5++;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i4++;
                                if (a2 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(a2);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        i2++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a2);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a2);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j = r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(s83.a(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        ir2.w(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        ir2.w(sb4, i2, ", parked = ", i3, ", dormant = ");
        ir2.w(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
