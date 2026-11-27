package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;
public final class k0b implements mm4, vs4, nm4 {
    public static final long e = fx.a.objectFieldOffset(k0b.class.getDeclaredField("_state$volatile"));
    private volatile Object _state$volatile;
    public l0b[] a;
    public int b;
    public int c;
    public int d;

    public k0b(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final mm4 D(int i, x01 x01Var) {
        if ((((i >= 0 && i < 2) || i == -2) && x01Var == x01.b) || ((i == 0 || i == -3) && x01Var == x01.a)) {
            return this;
        }
        return new ji1(this, u24.a, i, x01Var, (byte) 1);
    }

    public final void a(l0b l0bVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            l0bVar.getClass();
            l0bVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = sfd.a;
        }
        d(null, obj);
    }

    @Override
    public final Object c(Object obj, zw2 zw2Var) {
        b(obj);
        return g9c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        l0b[] l0bVarArr;
        ow5 ow5Var;
        synchronized (this) {
            Unsafe unsafe = fx.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !ur5.a(objectVolatile, obj)) {
                return false;
            }
            if (ur5.a(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.d = i3;
                l0b[] l0bVarArr2 = this.a;
                while (true) {
                    if (l0bVarArr2 != null) {
                        for (l0b l0bVar : l0bVarArr2) {
                            if (l0bVar != null) {
                                AtomicReference atomicReference = l0bVar.a;
                                while (true) {
                                    Object obj3 = atomicReference.get();
                                    if (obj3 != null && obj3 != (ow5Var = whd.b)) {
                                        ow5 ow5Var2 = whd.a;
                                        if (obj3 == ow5Var2) {
                                            while (!atomicReference.compareAndSet(obj3, ow5Var)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj3, ow5Var2)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                            ((va1) obj3).resumeWith(g9c.a);
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
                        l0bVarArr = this.a;
                    }
                    l0bVarArr2 = l0bVarArr;
                    i3 = i;
                }
            } else {
                this.d = i2 + 2;
                return true;
            }
        }
    }

    @Override
    public final java.lang.Object k(defpackage.nm4 r14, defpackage.zw2 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0b.k(nm4, zw2):java.lang.Object");
    }
}
