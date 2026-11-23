package bi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.y91;
public final class x3 implements y10 {
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
                    gc G = l4.h().G(2131623990, 3, hd.a0(null, null, 2131749610, str2));
                    G.f35499t = true;
                    G.j();
                    return;
                }
                l4.g(j3);
                l4.d.remove(l4.a(i11, j3));
                l4.c();
                l4.t(2131749570, tL_messageActionStarGiftOnchainOffer.gift);
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
                        TLRPC.User c22 = np.u1(i11).c2(Long.valueOf(j3));
                        str = p10.l(c22);
                        user = c22;
                    } else {
                        TLRPC.Chat O0 = np.u1(i11).O0(Long.valueOf(-j3));
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
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, i7, str));
                    b02.getClass();
                    b02.V(Arrays.asList(user), W2, null, null).k(false);
                    return;
                }
                return;
        }
    }

    public x3(y91 y91Var, cx cxVar, long j3, int i7) {
        this.d = y91Var;
        this.f4203e = cxVar;
        this.f4201b = j3;
        this.f4202c = i7;
    }
}
