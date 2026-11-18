package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f24254a;
    public final ri f24255b;
    public final long f24256c;
    public final long d;
    public final int[] f24257e;

    public gg(ri riVar, long j3, long j10, int[] iArr, int i7) {
        this.f24254a = i7;
        this.f24255b = riVar;
        this.f24256c = j3;
        this.d = j10;
        this.f24257e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24254a;
        int[] iArr = this.f24257e;
        long j3 = this.d;
        long j10 = this.f24256c;
        ri riVar = this.f24255b;
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
