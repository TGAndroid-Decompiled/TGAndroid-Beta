package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public final class rx2 extends Thread {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(rx2.class, "workerCtl$volatile");
    public static final long s = fx.a.objectFieldOffset(rx2.class.getDeclaredField("workerCtl$volatile"));
    public final f3d a;
    public final p89 b;
    public sx2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final tx2 n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public rx2(tx2 tx2Var, int i) {
        this.n = tx2Var;
        setDaemon(true);
        setContextClassLoader(tx2.class.getClassLoader());
        this.a = new f3d();
        this.b = new Object();
        this.c = sx2.d;
        this.nextParkedWorker = tx2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final vjb a(boolean z) {
        vjb e;
        vjb e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        sx2 sx2Var = this.c;
        tx2 tx2Var = this.n;
        vjb vjbVar = null;
        boolean z2 = true;
        f3d f3dVar = this.a;
        sx2 sx2Var2 = sx2.a;
        if (sx2Var != sx2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = tx2.r;
            do {
                j = atomicLongFieldUpdater.get(tx2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    f3dVar.getClass();
                    long j2 = f3d.f;
                    loop1: while (true) {
                        unsafe = fx.a;
                        vjb vjbVar2 = (vjb) unsafe.getObjectVolatile(f3dVar, j2);
                        if (vjbVar2 == null || !vjbVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = fx.a;
                            if (unsafe2.compareAndSwapObject(f3dVar, f3d.f, vjbVar2, (Object) null)) {
                                vjbVar = vjbVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(f3dVar, j2) == vjbVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(f3dVar, f3d.e);
                    int intVolatile2 = unsafe.getIntVolatile(f3dVar, f3d.g);
                    while (true) {
                        if (intVolatile != intVolatile2 && fx.a.getIntVolatile(f3dVar, f3d.d) != 0) {
                            intVolatile2--;
                            vjb c = f3dVar.c(intVolatile2, true);
                            if (c != null) {
                                vjbVar = c;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (vjbVar == null) {
                        vjb vjbVar3 = (vjb) tx2Var.f.d();
                        if (vjbVar3 == null) {
                            return i(1);
                        }
                        return vjbVar3;
                    }
                    return vjbVar;
                }
            } while (!tx2.r.compareAndSet(tx2Var, j, j - 4398046511104L));
            this.c = sx2Var2;
        }
        if (z) {
            if (d(tx2Var.a << 1) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            f3dVar.getClass();
            vjb vjbVar4 = (vjb) fx.a(f3d.f, f3dVar, null);
            if (vjbVar4 == null) {
                vjbVar4 = f3dVar.b();
            }
            if (vjbVar4 != null) {
                return vjbVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            vjb e3 = e();
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

    public final vjb e() {
        int d = d(2);
        tx2 tx2Var = this.n;
        c05 c05Var = tx2Var.f;
        c05 c05Var2 = tx2Var.e;
        if (d == 0) {
            vjb vjbVar = (vjb) c05Var2.d();
            if (vjbVar != null) {
                return vjbVar;
            }
            return (vjb) c05Var.d();
        }
        vjb vjbVar2 = (vjb) c05Var.d();
        if (vjbVar2 != null) {
            return vjbVar2;
        }
        return (vjb) c05Var2.d();
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

    public final boolean h(sx2 sx2Var) {
        boolean z;
        sx2 sx2Var2 = this.c;
        if (sx2Var2 == sx2.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tx2.r.addAndGet(this.n, 4398046511104L);
        }
        if (sx2Var2 != sx2Var) {
            this.c = sx2Var;
        }
        return z;
    }

    public final vjb i(int i) {
        int i2;
        long j;
        boolean z;
        vjb vjbVar;
        long j2;
        long j3;
        int i3;
        Unsafe unsafe;
        int i4 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = tx2.r;
        tx2 tx2Var = this.n;
        int i5 = (int) (atomicLongFieldUpdater.get(tx2Var) & 2097151);
        vjb vjbVar2 = null;
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
            rx2 rx2Var = (rx2) tx2Var.h.b(d);
            if (rx2Var != null && rx2Var != this) {
                f3d f3dVar = rx2Var.a;
                if (i4 == 3) {
                    vjbVar = f3dVar.b();
                    i2 = i5;
                    j = 0;
                } else {
                    f3dVar.getClass();
                    Unsafe unsafe2 = fx.a;
                    int intVolatile = unsafe2.getIntVolatile(f3dVar, f3d.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(f3dVar, f3d.g);
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i2 = i5;
                                if (fx.a.getIntVolatile(f3dVar, f3d.d) == 0) {
                                    break;
                                }
                            } else {
                                i2 = i5;
                            }
                            int i7 = intVolatile + 1;
                            vjb c = f3dVar.c(intVolatile, z);
                            if (c == null) {
                                intVolatile = i7;
                                i5 = i2;
                            } else {
                                vjbVar = c;
                                break;
                            }
                        } else {
                            i2 = i5;
                            break;
                        }
                    }
                    vjbVar = vjbVar2;
                }
                p89 p89Var = this.b;
                if (vjbVar != null) {
                    p89Var.a = vjbVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = f3d.f;
                    while (true) {
                        vjb vjbVar3 = (vjb) fx.a.getObjectVolatile(f3dVar, j5);
                        if (vjbVar3 == null) {
                            break;
                        }
                        if (vjbVar3.b) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        if ((i3 & i) == 0) {
                            break;
                        }
                        zjb.f.getClass();
                        f3d f3dVar2 = f3dVar;
                        long nanoTime = System.nanoTime() - vjbVar3.a;
                        long j6 = zjb.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = fx.a;
                            if (unsafe.compareAndSwapObject(f3dVar2, f3d.f, vjbVar3, (Object) null)) {
                                p89Var.a = vjbVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(f3dVar2, j5) == vjbVar3);
                        f3dVar = f3dVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    vjb vjbVar4 = (vjb) p89Var.a;
                    p89Var.a = null;
                    return vjbVar4;
                } else if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            } else {
                i2 = i5;
            }
            i6++;
            i4 = i;
            i5 = i2;
            vjbVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx2.run():void");
    }
}
