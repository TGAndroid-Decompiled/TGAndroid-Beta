package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class ll8 implements Runnable {
    public final byte a;
    public final PremiumPreviewFragment b;

    public ll8(PremiumPreviewFragment premiumPreviewFragment, byte b) {
        this.a = b;
        this.b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        byte b = this.a;
        PremiumPreviewFragment premiumPreviewFragment = this.b;
        switch (b) {
            case 0:
                premiumPreviewFragment.a.postOnAnimation(new ll8(premiumPreviewFragment, (byte) 2));
                return;
            case 1:
                premiumPreviewFragment.getMediaDataController().T0(false);
                return;
            default:
                premiumPreviewFragment.m0();
                return;
        }
    }
}
