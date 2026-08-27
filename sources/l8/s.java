package l8;

public final class s {

    public final int f15485a;

    public final long f15486b;

    public s(int i10, long j10) {
        this.f15485a = i10;
        this.f15486b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f15485a == sVar.f15485a && this.f15486b == sVar.f15486b;
    }

    public final int hashCode() {
        long j10 = this.f15486b;
        return ((this.f15485a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f15485a);
        sb2.append(", eventTimestamp=");
        return a9.p.o(sb2, this.f15486b, "}");
    }
}
