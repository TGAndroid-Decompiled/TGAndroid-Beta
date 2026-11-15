package org.telegram.messenger;
public final class w6 {
    public final int f27304a;
    public final long f27305b;

    public w6(long j3, int i7, long j10) {
        this.f27304a = i7;
        this.f27305b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27305b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
