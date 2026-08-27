package org.telegram.messenger;

public final class y3 implements Runnable {

    public final int f22193a;

    public final boolean f22194b;

    public y3(int i10, boolean z10) {
        this.f22193a = i10;
        this.f22194b = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f22193a;
        boolean z10 = this.f22194b;
        switch (i10) {
            case 0:
                FingerprintController.generateNewKey(z10);
                break;
            case 1:
                FingerprintController.lambda$generateNewKey$0(z10);
                break;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$0(z10);
                break;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z10));
                break;
        }
    }
}
