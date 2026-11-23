package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f24352a;
    public final ri f24353b;
    public final long f24354c;
    public final long d;
    public final int[] f24355e;

    public gg(ri riVar, long j3, long j10, int[] iArr, int i7) {
        this.f24352a = i7;
        this.f24353b = riVar;
        this.f24354c = j3;
        this.d = j10;
        this.f24355e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24352a;
        int[] iArr = this.f24355e;
        long j3 = this.d;
        long j10 = this.f24354c;
        ri riVar = this.f24353b;
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
