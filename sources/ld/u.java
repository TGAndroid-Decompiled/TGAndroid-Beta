package ld;
public final class u {
    public final Object f12360a;
    public final k f12361b;
    public final dd.l f12362c;
    public final Object d;
    public final Throwable f12363e;

    public u(Object obj, k kVar, dd.l lVar, Object obj2, Throwable th2) {
        this.f12360a = obj;
        this.f12361b = kVar;
        this.f12362c = lVar;
        this.d = obj2;
        this.f12363e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f12360a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f12361b;
        }
        k kVar2 = kVar;
        dd.l lVar = uVar.f12362c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f12363e;
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
        if (kotlin.jvm.internal.j.a(this.f12360a, uVar.f12360a) && kotlin.jvm.internal.j.a(this.f12361b, uVar.f12361b) && kotlin.jvm.internal.j.a(this.f12362c, uVar.f12362c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f12363e, uVar.f12363e)) {
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
        Object obj = this.f12360a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f12361b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        dd.l lVar = this.f12362c;
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
        Throwable th2 = this.f12363e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f12360a + ", cancelHandler=" + this.f12361b + ", onCancellation=" + this.f12362c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f12363e + ')';
    }

    public u(Object obj, k kVar, dd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
