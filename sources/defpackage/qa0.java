package defpackage;
public final class qa0 {
    public static final qa0 f = new qa0(10485760, 200, 10000, 81920, 604800000);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public qa0(long j, int i, int i2, int i3, long j2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qa0) {
            qa0 qa0Var = (qa0) obj;
            if (this.a == qa0Var.a && this.b == qa0Var.b && this.c == qa0Var.c && this.d == qa0Var.d && this.e == qa0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.d;
        return ((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return hg9.k(sb, this.e, "}");
    }
}
