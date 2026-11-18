package org.telegram.messenger;
public final class w6 {
    public final int f27645a;
    public final long f27646b;

    public w6(long j3, int i7, long j10) {
        this.f27645a = i7;
        this.f27646b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27646b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
