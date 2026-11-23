package bi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.w91;
public final class x3 implements w10 {
    public final int f4200a = 0;
    public final long f4201b;
    public final int f4202c;
    public final Object d;
    public final Object f4203e;

    public x3(String str, long j3, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.f4201b = j3;
        this.f4202c = i7;
        this.f4203e = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i7;
        int i10 = this.f4200a;
        int i11 = this.f4202c;
        long j3 = this.f4201b;
        Object obj2 = this.f4203e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fc G = l4.h().G(2131623990, 3, gd.a0(null, null, 2131749610, str2));
                    G.f35101t = true;
                    G.j();
                    return;
                }
                l4.g(j3);
                l4.d.remove(l4.a(i11, j3));
                l4.c();
                l4.t(2131749570, tL_messageActionStarGiftOnchainOffer.gift);
                return;
            default:
                w91 w91Var = (w91) obj3;
                bx bxVar = (bx) obj2;
                Boolean bool = (Boolean) obj;
                if (w91Var != null) {
                    w91Var.finishFragment();
                    bxVar.removeSelfFromStack();
                } else {
                    bxVar.finishFragment();
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (j3 >= 0) {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(j3));
                        str = n10.l(c22);
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
                    kc b02 = kc.b0(T);
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

    public x3(w91 w91Var, bx bxVar, long j3, int i7) {
        this.d = w91Var;
        this.f4203e = bxVar;
        this.f4201b = j3;
        this.f4202c = i7;
    }
}
