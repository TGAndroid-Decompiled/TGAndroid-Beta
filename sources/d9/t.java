package d9;

import a8.p0;
public final class t {
    public final int f8255a;
    public final long f8256b;

    public t(int i7, long j3) {
        this.f8255a = i7;
        this.f8256b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (this.f8255a == tVar.f8255a && this.f8256b == tVar.f8256b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j3 = this.f8256b;
        return ((this.f8255a ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f8255a);
        sb2.append(", eventTimestamp=");
        return p0.r(sb2, this.f8256b, "}");
    }
}
