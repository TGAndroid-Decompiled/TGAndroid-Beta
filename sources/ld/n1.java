package ld;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n1 implements a1 {
    public static final AtomicIntegerFieldUpdater f12016b = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater f12017c = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_rootCause$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;
    public final v1 f12018a;

    public n1(v1 v1Var, Throwable th2) {
        this.f12018a = v1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable b10 = b();
        if (b10 == null) {
            f12017c.set(this, th2);
        } else if (th2 != b10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
            } else if (obj instanceof Throwable) {
                if (th2 == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th2);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable b() {
        return (Throwable) f12017c.get(this);
    }

    @Override
    public final v1 c() {
        return this.f12018a;
    }

    public final boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f12016b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th2 != null && !th2.equals(b10)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, e0.h);
        return arrayList;
    }

    @Override
    public final boolean isActive() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + d.get(this) + ", list=" + this.f12018a + ']';
    }
}
