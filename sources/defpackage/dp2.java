package defpackage;

import java.util.concurrent.CancellationException;
public final class dp2 {
    public final Object a;
    public final ja1 b;
    public final gq4 c;
    public final Object d;
    public final Throwable e;

    public dp2(java.lang.Object r3, defpackage.ja1 r4, defpackage.gq4 r5, java.util.concurrent.CancellationException r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp2.<init>(java.lang.Object, ja1, gq4, java.util.concurrent.CancellationException, int):void");
    }

    public static dp2 a(dp2 dp2Var, ja1 ja1Var, CancellationException cancellationException, int i) {
        Object obj = dp2Var.a;
        if ((i & 2) != 0) {
            ja1Var = dp2Var.b;
        }
        ja1 ja1Var2 = ja1Var;
        gq4 gq4Var = dp2Var.c;
        Object obj2 = dp2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = dp2Var.e;
        }
        return new dp2(obj, ja1Var2, gq4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp2)) {
            return false;
        }
        dp2 dp2Var = (dp2) obj;
        if (rp5.a(this.a, dp2Var.a) && rp5.a(this.b, dp2Var.b) && rp5.a(this.c, dp2Var.c) && rp5.a(this.d, dp2Var.d) && rp5.a(this.e, dp2Var.e)) {
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
        ja1 ja1Var = this.b;
        if (ja1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ja1Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        gq4 gq4Var = this.c;
        if (gq4Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gq4Var.hashCode();
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

    public dp2(Object obj, ja1 ja1Var, gq4 gq4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ja1Var;
        this.c = gq4Var;
        this.d = obj2;
        this.e = th;
    }
}
