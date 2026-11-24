package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;
public final class hwa implements hk4, rq4, ik4 {
    public static final long e = ex.a.objectFieldOffset(hwa.class.getDeclaredField("_state$volatile"));
    private volatile Object _state$volatile;
    public iwa[] a;
    public int b;
    public int c;
    public int d;

    public hwa(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final hk4 C(int i, o01 o01Var) {
        if ((((i >= 0 && i < 2) || i == -2) && o01Var == o01.b) || ((i == 0 || i == -3) && o01Var == o01.a)) {
            return this;
        }
        return new bi1(this, z14.a, i, o01Var, (byte) 1);
    }

    public final void a(iwa iwaVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            iwaVar.getClass();
            iwaVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = zad.a;
        }
        d(null, obj);
    }

    @Override
    public final Object c(Object obj, fw2 fw2Var) {
        b(obj);
        return g5c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        iwa[] iwaVarArr;
        lo5 lo5Var;
        synchronized (this) {
            Unsafe unsafe = ex.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !rp5.a(objectVolatile, obj)) {
                return false;
            }
            if (rp5.a(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.d = i3;
                iwa[] iwaVarArr2 = this.a;
                while (true) {
                    if (iwaVarArr2 != null) {
                        for (iwa iwaVar : iwaVarArr2) {
                            if (iwaVar != null) {
                                AtomicReference atomicReference = iwaVar.a;
                                while (true) {
                                    Object obj3 = atomicReference.get();
                                    if (obj3 != null && obj3 != (lo5Var = ddd.b)) {
                                        lo5 lo5Var2 = ddd.a;
                                        if (obj3 == lo5Var2) {
                                            while (!atomicReference.compareAndSet(obj3, lo5Var)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj3, lo5Var2)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                            ((na1) obj3).resumeWith(g5c.a);
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
                        iwaVarArr = this.a;
                    }
                    iwaVarArr2 = iwaVarArr;
                    i3 = i;
                }
            } else {
                this.d = i2 + 2;
                return true;
            }
        }
    }

    @Override
    public final java.lang.Object h(defpackage.ik4 r14, defpackage.fw2 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwa.h(ik4, fw2):java.lang.Object");
    }
}
