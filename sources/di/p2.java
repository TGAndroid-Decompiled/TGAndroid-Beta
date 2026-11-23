package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
import org.telegram.ui.zd;
public final class p2 implements y10 {
    public final int f9518a = 0;
    public final Object f9519b;
    public final long f9520c;
    public final Object d;
    public final Object f9521e;
    public final Object f9522f;
    public final Object f9523g;

    public p2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, bi.e2 e2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.f9521e = zArr;
        this.f9519b = t1Var;
        this.f9522f = e2Var;
        this.f9520c = j3;
        this.f9523g = stargiftdepositpayload;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.p2.a(java.lang.Object):void");
    }

    public p2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = npVar;
        this.f9519b = t1Var;
        this.f9521e = bnVar;
        this.f9522f = vfVar;
        this.f9520c = j3;
        this.f9523g = zdVar;
    }

    public p2(a60 a60Var, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = a60Var;
        this.f9519b = t1Var;
        this.f9521e = context;
        this.f9520c = j3;
        this.f9522f = tL_chatInviteExported;
        this.f9523g = tL_chatInviteImporter;
    }

    public p2(a21 a21Var, org.telegram.ui.ActionBar.y0 y0Var, a70 a70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = a21Var;
        this.f9521e = y0Var;
        this.f9519b = a70Var;
        this.f9520c = j3;
        this.f9522f = user;
        this.f9523g = chat;
    }
}
