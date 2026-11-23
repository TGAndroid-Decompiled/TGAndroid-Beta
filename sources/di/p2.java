package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
import org.telegram.ui.zd;
public final class p2 implements w10 {
    public final int f9479a = 0;
    public final Object f9480b;
    public final long f9481c;
    public final Object d;
    public final Object f9482e;
    public final Object f9483f;
    public final Object f9484g;

    public p2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, bi.f2 f2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.f9482e = zArr;
        this.f9480b = t1Var;
        this.f9483f = f2Var;
        this.f9481c = j3;
        this.f9484g = stargiftdepositpayload;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.p2.a(java.lang.Object):void");
    }

    public p2(mp mpVar, org.telegram.ui.ActionBar.t1 t1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = mpVar;
        this.f9480b = t1Var;
        this.f9482e = bnVar;
        this.f9483f = vfVar;
        this.f9481c = j3;
        this.f9484g = zdVar;
    }

    public p2(x50 x50Var, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = x50Var;
        this.f9480b = t1Var;
        this.f9482e = context;
        this.f9481c = j3;
        this.f9483f = tL_chatInviteExported;
        this.f9484g = tL_chatInviteImporter;
    }

    public p2(z11 z11Var, org.telegram.ui.ActionBar.y0 y0Var, x60 x60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = z11Var;
        this.f9482e = y0Var;
        this.f9480b = x60Var;
        this.f9481c = j3;
        this.f9483f = user;
        this.f9484g = chat;
    }
}
