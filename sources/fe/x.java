package fe;

import ae.v0;
import ae.w0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class x {
    public static final AtomicIntegerFieldUpdater f9921b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;
    public v0[] f9922a;

    public final void a(v0 v0Var) {
        v0Var.e((w0) this);
        v0[] v0VarArr = this.f9922a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9921b;
        if (v0VarArr == null) {
            v0VarArr = new v0[4];
            this.f9922a = v0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= v0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(v0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            v0VarArr = (v0[]) copyOf;
            this.f9922a = v0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        v0VarArr[i10] = v0Var;
        v0Var.f511b = i10;
        e(i10);
    }

    public final v0 b() {
        v0 v0Var;
        synchronized (this) {
            v0[] v0VarArr = this.f9922a;
            if (v0VarArr != null) {
                v0Var = v0VarArr[0];
            } else {
                v0Var = null;
            }
        }
        return v0Var;
    }

    public final void c(v0 v0Var) {
        synchronized (this) {
            if (v0Var.a() != null) {
                d(v0Var.f511b);
            }
        }
    }

    public final ae.v0 d(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: fe.x.d(int):ae.v0");
    }

    public final void e(int i10) {
        while (i10 > 0) {
            v0[] v0VarArr = this.f9922a;
            kotlin.jvm.internal.i.b(v0VarArr);
            int i11 = (i10 - 1) / 2;
            v0 v0Var = v0VarArr[i11];
            kotlin.jvm.internal.i.b(v0Var);
            v0 v0Var2 = v0VarArr[i10];
            kotlin.jvm.internal.i.b(v0Var2);
            if (v0Var.compareTo(v0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        v0[] v0VarArr = this.f9922a;
        kotlin.jvm.internal.i.b(v0VarArr);
        v0 v0Var = v0VarArr[i11];
        kotlin.jvm.internal.i.b(v0Var);
        v0 v0Var2 = v0VarArr[i10];
        kotlin.jvm.internal.i.b(v0Var2);
        v0VarArr[i10] = v0Var;
        v0VarArr[i11] = v0Var2;
        v0Var.f511b = i10;
        v0Var2.f511b = i11;
    }
}
