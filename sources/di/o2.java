package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z11;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
import org.telegram.ui.zd;
public final class o2 implements x10 {
    public final int f9419a = 0;
    public final Object f9420b;
    public final long f9421c;
    public final Object d;
    public final Object f9422e;
    public final Object f9423f;
    public final Object f9424g;

    public o2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var, bi.a2 a2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.f9422e = zArr;
        this.f9420b = u1Var;
        this.f9423f = a2Var;
        this.f9421c = j3;
        this.f9424g = stargiftdepositpayload;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.o2.a(java.lang.Object):void");
    }

    public o2(mp mpVar, org.telegram.ui.ActionBar.u1 u1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = mpVar;
        this.f9420b = u1Var;
        this.f9422e = bnVar;
        this.f9423f = vfVar;
        this.f9421c = j3;
        this.f9424g = zdVar;
    }

    public o2(x50 x50Var, org.telegram.ui.ActionBar.u1 u1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = x50Var;
        this.f9420b = u1Var;
        this.f9422e = context;
        this.f9421c = j3;
        this.f9423f = tL_chatInviteExported;
        this.f9424g = tL_chatInviteImporter;
    }

    public o2(z11 z11Var, org.telegram.ui.ActionBar.z0 z0Var, y60 y60Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = z11Var;
        this.f9422e = z0Var;
        this.f9420b = y60Var;
        this.f9421c = j3;
        this.f9423f = user;
        this.f9424g = chat;
    }
}
