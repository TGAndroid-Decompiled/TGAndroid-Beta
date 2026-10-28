package org.telegram.messenger;
public final class f4 implements Runnable {
    public final int f20046a;
    public final boolean f20047b;

    public f4(int i10, boolean z10) {
        this.f20046a = i10;
        this.f20047b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20046a;
        boolean z10 = this.f20047b;
        switch (i10) {
            case 0:
                FingerprintController.b(z10);
                return;
            case 1:
                FingerprintController.a(z10);
                return;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$1(z10);
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z10));
                return;
        }
    }
}
