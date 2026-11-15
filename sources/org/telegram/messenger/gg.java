package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f23753a;
    public final si f23754b;
    public final long f23755c;
    public final long d;
    public final int[] f23756e;

    public gg(si siVar, long j3, long j10, int[] iArr, int i7) {
        this.f23753a = i7;
        this.f23754b = siVar;
        this.f23755c = j3;
        this.d = j10;
        this.f23756e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f23753a;
        int[] iArr = this.f23756e;
        long j3 = this.d;
        long j10 = this.f23755c;
        si siVar = this.f23754b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            case 1:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            default:
                siVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
        }
    }
}
