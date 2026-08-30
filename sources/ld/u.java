package ld;
public final class u {
    public final Object f11923a;
    public final k f11924b;
    public final dd.l f11925c;
    public final Object d;
    public final Throwable e;

    public u(Object obj, k kVar, dd.l lVar, Object obj2, Throwable th2) {
        this.f11923a = obj;
        this.f11924b = kVar;
        this.f11925c = lVar;
        this.d = obj2;
        this.e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f11923a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f11924b;
        }
        k kVar2 = kVar;
        dd.l lVar = uVar.f11925c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.e;
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
        if (kotlin.jvm.internal.j.a(this.f11923a, uVar.f11923a) && kotlin.jvm.internal.j.a(this.f11924b, uVar.f11924b) && kotlin.jvm.internal.j.a(this.f11925c, uVar.f11925c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.e, uVar.e)) {
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
        Object obj = this.f11923a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f11924b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        dd.l lVar = this.f11925c;
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
        Throwable th2 = this.e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f11923a + ", cancelHandler=" + this.f11924b + ", onCancellation=" + this.f11925c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public u(Object obj, k kVar, dd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
