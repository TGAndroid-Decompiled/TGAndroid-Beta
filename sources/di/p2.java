package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b21;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
import org.telegram.ui.zd;
public final class p2 implements x10 {
    public final int f9515a = 0;
    public final Object f9516b;
    public final long f9517c;
    public final Object d;
    public final Object f9518e;
    public final Object f9519f;
    public final Object f9520g;

    public p2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, bi.e2 e2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.f9518e = zArr;
        this.f9516b = t1Var;
        this.f9519f = e2Var;
        this.f9517c = j3;
        this.f9520g = stargiftdepositpayload;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.p2.a(java.lang.Object):void");
    }

    public p2(mp mpVar, org.telegram.ui.ActionBar.t1 t1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = mpVar;
        this.f9516b = t1Var;
        this.f9518e = bnVar;
        this.f9519f = vfVar;
        this.f9517c = j3;
        this.f9520g = zdVar;
    }

    public p2(a60 a60Var, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = a60Var;
        this.f9516b = t1Var;
        this.f9518e = context;
        this.f9517c = j3;
        this.f9519f = tL_chatInviteExported;
        this.f9520g = tL_chatInviteImporter;
    }

    public p2(b21 b21Var, org.telegram.ui.ActionBar.y0 y0Var, a70 a70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = b21Var;
        this.f9518e = y0Var;
        this.f9516b = a70Var;
        this.f9517c = j3;
        this.f9519f = user;
        this.f9520g = chat;
    }
}
