package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
public final class zj8 implements Runnable {
    public final byte a;
    public final PremiumPreviewFragment b;

    public zj8(PremiumPreviewFragment premiumPreviewFragment, byte b) {
        this.a = b;
        this.b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        byte b = this.a;
        PremiumPreviewFragment premiumPreviewFragment = this.b;
        switch (b) {
            case 0:
                premiumPreviewFragment.n0();
                return;
            case 1:
                premiumPreviewFragment.a.postOnAnimation(new zj8(premiumPreviewFragment, (byte) 0));
                return;
            default:
                premiumPreviewFragment.getMediaDataController().T0(false);
                return;
        }
    }
}
