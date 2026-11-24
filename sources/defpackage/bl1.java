package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class bl1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final k27 c;

    public bl1(mu1 mu1Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = k27Var;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        mu1 mu1Var = this.b;
        k27 k27Var = this.c;
        switch (b) {
            case 0:
                TLRPC.MessageMedia messageMedia = k27Var.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                        mu1Var.createArticleViewer(false).L(k27Var, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Message message = k27Var.k;
                int i5 = message.ttl;
                if (i5 != Integer.MAX_VALUE) {
                    z = true;
                    i = i5;
                } else {
                    i = 0;
                    z = false;
                }
                message.destroyTime = mu1Var.getConnectionsManager().getCurrentTime() + i;
                k27Var.k.destroyTimeMillis = mu1Var.getConnectionsManager().getCurrentTimeMillis() + (i * 1000);
                if (mu1Var.h != null) {
                    mu1Var.getMessagesController().r3(mu1Var.l6, i, k27Var.k.random_id);
                    return;
                } else {
                    mu1Var.getMessagesController().s3(mu1Var.l6, k27Var.e1(), null, i, 0L, z);
                    return;
                }
            case 2:
                mu1 mu1Var2 = this.b;
                mu1Var2.getClass();
                mu1Var2.ib(k27Var.e1(), 0, true, 0, true, 0, null, null, new vm1(mu1Var2, (byte) 14));
                if (mu1Var2.z6.isEmpty()) {
                    mu1Var2.bc(false);
                    return;
                }
                return;
            case 3:
                int N1 = k27Var.N1();
                TLRPC.Message message2 = k27Var.k;
                int i6 = message2.id;
                long B0 = k27.B0(message2);
                mu1 mu1Var3 = this.b;
                if (B0 == mu1Var3.d7) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                mu1Var3.ib(N1, i6, true, i2, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) k27Var.k.action).answer.option, null);
                return;
            case 4:
                int N12 = k27Var.N1();
                TLRPC.Message message3 = k27Var.k;
                int i7 = message3.id;
                long B02 = k27.B0(message3);
                mu1 mu1Var4 = this.b;
                if (B02 == mu1Var4.d7) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                mu1Var4.ib(N12, i7, true, i3, false, 0, null, null, null);
                return;
            case 5:
                int N13 = k27Var.N1();
                TLRPC.Message message4 = k27Var.k;
                int i8 = message4.id;
                long B03 = k27.B0(message4);
                mu1 mu1Var5 = this.b;
                if (B03 == mu1Var5.d7) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                mu1Var5.J(N13, i8, i4, 0, true, false);
                return;
            case 6:
                mu1Var.getMessagesController().E3(mu1Var.e, mu1Var.f, k27Var.e1(), true, false, false);
                mu1Var.P3 = null;
                return;
            case 7:
                if (k27.K4(k27Var.k)) {
                    mu1Var.ma(null, k27Var);
                    return;
                } else {
                    MediaController.w().R(k27Var);
                    return;
                }
            default:
                u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                return;
        }
    }
}
