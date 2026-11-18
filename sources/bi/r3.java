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
public final class r3 implements x10 {
    public final int f3995a = 0;
    public final long f3996b;
    public final int f3997c;
    public final Object d;
    public final Object f3998e;

    public r3(String str, long j3, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.f3996b = j3;
        this.f3997c = i7;
        this.f3998e = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i7;
        int i10 = this.f3995a;
        int i11 = this.f3997c;
        long j3 = this.f3996b;
        Object obj2 = this.f3998e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (((Boolean) obj).booleanValue()) {
                    gc G = e4.h().G(2131623990, 3, gd.a0(null, null, 2131749611, str2));
                    G.f35471t = true;
                    G.j();
                    return;
                }
                e4.g(j3);
                e4.d.remove(e4.a(i11, j3));
                e4.c();
                e4.t(2131749571, tL_messageActionStarGiftOnchainOffer.gift);
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
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
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
                        i7 = 2131752977;
                    } else {
                        i7 = 2131752976;
                    }
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, str));
                    b02.getClass();
                    b02.V(Arrays.asList(user), W2, null, null).k(false);
                    return;
                }
                return;
        }
    }

    public r3(y91 y91Var, cx cxVar, long j3, int i7) {
        this.d = y91Var;
        this.f3998e = cxVar;
        this.f3996b = j3;
        this.f3997c = i7;
    }
}
