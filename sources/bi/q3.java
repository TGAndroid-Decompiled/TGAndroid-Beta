package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o70;
public final class q3 implements Utilities.Callback {
    public final int f5260a;
    public final long f5261b;
    public final org.telegram.ui.ActionBar.k3 f5262c;
    public final Object d;
    public final Object e;
    public final TLObject f5263f;
    public final TLObject f5264g;

    public q3(org.telegram.ui.ActionBar.k3 k3Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.f5260a = i10;
        this.f5262c = k3Var;
        this.d = obj;
        this.e = obj2;
        this.f5261b = j10;
        this.f5263f = tLObject;
        this.f5264g = tLObject2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5260a) {
            case 0:
                h7.Q0((h7) this.f5262c, (qf.c) this.d, (vg.n1) this.e, this.f5261b, (TL_stars.TL_starGiftUnique) this.f5263f, (TL_wallet.nftItem) this.f5264g, (TL_stars.starGiftDepositPayload) obj);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ag.m0((o70) this.f5262c, (org.telegram.ui.ActionBar.e2) this.d, (Context) this.e, this.f5261b, (TLRPC.TL_chatInviteExported) this.f5263f, (TLRPC.TL_chatInviteImporter) this.f5264g, (TLRPC.ChannelParticipant) obj));
                return;
        }
    }
}
