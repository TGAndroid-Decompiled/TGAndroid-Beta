package ge;

import be.u0;
import be.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class x {
    public static final AtomicIntegerFieldUpdater f11046b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;
    public u0[] f11047a;

    public final void a(u0 u0Var) {
        u0Var.d((v0) this);
        u0[] u0VarArr = this.f11047a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11046b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.f11047a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            u0VarArr = (u0[]) copyOf;
            this.f11047a = u0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        u0VarArr[i10] = u0Var;
        u0Var.f4327b = i10;
        e(i10);
    }

    public final u0 b() {
        u0 u0Var;
        synchronized (this) {
            u0[] u0VarArr = this.f11047a;
            if (u0VarArr != null) {
                u0Var = u0VarArr[0];
            } else {
                u0Var = null;
            }
        }
        return u0Var;
    }

    public final void c(u0 u0Var) {
        synchronized (this) {
            if (u0Var.a() != null) {
                d(u0Var.f4327b);
            }
        }
    }

    public final be.u0 d(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ge.x.d(int):be.u0");
    }

    public final void e(int i10) {
        while (i10 > 0) {
            u0[] u0VarArr = this.f11047a;
            kotlin.jvm.internal.i.b(u0VarArr);
            int i11 = (i10 - 1) / 2;
            u0 u0Var = u0VarArr[i11];
            kotlin.jvm.internal.i.b(u0Var);
            u0 u0Var2 = u0VarArr[i10];
            kotlin.jvm.internal.i.b(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        u0[] u0VarArr = this.f11047a;
        kotlin.jvm.internal.i.b(u0VarArr);
        u0 u0Var = u0VarArr[i11];
        kotlin.jvm.internal.i.b(u0Var);
        u0 u0Var2 = u0VarArr[i10];
        kotlin.jvm.internal.i.b(u0Var2);
        u0VarArr[i10] = u0Var;
        u0VarArr[i11] = u0Var2;
        u0Var.f4327b = i10;
        u0Var2.f4327b = i11;
    }
}
