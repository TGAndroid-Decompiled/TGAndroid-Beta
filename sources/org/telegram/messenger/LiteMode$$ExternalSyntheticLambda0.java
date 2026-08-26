package org.telegram.messenger;

public final class LiteMode$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final boolean f$0;

    public LiteMode$$ExternalSyntheticLambda0(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override
    public final void run() {
        boolean z = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LiteMode.lambda$onPowerSaverApplied$0(z);
                break;
            case 1:
                FingerprintController.generateNewKey(z);
                break;
            case 2:
                FingerprintController.lambda$generateNewKey$0(z);
                break;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z));
                break;
        }
    }
}
