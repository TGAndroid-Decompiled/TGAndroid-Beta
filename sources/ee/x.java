package ee;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.t0;
import zd.u0;
public class x {
    public static final AtomicIntegerFieldUpdater f9126b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;
    public t0[] f9127a;

    public final void a(t0 t0Var) {
        t0Var.e((u0) this);
        t0[] t0VarArr = this.f9127a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9126b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f9127a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            t0VarArr = (t0[]) copyOf;
            this.f9127a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.f51628b = i10;
        e(i10);
    }

    public final t0 b() {
        t0 t0Var;
        synchronized (this) {
            t0[] t0VarArr = this.f9127a;
            if (t0VarArr != null) {
                t0Var = t0VarArr[0];
            } else {
                t0Var = null;
            }
        }
        return t0Var;
    }

    public final void c(t0 t0Var) {
        synchronized (this) {
            if (t0Var.a() != null) {
                d(t0Var.f51628b);
            }
        }
    }

    public final zd.t0 d(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ee.x.d(int):zd.t0");
    }

    public final void e(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.f9127a;
            kotlin.jvm.internal.i.b(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            kotlin.jvm.internal.i.b(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            kotlin.jvm.internal.i.b(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        t0[] t0VarArr = this.f9127a;
        kotlin.jvm.internal.i.b(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        kotlin.jvm.internal.i.b(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        kotlin.jvm.internal.i.b(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.f51628b = i10;
        t0Var2.f51628b = i11;
    }
}
