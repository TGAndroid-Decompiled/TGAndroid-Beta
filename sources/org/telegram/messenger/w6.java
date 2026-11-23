package org.telegram.messenger;
public final class w6 {
    public final int f27691a;
    public final long f27692b;

    public w6(long j3, int i7, long j10) {
        this.f27691a = i7;
        this.f27692b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27692b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
