package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public final class hy2 extends Thread {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(hy2.class, "workerCtl$volatile");
    public static final long s = fy.a.objectFieldOffset(hy2.class.getDeclaredField("workerCtl$volatile"));
    public final q0d a;
    public final e79 b;
    public iy2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final jy2 n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public hy2(jy2 jy2Var, int i) {
        this.n = jy2Var;
        setDaemon(true);
        setContextClassLoader(jy2.class.getClassLoader());
        this.a = new q0d();
        this.b = new Object();
        this.c = iy2.d;
        this.nextParkedWorker = jy2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final aib a(boolean z) {
        aib e;
        aib e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        iy2 iy2Var = this.c;
        jy2 jy2Var = this.n;
        aib aibVar = null;
        boolean z2 = true;
        q0d q0dVar = this.a;
        iy2 iy2Var2 = iy2.a;
        if (iy2Var != iy2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = jy2.r;
            do {
                j = atomicLongFieldUpdater.get(jy2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    q0dVar.getClass();
                    long j2 = q0d.f;
                    loop1: while (true) {
                        unsafe = fy.a;
                        aib aibVar2 = (aib) unsafe.getObjectVolatile(q0dVar, j2);
                        if (aibVar2 == null || !aibVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = fy.a;
                            if (unsafe2.compareAndSwapObject(q0dVar, q0d.f, aibVar2, (Object) null)) {
                                aibVar = aibVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(q0dVar, j2) == aibVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(q0dVar, q0d.e);
                    int intVolatile2 = unsafe.getIntVolatile(q0dVar, q0d.g);
                    while (true) {
                        if (intVolatile != intVolatile2 && fy.a.getIntVolatile(q0dVar, q0d.d) != 0) {
                            intVolatile2--;
                            aib c = q0dVar.c(intVolatile2, true);
                            if (c != null) {
                                aibVar = c;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aibVar == null) {
                        aib aibVar3 = (aib) jy2Var.f.d();
                        if (aibVar3 == null) {
                            return i(1);
                        }
                        return aibVar3;
                    }
                    return aibVar;
                }
            } while (!jy2.r.compareAndSet(jy2Var, j, j - 4398046511104L));
            this.c = iy2Var2;
        }
        if (z) {
            if (d(jy2Var.a << 1) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            q0dVar.getClass();
            aib aibVar4 = (aib) fy.a(q0dVar, q0d.f, null);
            if (aibVar4 == null) {
                aibVar4 = q0dVar.b();
            }
            if (aibVar4 != null) {
                return aibVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            aib e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i5 & i6;
        }
        return (i5 & Integer.MAX_VALUE) % i;
    }

    public final aib e() {
        int d = d(2);
        jy2 jy2Var = this.n;
        yz4 yz4Var = jy2Var.f;
        yz4 yz4Var2 = jy2Var.e;
        if (d == 0) {
            aib aibVar = (aib) yz4Var2.d();
            if (aibVar != null) {
                return aibVar;
            }
            return (aib) yz4Var.d();
        }
        aib aibVar2 = (aib) yz4Var.d();
        if (aibVar2 != null) {
            return aibVar2;
        }
        return (aib) yz4Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.d);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(iy2 iy2Var) {
        boolean z;
        iy2 iy2Var2 = this.c;
        if (iy2Var2 == iy2.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jy2.r.addAndGet(this.n, 4398046511104L);
        }
        if (iy2Var2 != iy2Var) {
            this.c = iy2Var;
        }
        return z;
    }

    public final aib i(int i) {
        int i2;
        long j;
        boolean z;
        aib aibVar;
        long j2;
        long j3;
        int i3;
        Unsafe unsafe;
        int i4 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = jy2.r;
        jy2 jy2Var = this.n;
        int i5 = (int) (atomicLongFieldUpdater.get(jy2Var) & 2097151);
        aib aibVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int d = d(i5);
        int i6 = 0;
        long j4 = Long.MAX_VALUE;
        while (i6 < i5) {
            d++;
            if (d > i5) {
                d = 1;
            }
            hy2 hy2Var = (hy2) jy2Var.h.b(d);
            if (hy2Var != null && hy2Var != this) {
                q0d q0dVar = hy2Var.a;
                if (i4 == 3) {
                    aibVar = q0dVar.b();
                    i2 = i5;
                    j = 0;
                } else {
                    q0dVar.getClass();
                    Unsafe unsafe2 = fy.a;
                    int intVolatile = unsafe2.getIntVolatile(q0dVar, q0d.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(q0dVar, q0d.g);
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i5;
                                if (fy.a.getIntVolatile(q0dVar, q0d.d) == 0) {
                                    break;
                                }
                            } else {
                                i2 = i5;
                            }
                            int i7 = intVolatile + 1;
                            aib c = q0dVar.c(intVolatile, z);
                            if (c == null) {
                                intVolatile = i7;
                                i5 = i2;
                            } else {
                                aibVar = c;
                                break;
                            }
                        } else {
                            i2 = i5;
                            break;
                        }
                    }
                    aibVar = aibVar2;
                }
                e79 e79Var = this.b;
                if (aibVar != null) {
                    e79Var.a = aibVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = q0d.f;
                    while (true) {
                        aib aibVar3 = (aib) fy.a.getObjectVolatile(q0dVar, j5);
                        if (aibVar3 == null) {
                            break;
                        }
                        if (aibVar3.b) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        if ((i3 & i) == 0) {
                            break;
                        }
                        eib.f.getClass();
                        q0d q0dVar2 = q0dVar;
                        long nanoTime = System.nanoTime() - aibVar3.a;
                        long j6 = eib.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = fy.a;
                            if (unsafe.compareAndSwapObject(q0dVar2, q0d.f, aibVar3, (Object) null)) {
                                e79Var.a = aibVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(q0dVar2, j5) == aibVar3);
                        q0dVar = q0dVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    aib aibVar4 = (aib) e79Var.a;
                    e79Var.a = null;
                    return aibVar4;
                } else if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            } else {
                i2 = i5;
            }
            i6++;
            i4 = i;
            i5 = i2;
            aibVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy2.run():void");
    }
}
