package org.telegram.messenger;
public final class y3 implements Runnable {
    public final int f22219a;
    public final boolean f22220b;

    public y3(int i10, boolean z10) {
        this.f22219a = i10;
        this.f22220b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f22219a;
        boolean z10 = this.f22220b;
        switch (i10) {
            case 0:
                FingerprintController.b(z10);
                return;
            case 1:
                FingerprintController.a(z10);
                return;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$0(z10);
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z10));
                return;
        }
    }
}
