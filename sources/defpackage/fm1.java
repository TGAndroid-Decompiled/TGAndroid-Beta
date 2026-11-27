package defpackage;

import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class fm1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final r47 c;

    public fm1(zu1 zu1Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = r47Var;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        int i;
        int i2;
        int i3;
        boolean z;
        byte b = this.a;
        int i4 = 1;
        zu1 zu1Var = this.b;
        r47 r47Var = this.c;
        switch (b) {
            case 0:
                r47 r47Var2 = this.c;
                TLRPC.MessageMedia messageMedia = r47Var2.k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    sz1 sz1Var = zu1Var.c4;
                    if (sz1Var != null) {
                        String str = webPage.url;
                        zg2 zg2Var = sz1Var.n;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (str == null || !str.equals((String) zg2Var.c) || uptimeMillis - zg2Var.b >= 1000) {
                            zg2Var.c = str;
                            zg2Var.b = uptimeMillis;
                            sz1Var.a(r47Var2, "open_iv", null, null, false);
                        }
                    }
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var2) == null) {
                        zu1Var.createArticleViewer(false).L(r47Var2, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zu1 zu1Var2 = this.b;
                zu1Var2.getClass();
                zu1Var2.tb(r47Var.e1(), 0, true, 0, true, 0, null, null, new gn1(zu1Var2, (byte) 6));
                if (zu1Var2.z6.isEmpty()) {
                    zu1Var2.nc(false);
                    return;
                }
                return;
            case 2:
                zu1Var.getMessagesController().L3(zu1Var.e, zu1Var.f, r47Var.e1(), true, false, false);
                zu1Var.P3 = null;
                return;
            case 3:
                int N1 = r47Var.N1();
                TLRPC.Message message = r47Var.k;
                int i5 = message.id;
                long B0 = r47.B0(message);
                zu1 zu1Var3 = this.b;
                if (B0 == zu1Var3.d7) {
                    i = 1;
                } else {
                    i = 0;
                }
                zu1Var3.tb(N1, i5, true, i, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) r47Var.k.action).answer.option, null);
                return;
            case 4:
                int N12 = r47Var.N1();
                TLRPC.Message message2 = r47Var.k;
                int i6 = message2.id;
                long B02 = r47.B0(message2);
                zu1 zu1Var4 = this.b;
                if (B02 == zu1Var4.d7) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                zu1Var4.tb(N12, i6, true, i2, false, 0, null, null, null);
                return;
            case 5:
                int N13 = r47Var.N1();
                TLRPC.Message message3 = r47Var.k;
                int i7 = message3.id;
                long B03 = r47.B0(message3);
                zu1 zu1Var5 = this.b;
                if (B03 != zu1Var5.d7) {
                    i4 = 0;
                }
                zu1Var5.J(N13, i7, i4, 0, true, false);
                return;
            case 6:
                if (r47.K4(r47Var.k)) {
                    zu1Var.xa(null, r47Var);
                    return;
                } else {
                    MediaController.z().V(r47Var);
                    return;
                }
            case 7:
                TLRPC.Message message4 = r47Var.k;
                int i8 = message4.ttl;
                if (i8 != Integer.MAX_VALUE) {
                    i3 = i8;
                    z = true;
                } else {
                    i3 = 0;
                    z = false;
                }
                message4.destroyTime = zu1Var.getConnectionsManager().getCurrentTime() + i3;
                r47Var.k.destroyTimeMillis = zu1Var.getConnectionsManager().getCurrentTimeMillis() + (i3 * 1000);
                if (zu1Var.h != null) {
                    zu1Var.getMessagesController().x3(zu1Var.l6, i3, r47Var.k.random_id);
                    return;
                } else {
                    zu1Var.getMessagesController().y3(zu1Var.l6, r47Var.e1(), null, i3, 0L, z);
                    return;
                }
            default:
                d31.b0(zu1Var).c(ob6.M0(2131754481, null)).j();
                zu1Var.ab(r47Var);
                zu1Var.cb(r47Var);
                return;
        }
    }
}
