package defpackage;

import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class it0 implements p8c {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;

    public it0(int i, long j, p8c p8cVar, TLRPC.WallPaper wallPaper) {
        this.d = p8cVar;
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
                qvb qvbVar = (qvb) obj3;
                cj3 cj3Var = (cj3) obj2;
                Boolean bool = (Boolean) obj;
                if (qvbVar != null) {
                    qvbVar.finishFragment();
                    cj3Var.removeSelfFromStack();
                } else {
                    cj3Var.finishFragment();
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    if (j >= 0) {
                        TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                        str = l7c.l(V1);
                        user = V1;
                    } else {
                        TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
                        if (K0 == null) {
                            str = "";
                            user = K0;
                        } else {
                            str = K0.title;
                            user = K0;
                        }
                    }
                    u21 b0 = u21.b0(S);
                    if (bool.booleanValue()) {
                        i = 2131752976;
                    } else {
                        i = 2131752975;
                    }
                    SpannableStringBuilder S2 = gl.S2(k96.a0(null, null, i, str));
                    b0.getClass();
                    b0.V(Arrays.asList(user), S2, null, null).k(false);
                    return;
                }
                return;
            case 1:
                p8c p8cVar = (p8c) obj3;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj2;
                mqc mqcVar = (mqc) obj;
                if (mqcVar != null) {
                    p8cVar.a(mqcVar);
                    return;
                }
                gl5 b2 = gl5.b(wallPaper.document);
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.A1 = false;
                Point point = gl.q;
                int min = Math.min(point.x, point.y);
                int max = Math.max(point.x, point.y);
                imageReceiver.d0(b2, (min / gl.p) + "_" + (max / gl.p) + "_f", null, ".jpg", wallPaper, 1);
                imageReceiver.h1 = new gf(p8cVar, this.b, this.c, (byte) 3);
                fl5.z().I(imageReceiver, null);
                return;
            default:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m21 G = vp7.h().G(2131623990, 3, k96.a0(null, null, 2131749611, str2));
                    G.t = true;
                    G.j();
                    return;
                }
                vp7.g(j);
                vp7.d.remove(vp7.a(i2, j));
                vp7.c();
                vp7.s(2131749571, tL_messageActionStarGiftOnchainOffer.gift);
                return;
        }
    }

    public it0(qvb qvbVar, cj3 cj3Var, long j, int i) {
        this.d = qvbVar;
        this.e = cj3Var;
        this.c = j;
        this.b = i;
    }

    public it0(String str, long j, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.c = j;
        this.b = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }
}
