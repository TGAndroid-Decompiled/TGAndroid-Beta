package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f15704a;
    public final ui f15705b;
    public final long f15706c;
    public final long d;
    public final int[] e;

    public gg(ui uiVar, long j10, long j11, int[] iArr, int i10) {
        this.f15704a = i10;
        this.f15705b = uiVar;
        this.f15706c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        int i10 = this.f15704a;
        int[] iArr = this.e;
        long j10 = this.d;
        long j11 = this.f15706c;
        ui uiVar = this.f15705b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            case 1:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            default:
                uiVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
        }
    }
}
