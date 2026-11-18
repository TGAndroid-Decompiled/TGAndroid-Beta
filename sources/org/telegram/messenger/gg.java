package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f24251a;
    public final ri f24252b;
    public final long f24253c;
    public final long d;
    public final int[] f24254e;

    public gg(ri riVar, long j3, long j10, int[] iArr, int i7) {
        this.f24251a = i7;
        this.f24252b = riVar;
        this.f24253c = j3;
        this.d = j10;
        this.f24254e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24251a;
        int[] iArr = this.f24254e;
        long j3 = this.d;
        long j10 = this.f24253c;
        ri riVar = this.f24252b;
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
