package ee;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.q0;
import zd.r0;
public class u {
    public static final AtomicIntegerFieldUpdater f10797b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile int _size$volatile;
    public q0[] f10798a;

    public final void a(q0 q0Var) {
        q0Var.d((r0) this);
        q0[] q0VarArr = this.f10798a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10797b;
        if (q0VarArr == null) {
            q0VarArr = new q0[4];
            this.f10798a = q0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= q0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(q0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            q0VarArr = (q0[]) copyOf;
            this.f10798a = q0VarArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        q0VarArr[i7] = q0Var;
        q0Var.f60118b = i7;
        d(i7);
    }

    public final void b(q0 q0Var) {
        synchronized (this) {
            if (q0Var.b() != null) {
                c(q0Var.f60118b);
            }
        }
    }

    public final zd.q0 c(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ee.u.c(int):zd.q0");
    }

    public final void d(int i7) {
        while (i7 > 0) {
            q0[] q0VarArr = this.f10798a;
            kotlin.jvm.internal.j.b(q0VarArr);
            int i10 = (i7 - 1) / 2;
            q0 q0Var = q0VarArr[i10];
            kotlin.jvm.internal.j.b(q0Var);
            q0 q0Var2 = q0VarArr[i7];
            kotlin.jvm.internal.j.b(q0Var2);
            if (q0Var.compareTo(q0Var2) <= 0) {
                return;
            }
            e(i7, i10);
            i7 = i10;
        }
    }

    public final void e(int i7, int i10) {
        q0[] q0VarArr = this.f10798a;
        kotlin.jvm.internal.j.b(q0VarArr);
        q0 q0Var = q0VarArr[i10];
        kotlin.jvm.internal.j.b(q0Var);
        q0 q0Var2 = q0VarArr[i7];
        kotlin.jvm.internal.j.b(q0Var2);
        q0VarArr[i7] = q0Var;
        q0VarArr[i10] = q0Var2;
        q0Var.f60118b = i7;
        q0Var2.f60118b = i10;
    }
}
