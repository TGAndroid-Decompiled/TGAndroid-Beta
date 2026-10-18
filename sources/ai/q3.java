package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;
public final class q3 implements Utilities.Callback {
    public final int f2053a;
    public final long f2054b;
    public final org.telegram.ui.ActionBar.f3 f2055c;
    public final Object d;
    public final Object e;
    public final TLObject f2056f;
    public final TLObject f2057g;

    public q3(org.telegram.ui.ActionBar.f3 f3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.f2053a = i10;
        this.f2055c = f3Var;
        this.d = obj;
        this.e = obj2;
        this.f2054b = j10;
        this.f2056f = tLObject;
        this.f2057g = tLObject2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2053a) {
            case 0:
                k7.U0((k7) this.f2055c, (pf.c) this.d, (ug.m1) this.e, this.f2054b, (TL_stars.TL_starGiftUnique) this.f2056f, (TL_wallet.nftItem) this.f2057g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.f2055c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.f2054b, (TLRPC.TL_chatInviteExported) this.f2056f, (TLRPC.TL_chatInviteImporter) this.f2057g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }
}
