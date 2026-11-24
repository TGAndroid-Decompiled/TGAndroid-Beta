package defpackage;
public final class q90 {
    public static final q90 f = new q90(10485760, 200, 10000, 81920, 604800000);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public q90(long j, int i, int i2, int i3, long j2) {
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
        if (obj instanceof q90) {
            q90 q90Var = (q90) obj;
            if (this.a == q90Var.a && this.b == q90Var.b && this.c == q90Var.c && this.d == q90Var.d && this.e == q90Var.e) {
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
        return de9.l(sb, this.e, "}");
    }
}
