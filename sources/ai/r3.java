package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;
public final class r3 implements Utilities.Callback {
    public final int f2095a = 0;
    public final long f2096b;
    public final org.telegram.ui.ActionBar.f3 f2097c;
    public final Object d;
    public final Object e;
    public final TLObject f2098f;
    public final Object f2099g;

    public r3(k7 k7Var, pf.c cVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, ug.l1 l1Var) {
        this.f2097c = k7Var;
        this.d = cVar;
        this.f2096b = j10;
        this.e = tL_starGiftUnique;
        this.f2098f = nftitem;
        this.f2099g = l1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2095a) {
            case 0:
                k7.j1((k7) this.f2097c, (pf.c) this.d, this.f2096b, (TL_stars.TL_starGiftUnique) this.e, (TL_wallet.nftItem) this.f2098f, (ug.l1) this.f2099g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.f2097c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.f2096b, (TLRPC.TL_chatInviteExported) this.f2098f, (TLRPC.TL_chatInviteImporter) this.f2099g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }

    public r3(l70 l70Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f2097c = l70Var;
        this.d = b2Var;
        this.e = context;
        this.f2096b = j10;
        this.f2098f = tL_chatInviteExported;
        this.f2099g = tL_chatInviteImporter;
    }
}
