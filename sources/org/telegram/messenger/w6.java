package org.telegram.messenger;
public final class w6 {
    public final int f27673a;
    public final long f27674b;

    public w6(long j3, int i7, long j10) {
        this.f27673a = i7;
        this.f27674b = j10;
    }

    public final int hashCode() {
        long j3 = this.f27674b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
