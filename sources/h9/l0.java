package h9;

public final class l0 extends a2 {

    public final long f8756a;

    public final String f8757b;

    public final u1 f8758c;
    public final v1 d;

    public final w1 f8759e;

    public final z1 f8760f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f8756a = j10;
        this.f8757b = str;
        this.f8758c = u1Var;
        this.d = v1Var;
        this.f8759e = w1Var;
        this.f8760f = z1Var;
    }

    public final com.google.firebase.messaging.m a() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f4602a = Long.valueOf(this.f8756a);
        mVar.f4603b = this.f8757b;
        mVar.f4604c = this.f8758c;
        mVar.d = this.d;
        mVar.f4605e = this.f8759e;
        mVar.f4606f = this.f8760f;
        return mVar;
    }

    public final boolean equals(Object obj) {
        w1 w1Var;
        z1 z1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            l0 l0Var = (l0) ((a2) obj);
            z1 z1Var2 = l0Var.f8760f;
            w1 w1Var2 = l0Var.f8759e;
            if (this.f8756a == l0Var.f8756a && this.f8757b.equals(l0Var.f8757b) && this.f8758c.equals(l0Var.f8758c) && this.d.equals(l0Var.d) && ((w1Var = this.f8759e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f8760f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8756a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8757b.hashCode()) * 1000003) ^ this.f8758c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        w1 w1Var = this.f8759e;
        int iHashCode2 = (iHashCode ^ (w1Var == null ? 0 : w1Var.hashCode())) * 1000003;
        z1 z1Var = this.f8760f;
        return iHashCode2 ^ (z1Var != null ? z1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8756a + ", type=" + this.f8757b + ", app=" + this.f8758c + ", device=" + this.d + ", log=" + this.f8759e + ", rollouts=" + this.f8760f + "}";
    }
}
