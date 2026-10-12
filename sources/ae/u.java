package ae;
public final class u {
    public final Object f504a;
    public final k f505b;
    public final sd.l f506c;
    public final Object d;
    public final Throwable f507e;

    public u(Object obj, k kVar, sd.l lVar, Object obj2, Throwable th2) {
        this.f504a = obj;
        this.f505b = kVar;
        this.f506c = lVar;
        this.d = obj2;
        this.f507e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f504a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f505b;
        }
        k kVar2 = kVar;
        sd.l lVar = uVar.f506c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f507e;
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
        if (kotlin.jvm.internal.i.a(this.f504a, uVar.f504a) && kotlin.jvm.internal.i.a(this.f505b, uVar.f505b) && kotlin.jvm.internal.i.a(this.f506c, uVar.f506c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.f507e, uVar.f507e)) {
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
        Object obj = this.f504a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f505b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        sd.l lVar = this.f506c;
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
        Throwable th2 = this.f507e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f504a + ", cancelHandler=" + this.f505b + ", onCancellation=" + this.f506c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f507e + ')';
    }

    public u(Object obj, k kVar, sd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
