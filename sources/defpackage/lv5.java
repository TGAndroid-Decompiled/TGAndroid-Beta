package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;
public final class lv5 implements hp5 {
    public static final long b;
    public static final long c;
    public static final long d;
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;
    public final qm7 a;

    static {
        Unsafe unsafe = fx.a;
        c = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public lv5(qm7 qm7Var, Throwable th) {
        this.a = qm7Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            fx.a.putObjectVolatile(this, d, th);
        } else if (th != c2) {
            Unsafe unsafe = fx.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, th);
            } else if (objectVolatile instanceof Throwable) {
                if (th == objectVolatile) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(objectVolatile);
                arrayList.add(th);
                unsafe.putObjectVolatile(this, j, arrayList);
            } else if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
            } else {
                lq5.i(objectVolatile, "State is ");
            }
        }
    }

    @Override
    public final qm7 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) fx.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (fx.a.getIntVolatile(this, c) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = fx.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else if (objectVolatile instanceof ArrayList) {
            arrayList = (ArrayList) objectVolatile;
        } else {
            lq5.i(objectVolatile, "State is ");
            return null;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, yed.e);
        return arrayList;
    }

    @Override
    public final boolean isActive() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + fx.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
