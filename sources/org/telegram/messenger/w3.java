package org.telegram.messenger;
public final class w3 implements Runnable {
    public final int f21986a;
    public final boolean f21987b;

    public w3(int i9, boolean z10) {
        this.f21986a = i9;
        this.f21987b = z10;
    }

    @Override
    public final void run() {
        int i9 = this.f21986a;
        boolean z10 = this.f21987b;
        switch (i9) {
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
