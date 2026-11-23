package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f24446a;
    public final si f24447b;
    public final long f24448c;
    public final long d;
    public final int[] f24449e;

    public hg(si siVar, long j3, long j10, int[] iArr, int i7) {
        this.f24446a = i7;
        this.f24447b = siVar;
        this.f24448c = j3;
        this.d = j10;
        this.f24449e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24446a;
        int[] iArr = this.f24449e;
        long j3 = this.d;
        long j10 = this.f24448c;
        si siVar = this.f24447b;
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
