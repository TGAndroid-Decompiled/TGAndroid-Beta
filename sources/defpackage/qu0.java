package defpackage;

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class qu0 implements qac {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public qu0(int i, long j, qac qacVar, TLRPC.WallPaper wallPaper) {
        this.d = qacVar;
        this.e = wallPaper;
        this.b = i;
        this.c = j;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i;
        byte b = this.a;
        int i2 = this.b;
        long j = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                sxb sxbVar = (sxb) obj3;
                nk3 nk3Var = (nk3) obj2;
                Boolean bool = (Boolean) obj;
                if (sxbVar != null) {
                    sxbVar.finishFragment();
                    nk3Var.removeSelfFromStack();
                } else {
                    nk3Var.finishFragment();
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                        str = m9c.l(W1);
                        user = W1;
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
                        if (L0 == null) {
                            str = "";
                            user = L0;
                        } else {
                            str = L0.title;
                            user = L0;
                        }
                    }
                    c41 b0 = c41.b0(S);
                    if (bool.booleanValue()) {
                        i = 2131752941;
                    } else {
                        i = 2131752940;
                    }
                    SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i, str));
                    b0.getClass();
                    b0.V(Arrays.asList(user), S2, null, null).k(false);
                    return;
                }
                return;
            case 1:
                qac qacVar = (qac) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                osc oscVar = (osc) obj;
                if (oscVar != null) {
                    qacVar.a(oscVar);
                    return;
                }
                gn5 b2 = gn5.b(wallPaper.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                Point point = gm.q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                imageReceiver.d0(b2, (min / gm.p) + "_" + (max / gm.p) + "_f", null, ".jpg", wallPaper, 1);
                imageReceiver.h1 = new hg(qacVar, this.b, this.c, (byte) 3);
                fn5.z().I(imageReceiver, null);
                return;
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    u31 G = yr7.h().G(2131623990, 3, jb6.a0(null, null, 2131749560, str2));
                    G.u = true;
                    G.j();
                    return;
                }
                yr7.g(j);
                yr7.d.remove(yr7.a(i2, j));
                yr7.c();
                yr7.s(2131749520, tL_messageActionStarGiftOnchainOffer.gift);
                return;
        }
    }

    public qu0(sxb sxbVar, nk3 nk3Var, long j, int i) {
        this.d = sxbVar;
        this.e = nk3Var;
        this.c = j;
        this.b = i;
    }

    public qu0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
