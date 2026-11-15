package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f23751a;
    public final si f23752b;
    public final long f23753c;
    public final long d;
    public final int[] f23754e;

    public gg(si siVar, long j3, long j10, int[] iArr, int i7) {
        this.f23751a = i7;
        this.f23752b = siVar;
        this.f23753c = j3;
        this.d = j10;
        this.f23754e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f23751a;
        int[] iArr = this.f23754e;
        long j3 = this.d;
        long j10 = this.f23753c;
        si siVar = this.f23752b;
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
