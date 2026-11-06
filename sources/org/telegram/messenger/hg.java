package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f22924a;
    public final ui f22925b;
    public final long f22926c;
    public final long d;
    public final int[] f22927e;

    public hg(ui uiVar, long j3, long j10, int[] iArr, int i7) {
        this.f22924a = i7;
        this.f22925b = uiVar;
        this.f22926c = j3;
        this.d = j10;
        this.f22927e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22924a;
        int[] iArr = this.f22927e;
        long j3 = this.d;
        long j10 = this.f22926c;
        ui uiVar = this.f22925b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            case 1:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
            default:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j10), Long.valueOf(j3), iArr);
                return;
        }
    }
}
