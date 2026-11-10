package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f22911a;
    public final ui f22912b;
    public final long f22913c;
    public final long d;
    public final int[] f22914e;

    public hg(ui uiVar, long j3, long j10, int[] iArr, int i7) {
        this.f22911a = i7;
        this.f22912b = uiVar;
        this.f22913c = j3;
        this.d = j10;
        this.f22914e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22911a;
        int[] iArr = this.f22914e;
        long j3 = this.d;
        long j10 = this.f22913c;
        ui uiVar = this.f22912b;
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
