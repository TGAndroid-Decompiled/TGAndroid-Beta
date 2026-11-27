package defpackage;

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class qt0 implements pcc {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public qt0(int i, long j, pcc pccVar, TLRPC.WallPaper wallPaper) {
        this.d = pccVar;
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
                tzb tzbVar = (tzb) obj3;
                uj3 uj3Var = (uj3) obj2;
                Boolean bool = (Boolean) obj;
                if (tzbVar != null) {
                    tzbVar.finishFragment();
                    uj3Var.removeSelfFromStack();
                } else {
                    uj3Var.finishFragment();
                }
                e S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                        str = lbc.l(X1);
                        user = X1;
                    } else {
                        TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
                        if (M0 == null) {
                            str = "";
                            user = M0;
                        } else {
                            str = M0.title;
                            user = M0;
                        }
                    }
                    d31 b0 = d31.b0(S);
                    if (bool.booleanValue()) {
                        i = 2131752969;
                    } else {
                        i = 2131752968;
                    }
                    SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i, str));
                    b0.getClass();
                    b0.V(Arrays.asList(user), S2, null, null).k(false);
                    return;
                }
                return;
            case 1:
                pcc pccVar = (pcc) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                avc avcVar = (avc) obj;
                if (avcVar != null) {
                    pccVar.a(avcVar);
                    return;
                }
                jn5 b2 = jn5.b(wallPaper.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                Point point = hl.q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                imageReceiver.d0(b2, (min / hl.p) + "_" + (max / hl.p) + "_f", null, ".jpg", wallPaper, 1);
                imageReceiver.h1 = new lf(pccVar, this.b, this.c, (byte) 3);
                in5.z().I(imageReceiver, null);
                return;
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    v21 G = vs7.h().G(2131623990, 3, ob6.a0(null, null, 2131749572, str2));
                    G.u = true;
                    G.j();
                    return;
                }
                vs7.g(j);
                vs7.d.remove(vs7.a(i2, j));
                vs7.c();
                vs7.s(2131749532, tL_messageActionStarGiftOnchainOffer.gift);
                return;
        }
    }

    public qt0(tzb tzbVar, uj3 uj3Var, long j, int i) {
        this.d = tzbVar;
        this.e = uj3Var;
        this.c = j;
        this.b = i;
    }

    public qt0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
