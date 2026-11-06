package org.telegram.messenger;
public final class w6 {
    public final int f26258a;
    public final long f26259b;

    public w6(long j3, int i7, long j10) {
        this.f26258a = i7;
        this.f26259b = j10;
    }

    public final int hashCode() {
        long j3 = this.f26259b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
