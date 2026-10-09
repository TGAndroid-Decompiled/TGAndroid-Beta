package ae;
public final class u {
    public final Object f502a;
    public final k f503b;
    public final sd.l f504c;
    public final Object d;
    public final Throwable f505e;

    public u(Object obj, k kVar, sd.l lVar, Object obj2, Throwable th2) {
        this.f502a = obj;
        this.f503b = kVar;
        this.f504c = lVar;
        this.d = obj2;
        this.f505e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f502a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f503b;
        }
        k kVar2 = kVar;
        sd.l lVar = uVar.f504c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f505e;
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
        if (kotlin.jvm.internal.i.a(this.f502a, uVar.f502a) && kotlin.jvm.internal.i.a(this.f503b, uVar.f503b) && kotlin.jvm.internal.i.a(this.f504c, uVar.f504c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.f505e, uVar.f505e)) {
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
        Object obj = this.f502a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f503b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        sd.l lVar = this.f504c;
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
        Throwable th2 = this.f505e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f502a + ", cancelHandler=" + this.f503b + ", onCancellation=" + this.f504c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f505e + ')';
    }

    public u(Object obj, k kVar, sd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
