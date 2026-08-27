package nd;

import id.u0;
import id.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class x {

    public static final AtomicIntegerFieldUpdater f18512b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;

    public u0[] f18513a;

    public final void a(u0 u0Var) {
        u0Var.e((v0) this);
        u0[] u0VarArr = this.f18513a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18512b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.f18513a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(...)");
            u0VarArr = (u0[]) objArrCopyOf;
            this.f18513a = u0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        u0VarArr[i10] = u0Var;
        u0Var.f11201b = i10;
        e(i10);
    }

    public final u0 b() {
        u0 u0Var;
        synchronized (this) {
            u0[] u0VarArr = this.f18513a;
            u0Var = u0VarArr != null ? u0VarArr[0] : null;
        }
        return u0Var;
    }

    public final void c(u0 u0Var) {
        synchronized (this) {
            if (u0Var.a() != null) {
                d(u0Var.f11201b);
            }
        }
    }

    public final u0 d(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f18513a;
        kotlin.jvm.internal.j.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18512b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            f(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                u0 u0Var = objArr2[i10];
                kotlin.jvm.internal.j.b(u0Var);
                Object obj2 = objArr2[i14];
                kotlin.jvm.internal.j.b(obj2);
                if (u0Var.compareTo(obj2) < 0) {
                    f(i10, i14);
                    e(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f18513a;
                        kotlin.jvm.internal.j.b(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            kotlin.jvm.internal.j.b(comparable3);
                            obj = objArr[i12];
                            kotlin.jvm.internal.j.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        kotlin.jvm.internal.j.b(comparable);
                        comparable2 = objArr[i13];
                        kotlin.jvm.internal.j.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        f(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f18513a;
                    kotlin.jvm.internal.j.b(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        kotlin.jvm.internal.j.b(comparable3);
                        obj = objArr[i12];
                        kotlin.jvm.internal.j.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    kotlin.jvm.internal.j.b(comparable);
                    comparable2 = objArr[i13];
                    kotlin.jvm.internal.j.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    f(i10, i13);
                    i10 = i13;
                }
            }
        }
        u0 u0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.j.b(u0Var2);
        u0Var2.e(null);
        u0Var2.f11201b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return u0Var2;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            u0[] u0VarArr = this.f18513a;
            kotlin.jvm.internal.j.b(u0VarArr);
            int i11 = (i10 - 1) / 2;
            u0 u0Var = u0VarArr[i11];
            kotlin.jvm.internal.j.b(u0Var);
            u0 u0Var2 = u0VarArr[i10];
            kotlin.jvm.internal.j.b(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        u0[] u0VarArr = this.f18513a;
        kotlin.jvm.internal.j.b(u0VarArr);
        u0 u0Var = u0VarArr[i11];
        kotlin.jvm.internal.j.b(u0Var);
        u0 u0Var2 = u0VarArr[i10];
        kotlin.jvm.internal.j.b(u0Var2);
        u0VarArr[i10] = u0Var;
        u0VarArr[i11] = u0Var2;
        u0Var.f11201b = i10;
        u0Var2.f11201b = i11;
    }
}
