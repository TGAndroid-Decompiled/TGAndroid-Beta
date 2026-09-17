package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f19498a;
    public final boolean f19499b;

    public w3(int i10, boolean z10) {
        this.f19498a = i10;
        this.f19499b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19498a;
        boolean z10 = this.f19499b;
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
