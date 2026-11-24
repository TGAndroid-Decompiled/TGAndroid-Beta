package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class wm1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final boolean c;

    public wm1(yv1 yv1Var, int i) {
        this.a = (byte) 2;
        this.b = yv1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        int i;
        String str;
        rc2 rc2Var;
        k47 messageObject;
        int i2;
        int i3;
        byte b = this.a;
        boolean z = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.e = yv1Var.getMessagesController().L0(Long.valueOf(yv1Var.e.id));
                if (yv1Var.Z7()) {
                    TLRPC.Chat chat = yv1Var.e;
                    if (chat.in_news || !sd2.r0(chat)) {
                        yv1Var.sb = false;
                        if (z && !yv1Var.e.in_news) {
                            yv1Var.P4(true, false, true);
                            return;
                        }
                        if (yv1Var.e.in_news) {
                            i = 2131752468;
                        } else {
                            i = 2131752470;
                        }
                        yv1Var.Yb(i);
                    }
                }
                yv1Var.Pc(false);
                return;
            case 1:
                if (z) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                yv1Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 2:
                vr1 vr1Var = yv1Var.A0;
                if (vr1Var != null) {
                    int childCount = vr1Var.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = yv1Var.A0.getChildAt(i4);
                        if ((childAt instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null && messageObject.T(yv1Var.V3)) {
                            rc2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                yv1Var.V3 = null;
                return;
            case 3:
                yv1Var.getNotificationsController().G(yv1Var.l6, 0L, !z ? 1 : 0);
                yv1Var.Pc(false);
                if (z) {
                    i2 = 2131752282;
                } else {
                    i2 = 2131752360;
                }
                yv1Var.Yb(i2);
                return;
            case 4:
                yv1Var.getMessagesController().b(!z ? 1 : 0, 0, yv1Var.l6);
                if (z) {
                    i3 = 2131752212;
                } else {
                    i3 = 2131752405;
                }
                yv1Var.Yb(i3);
                return;
            default:
                yv1Var.gd(0, z);
                return;
        }
    }

    public wm1(yv1 yv1Var, boolean z, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = z;
    }
}
