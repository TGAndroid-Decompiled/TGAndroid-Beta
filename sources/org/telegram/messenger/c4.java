package org.telegram.messenger;
public final class c4 implements Runnable {
    public final int f14836a;
    public final boolean f14837b;

    public c4(int i10, boolean z10) {
        this.f14836a = i10;
        this.f14837b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f14836a;
        boolean z10 = this.f14837b;
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
