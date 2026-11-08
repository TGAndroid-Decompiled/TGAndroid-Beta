package org.telegram.messenger;
public final class w6 {
    public final int f26261a;
    public final long f26262b;

    public w6(long j3, int i7, long j10) {
        this.f26261a = i7;
        this.f26262b = j10;
    }

    public final int hashCode() {
        long j3 = this.f26262b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
