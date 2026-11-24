package defpackage;

import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class jm1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final k47 c;

    public jm1(yv1 yv1Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = k47Var;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        int i;
        boolean z;
        int i2;
        int i3;
        byte b = this.a;
        yv1 yv1Var = this.b;
        int i4 = 0;
        k47 k47Var = this.c;
        switch (b) {
            case 0:
                k47 k47Var2 = this.c;
                TLRPC.MessageMedia messageMedia = k47Var2.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    n02 n02Var = yv1Var.c4;
                    if (n02Var != null) {
                        String str = webPage.url;
                        vh2 vh2Var = n02Var.n;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (str == null || !str.equals((String) vh2Var.c) || uptimeMillis - vh2Var.b >= 1000) {
                            vh2Var.c = str;
                            vh2Var.b = uptimeMillis;
                            n02Var.a(k47Var2, "open_iv", null, null, false);
                        }
                    }
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var2) == null) {
                        yv1Var.createArticleViewer(false).L(k47Var2, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.Message message = k47Var.k;
                int i5 = message.ttl;
                if (i5 != Integer.MAX_VALUE) {
                    z = true;
                    i = i5;
                } else {
                    i = 0;
                    z = false;
                }
                message.destroyTime = yv1Var.getConnectionsManager().getCurrentTime() + i;
                k47Var.k.destroyTimeMillis = yv1Var.getConnectionsManager().getCurrentTimeMillis() + (i * 1000);
                if (yv1Var.h != null) {
                    yv1Var.getMessagesController().t3(yv1Var.l6, i, k47Var.k.random_id);
                    return;
                } else {
                    yv1Var.getMessagesController().u3(yv1Var.l6, k47Var.e1(), null, i, 0L, z);
                    return;
                }
            case 2:
                yv1 yv1Var2 = this.b;
                yv1Var2.getClass();
                yv1Var2.sb(k47Var.e1(), 0, true, 0, true, 0, null, null, new ho1(yv1Var2, (byte) 18));
                if (yv1Var2.z6.isEmpty()) {
                    yv1Var2.nc(false);
                    return;
                }
                return;
            case 3:
                int N1 = k47Var.N1();
                TLRPC.Message message2 = k47Var.k;
                int i6 = message2.id;
                long B0 = k47.B0(message2);
                yv1 yv1Var3 = this.b;
                if (B0 == yv1Var3.d7) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                yv1Var3.sb(N1, i6, true, i2, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) k47Var.k.action).answer.option, null);
                return;
            case 4:
                int N12 = k47Var.N1();
                TLRPC.Message message3 = k47Var.k;
                int i7 = message3.id;
                long B02 = k47.B0(message3);
                yv1 yv1Var4 = this.b;
                if (B02 == yv1Var4.d7) {
                    i4 = 1;
                }
                yv1Var4.sb(N12, i7, true, i4, false, 0, null, null, null);
                return;
            case 5:
                int N13 = k47Var.N1();
                TLRPC.Message message4 = k47Var.k;
                int i8 = message4.id;
                long B03 = k47.B0(message4);
                yv1 yv1Var5 = this.b;
                if (B03 == yv1Var5.d7) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                yv1Var5.J(N13, i8, i3, 0, true, false);
                return;
            case 6:
                yv1Var.getMessagesController().G3(yv1Var.e, yv1Var.f, k47Var.e1(), true, false, false);
                yv1Var.P3 = null;
                return;
            case 7:
                if (k47.K4(k47Var.k)) {
                    yv1Var.wa(null, k47Var);
                    return;
                } else {
                    MediaController.w().R(k47Var);
                    return;
                }
            default:
                c41.b0(yv1Var).c(jb6.M0(2131754485, null)).j();
                yv1Var.Za(k47Var);
                yv1Var.bb(k47Var);
                return;
        }
    }
}
