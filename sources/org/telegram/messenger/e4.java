package org.telegram.messenger;
public final class e4 implements Runnable {
    public final int f19962a;
    public final boolean f19963b;

    public e4(int i10, boolean z10) {
        this.f19962a = i10;
        this.f19963b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19962a;
        boolean z10 = this.f19963b;
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
