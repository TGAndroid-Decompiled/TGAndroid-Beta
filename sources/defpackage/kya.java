package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;
public final class kya implements im4, ss4, jm4 {
    public static final long e = fy.a.objectFieldOffset(kya.class.getDeclaredField("_state$volatile"));
    private volatile Object _state$volatile;
    public lya[] a;
    public int b;
    public int c;
    public int d;

    public kya(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final im4 D(int i, w11 w11Var) {
        if ((((i >= 0 && i < 2) || i == -2) && w11Var == w11.b) || ((i == 0 || i == -3) && w11Var == w11.a)) {
            return this;
        }
        return new ij1(this, k34.a, i, w11Var, (byte) 1);
    }

    public final void a(lya lyaVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            lyaVar.getClass();
            lyaVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = bdd.a;
        }
        d(null, obj);
    }

    @Override
    public final Object c(Object obj, px2 px2Var) {
        b(obj);
        return g7c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        lya[] lyaVarArr;
        du2 du2Var;
        synchronized (this) {
            Unsafe unsafe = fy.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !rr5.a(objectVolatile, obj)) {
                return false;
            }
            if (rr5.a(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.d = i3;
                lya[] lyaVarArr2 = this.a;
                while (true) {
                    if (lyaVarArr2 != null) {
                        for (lya lyaVar : lyaVarArr2) {
                            if (lyaVar != null) {
                                AtomicReference atomicReference = lyaVar.a;
                                while (true) {
                                    Object obj3 = atomicReference.get();
                                    if (obj3 != null && obj3 != (du2Var = ffd.b)) {
                                        du2 du2Var2 = ffd.a;
                                        if (obj3 == du2Var2) {
                                            while (!atomicReference.compareAndSet(obj3, du2Var)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj3, du2Var2)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                            ((vb1) obj3).resumeWith(g7c.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.d;
                        if (i == i3) {
                            this.d = i3 + 1;
                            return true;
                        }
                        lyaVarArr = this.a;
                    }
                    lyaVarArr2 = lyaVarArr;
                    i3 = i;
                }
            } else {
                this.d = i2 + 2;
                return true;
            }
        }
    }

    @Override
    public final java.lang.Object g(defpackage.jm4 r14, defpackage.px2 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kya.g(jm4, px2):java.lang.Object");
    }
}
