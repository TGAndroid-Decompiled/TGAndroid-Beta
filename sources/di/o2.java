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
public final class o2 implements y10 {
    public final int f9414a = 0;
    public final Object f9415b;
    public final long f9416c;
    public final Object d;
    public final Object f9417e;
    public final Object f9418f;
    public final Object f9419g;

    public o2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, bi.f2 f2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.f9417e = zArr;
        this.f9415b = t1Var;
        this.f9418f = f2Var;
        this.f9416c = j3;
        this.f9419g = stargiftdepositpayload;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.o2.a(java.lang.Object):void");
    }

    public o2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = npVar;
        this.f9415b = t1Var;
        this.f9417e = bnVar;
        this.f9418f = vfVar;
        this.f9416c = j3;
        this.f9419g = zdVar;
    }

    public o2(a60 a60Var, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = a60Var;
        this.f9415b = t1Var;
        this.f9417e = context;
        this.f9416c = j3;
        this.f9418f = tL_chatInviteExported;
        this.f9419g = tL_chatInviteImporter;
    }

    public o2(a21 a21Var, org.telegram.ui.ActionBar.y0 y0Var, a70 a70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = a21Var;
        this.f9417e = y0Var;
        this.f9415b = a70Var;
        this.f9416c = j3;
        this.f9418f = user;
        this.f9419g = chat;
    }
}
