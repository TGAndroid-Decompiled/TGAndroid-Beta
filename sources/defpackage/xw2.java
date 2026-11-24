package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public final class xw2 extends Thread {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(xw2.class, "workerCtl$volatile");
    public static final long s = ex.a.objectFieldOffset(xw2.class.getDeclaredField("workerCtl$volatile"));
    public final pyc a;
    public final c59 b;
    public yw2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final zw2 n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public xw2(zw2 zw2Var, int i) {
        this.n = zw2Var;
        setDaemon(true);
        setContextClassLoader(zw2.class.getClassLoader());
        this.a = new pyc();
        this.b = new Object();
        this.c = yw2.d;
        this.nextParkedWorker = zw2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final zfb a(boolean z) {
        zfb e;
        zfb e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        yw2 yw2Var = this.c;
        zw2 zw2Var = this.n;
        zfb zfbVar = null;
        boolean z2 = true;
        pyc pycVar = this.a;
        yw2 yw2Var2 = yw2.a;
        if (yw2Var != yw2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zw2.r;
            do {
                j = atomicLongFieldUpdater.get(zw2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    pycVar.getClass();
                    long j2 = pyc.f;
                    loop1: while (true) {
                        unsafe = ex.a;
                        zfb zfbVar2 = (zfb) unsafe.getObjectVolatile(pycVar, j2);
                        if (zfbVar2 == null || !zfbVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = ex.a;
                            if (unsafe2.compareAndSwapObject(pycVar, pyc.f, zfbVar2, (Object) null)) {
                                zfbVar = zfbVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(pycVar, j2) == zfbVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(pycVar, pyc.e);
                    int intVolatile2 = unsafe.getIntVolatile(pycVar, pyc.g);
                    while (true) {
                        if (intVolatile != intVolatile2 && ex.a.getIntVolatile(pycVar, pyc.d) != 0) {
                            intVolatile2--;
                            zfb c = pycVar.c(intVolatile2, true);
                            if (c != null) {
                                zfbVar = c;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (zfbVar == null) {
                        zfb zfbVar3 = (zfb) zw2Var.f.d();
                        if (zfbVar3 == null) {
                            return i(1);
                        }
                        return zfbVar3;
                    }
                    return zfbVar;
                }
            } while (!zw2.r.compareAndSet(zw2Var, j, j - 4398046511104L));
            this.c = yw2Var2;
        }
        if (z) {
            if (d(zw2Var.a << 1) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            pycVar.getClass();
            zfb zfbVar4 = (zfb) ex.a(pycVar, pyc.f, null);
            if (zfbVar4 == null) {
                zfbVar4 = pycVar.b();
            }
            if (zfbVar4 != null) {
                return zfbVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            zfb e3 = e();
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

    public final zfb e() {
        int d = d(2);
        zw2 zw2Var = this.n;
        wx4 wx4Var = zw2Var.f;
        wx4 wx4Var2 = zw2Var.e;
        if (d == 0) {
            zfb zfbVar = (zfb) wx4Var2.d();
            if (zfbVar != null) {
                return zfbVar;
            }
            return (zfb) wx4Var.d();
        }
        zfb zfbVar2 = (zfb) wx4Var.d();
        if (zfbVar2 != null) {
            return zfbVar2;
        }
        return (zfb) wx4Var2.d();
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

    public final boolean h(yw2 yw2Var) {
        boolean z;
        yw2 yw2Var2 = this.c;
        if (yw2Var2 == yw2.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            zw2.r.addAndGet(this.n, 4398046511104L);
        }
        if (yw2Var2 != yw2Var) {
            this.c = yw2Var;
        }
        return z;
    }

    public final zfb i(int i) {
        int i2;
        long j;
        boolean z;
        zfb zfbVar;
        long j2;
        long j3;
        int i3;
        Unsafe unsafe;
        int i4 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zw2.r;
        zw2 zw2Var = this.n;
        int i5 = (int) (atomicLongFieldUpdater.get(zw2Var) & 2097151);
        zfb zfbVar2 = null;
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
            xw2 xw2Var = (xw2) zw2Var.h.b(d);
            if (xw2Var != null && xw2Var != this) {
                pyc pycVar = xw2Var.a;
                if (i4 == 3) {
                    zfbVar = pycVar.b();
                    i2 = i5;
                    j = 0;
                } else {
                    pycVar.getClass();
                    Unsafe unsafe2 = ex.a;
                    int intVolatile = unsafe2.getIntVolatile(pycVar, pyc.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(pycVar, pyc.g);
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i5;
                                if (ex.a.getIntVolatile(pycVar, pyc.d) == 0) {
                                    break;
                                }
                            } else {
                                i2 = i5;
                            }
                            int i7 = intVolatile + 1;
                            zfb c = pycVar.c(intVolatile, z);
                            if (c == null) {
                                intVolatile = i7;
                                i5 = i2;
                            } else {
                                zfbVar = c;
                                break;
                            }
                        } else {
                            i2 = i5;
                            break;
                        }
                    }
                    zfbVar = zfbVar2;
                }
                c59 c59Var = this.b;
                if (zfbVar != null) {
                    c59Var.a = zfbVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = pyc.f;
                    while (true) {
                        zfb zfbVar3 = (zfb) ex.a.getObjectVolatile(pycVar, j5);
                        if (zfbVar3 == null) {
                            break;
                        }
                        if (zfbVar3.b) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        if ((i3 & i) == 0) {
                            break;
                        }
                        dgb.f.getClass();
                        pyc pycVar2 = pycVar;
                        long nanoTime = System.nanoTime() - zfbVar3.a;
                        long j6 = dgb.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = ex.a;
                            if (unsafe.compareAndSwapObject(pycVar2, pyc.f, zfbVar3, (Object) null)) {
                                c59Var.a = zfbVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(pycVar2, j5) == zfbVar3);
                        pycVar = pycVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    zfb zfbVar4 = (zfb) c59Var.a;
                    c59Var.a = null;
                    return zfbVar4;
                } else if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            } else {
                i2 = i5;
            }
            i6++;
            i4 = i;
            i5 = i2;
            zfbVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw2.run():void");
    }
}
