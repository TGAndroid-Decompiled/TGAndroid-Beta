package defpackage;

import java.util.concurrent.CancellationException;
public final class oq2 {
    public final Object a;
    public final rb1 b;
    public final hs4 c;
    public final Object d;
    public final Throwable e;

    public oq2(java.lang.Object r3, defpackage.rb1 r4, defpackage.hs4 r5, java.util.concurrent.CancellationException r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq2.<init>(java.lang.Object, rb1, hs4, java.util.concurrent.CancellationException, int):void");
    }

    public static oq2 a(oq2 oq2Var, rb1 rb1Var, CancellationException cancellationException, int i) {
        Object obj = oq2Var.a;
        if ((i & 2) != 0) {
            rb1Var = oq2Var.b;
        }
        rb1 rb1Var2 = rb1Var;
        hs4 hs4Var = oq2Var.c;
        Object obj2 = oq2Var.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = oq2Var.e;
        }
        return new oq2(obj, rb1Var2, hs4Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq2)) {
            return false;
        }
        oq2 oq2Var = (oq2) obj;
        if (rr5.a(this.a, oq2Var.a) && rr5.a(this.b, oq2Var.b) && rr5.a(this.c, oq2Var.c) && rr5.a(this.d, oq2Var.d) && rr5.a(this.e, oq2Var.e)) {
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
        rb1 rb1Var = this.b;
        if (rb1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rb1Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        hs4 hs4Var = this.c;
        if (hs4Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hs4Var.hashCode();
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

    public oq2(Object obj, rb1 rb1Var, hs4 hs4Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = rb1Var;
        this.c = hs4Var;
        this.d = obj2;
        this.e = th;
    }
}
