package be;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wd.q0;
import wd.r0;
public class v {
    public static final AtomicIntegerFieldUpdater f3287b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile int _size$volatile;
    public q0[] f3288a;

    public final void a(q0 q0Var) {
        q0Var.e((r0) this);
        q0[] q0VarArr = this.f3288a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3287b;
        if (q0VarArr == null) {
            q0VarArr = new q0[4];
            this.f3288a = q0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= q0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(q0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            q0VarArr = (q0[]) copyOf;
            this.f3288a = q0VarArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        q0VarArr[i3] = q0Var;
        q0Var.f57528b = i3;
        d(i3);
    }

    public final void b(q0 q0Var) {
        synchronized (this) {
            if (q0Var.b() != null) {
                c(q0Var.f57528b);
            }
        }
    }

    public final wd.q0 c(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: be.v.c(int):wd.q0");
    }

    public final void d(int i3) {
        while (i3 > 0) {
            q0[] q0VarArr = this.f3288a;
            kotlin.jvm.internal.j.b(q0VarArr);
            int i10 = (i3 - 1) / 2;
            q0 q0Var = q0VarArr[i10];
            kotlin.jvm.internal.j.b(q0Var);
            q0 q0Var2 = q0VarArr[i3];
            kotlin.jvm.internal.j.b(q0Var2);
            if (q0Var.compareTo(q0Var2) <= 0) {
                return;
            }
            e(i3, i10);
            i3 = i10;
        }
    }

    public final void e(int i3, int i10) {
        q0[] q0VarArr = this.f3288a;
        kotlin.jvm.internal.j.b(q0VarArr);
        q0 q0Var = q0VarArr[i10];
        kotlin.jvm.internal.j.b(q0Var);
        q0 q0Var2 = q0VarArr[i3];
        kotlin.jvm.internal.j.b(q0Var2);
        q0VarArr[i3] = q0Var;
        q0VarArr[i10] = q0Var2;
        q0Var.f57528b = i3;
        q0Var2.f57528b = i10;
    }
}
