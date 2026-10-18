package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l70;
public final class s3 implements Utilities.Callback {
    public final int f2138a;
    public final long f2139b;
    public final org.telegram.ui.ActionBar.f3 f2140c;
    public final Object d;
    public final Object e;
    public final TLObject f2141f;
    public final TLObject f2142g;

    public s3(org.telegram.ui.ActionBar.f3 f3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.f2138a = i10;
        this.f2140c = f3Var;
        this.d = obj;
        this.e = obj2;
        this.f2139b = j10;
        this.f2141f = tLObject;
        this.f2142g = tLObject2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2138a) {
            case 0:
                k7.Q0((k7) this.f2140c, (pf.c) this.d, (ug.m1) this.e, this.f2139b, (TL_stars.TL_starGiftUnique) this.f2141f, (TL_wallet.nftItem) this.f2142g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e((l70) this.f2140c, (org.telegram.ui.ActionBar.b2) this.d, (Context) this.e, this.f2139b, (TLRPC.TL_chatInviteExported) this.f2141f, (TLRPC.TL_chatInviteImporter) this.f2142g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }
}
