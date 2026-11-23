package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f24482a;
    public final si f24483b;
    public final long f24484c;
    public final long d;
    public final int[] f24485e;

    public hg(si siVar, long j3, long j10, int[] iArr, int i7) {
        this.f24482a = i7;
        this.f24483b = siVar;
        this.f24484c = j3;
        this.d = j10;
        this.f24485e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f24482a;
        int[] iArr = this.f24485e;
        long j3 = this.d;
        long j10 = this.f24484c;
        si siVar = this.f24483b;
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
