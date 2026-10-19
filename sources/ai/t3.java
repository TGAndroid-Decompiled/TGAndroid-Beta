package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;
public final class t3 implements Utilities.Callback {
    public final int f2192a;
    public final long f2193b;
    public final org.telegram.ui.ActionBar.f3 f2194c;
    public final Object d;
    public final Object e;
    public final TLObject f2195f;
    public final TLObject f2196g;

    public t3(org.telegram.ui.ActionBar.f3 f3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.f2192a = i10;
        this.f2194c = f3Var;
        this.d = obj;
        this.e = obj2;
        this.f2193b = j10;
        this.f2195f = tLObject;
        this.f2196g = tLObject2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2192a) {
            case 0:
                k7.N0((k7) this.f2194c, (pf.c) this.d, (ug.m1) this.e, this.f2193b, (TL_stars.TL_starGiftUnique) this.f2195f, (TL_wallet.nftItem) this.f2196g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.f2194c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.f2193b, (TLRPC.TL_chatInviteExported) this.f2195f, (TLRPC.TL_chatInviteImporter) this.f2196g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }
}
