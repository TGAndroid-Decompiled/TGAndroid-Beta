package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16053a;
    public final vi f16054b;
    public final long f16055c;
    public final long d;
    public final int[] e;

    public hg(vi viVar, long j10, long j11, int[] iArr, int i10) {
        this.f16053a = i10;
        this.f16054b = viVar;
        this.f16055c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        int i10 = this.f16053a;
        int[] iArr = this.e;
        long j10 = this.d;
        long j11 = this.f16055c;
        vi viVar = this.f16054b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            case 1:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
            default:
                viVar.getNotificationCenter().k(34, Long.valueOf(j11), Long.valueOf(j10), iArr);
                return;
        }
    }
}
