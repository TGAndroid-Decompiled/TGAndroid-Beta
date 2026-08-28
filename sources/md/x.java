package md;

import hd.u0;
import hd.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class x {
    public static final AtomicIntegerFieldUpdater f17676b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;
    public u0[] f17677a;

    public final void a(u0 u0Var) {
        u0Var.e((v0) this);
        u0[] u0VarArr = this.f17677a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17676b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.f17677a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            u0VarArr = (u0[]) copyOf;
            this.f17677a = u0VarArr;
        }
        int i9 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i9 + 1);
        u0VarArr[i9] = u0Var;
        u0Var.f10492b = i9;
        e(i9);
    }

    public final u0 b() {
        u0 u0Var;
        synchronized (this) {
            u0[] u0VarArr = this.f17677a;
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
                d(u0Var.f10492b);
            }
        }
    }

    public final hd.u0 d(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: md.x.d(int):hd.u0");
    }

    public final void e(int i9) {
        while (i9 > 0) {
            u0[] u0VarArr = this.f17677a;
            kotlin.jvm.internal.i.b(u0VarArr);
            int i10 = (i9 - 1) / 2;
            u0 u0Var = u0VarArr[i10];
            kotlin.jvm.internal.i.b(u0Var);
            u0 u0Var2 = u0VarArr[i9];
            kotlin.jvm.internal.i.b(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            f(i9, i10);
            i9 = i10;
        }
    }

    public final void f(int i9, int i10) {
        u0[] u0VarArr = this.f17677a;
        kotlin.jvm.internal.i.b(u0VarArr);
        u0 u0Var = u0VarArr[i10];
        kotlin.jvm.internal.i.b(u0Var);
        u0 u0Var2 = u0VarArr[i9];
        kotlin.jvm.internal.i.b(u0Var2);
        u0VarArr[i9] = u0Var;
        u0VarArr[i10] = u0Var2;
        u0Var.f10492b = i9;
        u0Var2.f10492b = i10;
    }
}
