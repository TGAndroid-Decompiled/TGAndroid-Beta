package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f22931a;
    public final ui f22932b;
    public final long f22933c;
    public final long d;
    public final int[] f22934e;

    public hg(ui uiVar, long j3, long j10, int[] iArr, int i7) {
        this.f22931a = i7;
        this.f22932b = uiVar;
        this.f22933c = j3;
        this.d = j10;
        this.f22934e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22931a;
        int[] iArr = this.f22934e;
        long j3 = this.d;
        long j10 = this.f22933c;
        ui uiVar = this.f22932b;
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
