package a9;
public final class w {
    public final int f353a;
    public final long f354b;

    public w(int i10, long j3) {
        this.f353a = i10;
        this.f354b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (this.f353a == wVar.f353a && this.f354b == wVar.f354b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f354b;
        return ((this.f353a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f353a);
        sb2.append(", eventTimestamp=");
        return a4.a.r(sb2, this.f354b, "}");
    }
}
