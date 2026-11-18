package org.telegram.messenger;
public final class w6 {
    public final int f27647a;
    public final long f27648b;

    public w6(long j3, int i7, long j10) {
        this.f27647a = i7;
        this.f27648b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27648b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
