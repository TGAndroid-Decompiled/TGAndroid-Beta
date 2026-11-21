package bi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.y91;
public final class v3 implements x10 {
    public final int f4173a = 0;
    public final long f4174b;
    public final int f4175c;
    public final Object d;
    public final Object f4176e;

    public v3(String str, long j3, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.f4174b = j3;
        this.f4175c = i7;
        this.f4176e = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i7;
        int i10 = this.f4173a;
        int i11 = this.f4175c;
        long j3 = this.f4174b;
        Object obj2 = this.f4176e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    gc G = i4.h().G(2131623990, 3, gd.a0(null, null, 2131749610, str2));
                    G.f35518t = true;
                    G.j();
                    return;
                }
                i4.g(j3);
                i4.d.remove(i4.a(i11, j3));
                i4.c();
                i4.t(2131749570, tL_messageActionStarGiftOnchainOffer.gift);
                return;
            default:
                y91 y91Var = (y91) obj3;
                cx cxVar = (cx) obj2;
                Boolean bool = (Boolean) obj;
                if (y91Var != null) {
                    y91Var.finishFragment();
                    cxVar.removeSelfFromStack();
                } else {
                    cxVar.finishFragment();
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (j3 >= 0) {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(j3));
                        str = o10.l(c22);
                        user = c22;
                    } else {
                        TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-j3));
                        if (O0 == null) {
                            str = "";
                            user = O0;
                        } else {
                            str = O0.title;
                            user = O0;
                        }
                    }
                    lc b02 = lc.b0(T);
                    if (bool.booleanValue()) {
                        i7 = 2131752976;
                    } else {
                        i7 = 2131752975;
                    }
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, str));
                    b02.getClass();
                    b02.V(Arrays.asList(user), W2, null, null).k(false);
                    return;
                }
                return;
        }
    }

    public v3(y91 y91Var, cx cxVar, long j3, int i7) {
        this.d = y91Var;
        this.f4176e = cxVar;
        this.f4174b = j3;
        this.f4175c = i7;
    }
}
