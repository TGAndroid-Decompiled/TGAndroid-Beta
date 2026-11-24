package defpackage;

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;
public final class rl1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final boolean c;

    public rl1(mu1 mu1Var, int i) {
        this.a = (byte) 1;
        this.b = mu1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        String str;
        gb2 gb2Var;
        k27 messageObject;
        byte b = this.a;
        boolean z = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                if (z) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                mu1Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 1:
                jq1 jq1Var = mu1Var.A0;
                if (jq1Var != null) {
                    int childCount = jq1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = mu1Var.A0.getChildAt(i);
                        if ((childAt instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && messageObject.T(mu1Var.V3)) {
                            gb2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                mu1Var.V3 = null;
                return;
            default:
                mu1Var.Sc(0, z);
                return;
        }
    }

    public rl1(mu1 mu1Var, boolean z, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = z;
    }
}
