package id;

public final class u {

    public final Object f11196a;

    public final k f11197b;

    public final ad.l f11198c;
    public final Object d;

    public final Throwable f11199e;

    public u(Object obj, k kVar, ad.l lVar, Object obj2, Throwable th) {
        this.f11196a = obj;
        this.f11197b = kVar;
        this.f11198c = lVar;
        this.d = obj2;
        this.f11199e = th;
    }

    public static u a(u uVar, k kVar, Throwable th, int i10) {
        Object obj = uVar.f11196a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f11197b;
        }
        k kVar2 = kVar;
        ad.l lVar = uVar.f11198c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th = uVar.f11199e;
        }
        return new u(obj, kVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.j.a(this.f11196a, uVar.f11196a) && kotlin.jvm.internal.j.a(this.f11197b, uVar.f11197b) && kotlin.jvm.internal.j.a(this.f11198c, uVar.f11198c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f11199e, uVar.f11199e);
    }

    public final int hashCode() {
        Object obj = this.f11196a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.f11197b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ad.l lVar = this.f11198c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f11199e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f11196a + ", cancelHandler=" + this.f11197b + ", onCancellation=" + this.f11198c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f11199e + ')';
    }

    public u(Object obj, k kVar, ad.l lVar, Throwable th, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th);
    }
}
