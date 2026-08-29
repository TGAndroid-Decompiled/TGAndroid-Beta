package jd;
public final class u {
    public final Object f11524a;
    public final k f11525b;
    public final bd.l f11526c;
    public final Object d;
    public final Throwable f11527e;

    public u(Object obj, k kVar, bd.l lVar, Object obj2, Throwable th2) {
        this.f11524a = obj;
        this.f11525b = kVar;
        this.f11526c = lVar;
        this.d = obj2;
        this.f11527e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f11524a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f11525b;
        }
        k kVar2 = kVar;
        bd.l lVar = uVar.f11526c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f11527e;
        }
        return new u(obj, kVar2, lVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (kotlin.jvm.internal.j.a(this.f11524a, uVar.f11524a) && kotlin.jvm.internal.j.a(this.f11525b, uVar.f11525b) && kotlin.jvm.internal.j.a(this.f11526c, uVar.f11526c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f11527e, uVar.f11527e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        Object obj = this.f11524a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f11525b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        bd.l lVar = this.f11526c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Throwable th2 = this.f11527e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f11524a + ", cancelHandler=" + this.f11525b + ", onCancellation=" + this.f11526c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f11527e + ')';
    }

    public u(Object obj, k kVar, bd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
