package org.telegram.messenger;
public final class a4 implements Runnable {
    public final int f17830a;
    public final boolean f17831b;

    public a4(int i10, boolean z10) {
        this.f17830a = i10;
        this.f17831b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17830a;
        boolean z10 = this.f17831b;
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
