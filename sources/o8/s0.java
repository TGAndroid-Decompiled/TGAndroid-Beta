package o8;

import java.io.Serializable;
public final class s0 extends k0 implements Serializable {
    public final k0 f19086a;

    public s0(k0 k0Var) {
        this.f19086a = k0Var;
    }

    @Override
    public final k0 a() {
        return this.f19086a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f19086a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f19086a.equals(((s0) obj).f19086a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19086a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19086a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
