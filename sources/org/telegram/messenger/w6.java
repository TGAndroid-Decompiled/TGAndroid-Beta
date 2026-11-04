package org.telegram.messenger;
public final class w6 {
    public final int f26164a;
    public final long f26165b;

    public w6(long j10, int i3, long j11) {
        this.f26164a = i3;
        this.f26165b = j11;
    }

    public final int hashCode() {
        long j10 = this.f26165b;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
