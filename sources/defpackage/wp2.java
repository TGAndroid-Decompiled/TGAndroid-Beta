package defpackage;

import java.util.concurrent.CancellationException;
public final class wp2 {
    public final Object a;
    public final ra1 b;
    public final ks4 c;
    public final Object d;
    public final Throwable e;

    public wp2(java.lang.Object r3, defpackage.ra1 r4, defpackage.ks4 r5, java.util.concurrent.CancellationException r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp2.<init>(java.lang.Object, ra1, ks4, java.util.concurrent.CancellationException, int):void");
    }

    public static wp2 a(wp2 wp2Var, ra1 ra1Var, CancellationException cancellationException, int i) {
        Object obj = wp2Var.a;
        if ((i & 2) != 0) {
            ra1Var = wp2Var.b;
        }
        ra1 ra1Var2 = ra1Var;
        ks4 ks4Var = wp2Var.c;
        Object obj2 = wp2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = wp2Var.e;
        }
        return new wp2(obj, ra1Var2, ks4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp2)) {
            return false;
        }
        wp2 wp2Var = (wp2) obj;
        if (ur5.a(this.a, wp2Var.a) && ur5.a(this.b, wp2Var.b) && ur5.a(this.c, wp2Var.c) && ur5.a(this.d, wp2Var.d) && ur5.a(this.e, wp2Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        ra1 ra1Var = this.b;
        if (ra1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ra1Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ks4 ks4Var = this.c;
        if (ks4Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ks4Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public wp2(Object obj, ra1 ra1Var, ks4 ks4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ra1Var;
        this.c = ks4Var;
        this.d = obj2;
        this.e = th;
    }
}
