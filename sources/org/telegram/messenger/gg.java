package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f24279a;
    public final ri f24280b;
    public final long f24281c;
    public final long d;
    public final int[] f24282e;

    public gg(ri riVar, long j3, long j10, int[] iArr, int i7) {
        this.f24279a = i7;
        this.f24280b = riVar;
        this.f24281c = j3;
        this.d = j10;
        this.f24282e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24279a;
        int[] iArr = this.f24282e;
        long j3 = this.d;
        long j10 = this.f24281c;
        ri riVar = this.f24280b;
        switch (i7) {
            case 0:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            case 1:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            default:
                riVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
        }
    }
}
