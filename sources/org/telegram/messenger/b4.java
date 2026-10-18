package org.telegram.messenger;
public final class b4 implements Runnable {
    public final int f17919a;
    public final boolean f17920b;

    public b4(int i10, boolean z10) {
        this.f17919a = i10;
        this.f17920b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17919a;
        boolean z10 = this.f17920b;
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
