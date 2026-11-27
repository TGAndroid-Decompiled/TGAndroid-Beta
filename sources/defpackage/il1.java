package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class il1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final boolean c;

    public il1(zu1 zu1Var, int i) {
        this.a = (byte) 4;
        this.b = zu1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        int i;
        String str;
        int i2;
        int i3;
        wb2 wb2Var;
        r47 messageObject;
        byte b = this.a;
        boolean z = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.e = zu1Var.getMessagesController().M0(Long.valueOf(zu1Var.e.id));
                if (zu1Var.Z7()) {
                    TLRPC.Chat chat = zu1Var.e;
                    if (chat.in_news || !xc2.r0(chat)) {
                        zu1Var.sb = false;
                        if (z && !zu1Var.e.in_news) {
                            zu1Var.P4(true, false, true);
                            return;
                        }
                        if (zu1Var.e.in_news) {
                            i = 2131752496;
                        } else {
                            i = 2131752498;
                        }
                        zu1Var.Yb(i);
                    }
                }
                zu1Var.Pc(false);
                return;
            case 1:
                if (z) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                zu1Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 2:
                zu1Var.getNotificationsController().G(zu1Var.l6, 0L, !z ? 1 : 0);
                zu1Var.Pc(false);
                if (z) {
                    i2 = 2131752310;
                } else {
                    i2 = 2131752388;
                }
                zu1Var.Yb(i2);
                return;
            case 3:
                zu1Var.getMessagesController().b(!z ? 1 : 0, 0, zu1Var.l6);
                if (z) {
                    i3 = 2131752240;
                } else {
                    i3 = 2131752433;
                }
                zu1Var.Yb(i3);
                return;
            case 4:
                wq1 wq1Var = zu1Var.A0;
                if (wq1Var != null) {
                    int childCount = wq1Var.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = zu1Var.A0.getChildAt(i4);
                        if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject.T(zu1Var.V3)) {
                            wb2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                zu1Var.V3 = null;
                return;
            default:
                zu1Var.gd(0, z);
                return;
        }
    }

    public il1(zu1 zu1Var, boolean z, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = z;
    }
}
