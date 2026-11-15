package org.telegram.messenger;
public final class w6 {
    public final int f27305a;
    public final long f27306b;

    public w6(long j3, int i7, long j10) {
        this.f27305a = i7;
        this.f27306b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27306b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
