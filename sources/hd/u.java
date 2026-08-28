package hd;
public final class u {
    public final Object f10487a;
    public final k f10488b;
    public final zc.l f10489c;
    public final Object d;
    public final Throwable f10490e;

    public u(Object obj, k kVar, zc.l lVar, Object obj2, Throwable th) {
        this.f10487a = obj;
        this.f10488b = kVar;
        this.f10489c = lVar;
        this.d = obj2;
        this.f10490e = th;
    }

    public static u a(u uVar, k kVar, Throwable th, int i9) {
        Object obj = uVar.f10487a;
        if ((i9 & 2) != 0) {
            kVar = uVar.f10488b;
        }
        k kVar2 = kVar;
        zc.l lVar = uVar.f10489c;
        Object obj2 = uVar.d;
        if ((i9 & 16) != 0) {
            th = uVar.f10490e;
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
        if (kotlin.jvm.internal.i.a(this.f10487a, uVar.f10487a) && kotlin.jvm.internal.i.a(this.f10488b, uVar.f10488b) && kotlin.jvm.internal.i.a(this.f10489c, uVar.f10489c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.f10490e, uVar.f10490e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Object obj = this.f10487a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        k kVar = this.f10488b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        zc.l lVar = this.f10489c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th = this.f10490e;
        if (th != null) {
            i9 = th.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f10487a + ", cancelHandler=" + this.f10488b + ", onCancellation=" + this.f10489c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f10490e + ')';
    }

    public u(Object obj, k kVar, zc.l lVar, Throwable th, int i9) {
        this(obj, (i9 & 2) != 0 ? null : kVar, (i9 & 4) != 0 ? null : lVar, (Object) null, (i9 & 16) != 0 ? null : th);
    }
}
