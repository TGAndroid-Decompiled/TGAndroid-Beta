package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k70;
public final class u3 implements Utilities.Callback {
    public final int f2243a;
    public final long f2244b;
    public final org.telegram.ui.ActionBar.h3 f2245c;
    public final Object d;
    public final Object e;
    public final TLObject f2246f;
    public final TLObject f2247g;

    public u3(org.telegram.ui.ActionBar.h3 h3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.f2243a = i10;
        this.f2245c = h3Var;
        this.d = obj;
        this.e = obj2;
        this.f2244b = j10;
        this.f2246f = tLObject;
        this.f2247g = tLObject2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2243a) {
            case 0:
                l7.Q0((l7) this.f2245c, (pf.c) this.d, (ug.l1) this.e, this.f2244b, (TL_stars.TL_starGiftUnique) this.f2246f, (TL_wallet.nftItem) this.f2247g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((k70) this.f2245c, (org.telegram.ui.ActionBar.c2) this.d, (Context) this.e, this.f2244b, (TLRPC.TL_chatInviteExported) this.f2246f, (TLRPC.TL_chatInviteImporter) this.f2247g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }
}
