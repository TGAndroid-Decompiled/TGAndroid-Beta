package org.telegram.messenger;
public final class x3 implements Runnable {
    public final int f18093a;
    public final boolean f18094b;

    public x3(int i10, boolean z10) {
        this.f18093a = i10;
        this.f18094b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f18093a;
        boolean z10 = this.f18094b;
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
