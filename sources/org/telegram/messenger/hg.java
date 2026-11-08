package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f22907a;
    public final ui f22908b;
    public final long f22909c;
    public final long d;
    public final int[] f22910e;

    public hg(ui uiVar, long j3, long j10, int[] iArr, int i7) {
        this.f22907a = i7;
        this.f22908b = uiVar;
        this.f22909c = j3;
        this.d = j10;
        this.f22910e = iArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22907a;
        int[] iArr = this.f22910e;
        long j3 = this.d;
        long j10 = this.f22909c;
        ui uiVar = this.f22908b;
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
