package bi;

import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
public final class u4 implements Runnable {
    public final int f4119a = 0;
    public final int f4120b;
    public final int f4121c;
    public final boolean d;
    public final Object f4122e;

    public u4(int i7, int i10, String str, boolean z10) {
        this.f4122e = str;
        this.f4120b = i7;
        this.d = z10;
        this.f4121c = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f4119a) {
            case 0:
                final String str = (String) this.f4122e;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i7 = this.f4120b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                final int i10 = this.f4121c;
                final boolean z10 = this.d;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new w4(tLObject, i7, z10, i10, str));
                    }
                });
                return;
            default:
                bn bnVar = (bn) this.f4122e;
                mp messagesController = bnVar.getMessagesController();
                long j10 = bnVar.f46271l6;
                if (org.telegram.messenger.v3.T(bnVar.f46173e)) {
                    j3 = bnVar.f46271l6;
                } else {
                    j3 = 0;
                }
                messagesController.d0(j10, j3, this.f4120b, this.f4121c, this.d, new vf(bnVar, 21));
                return;
        }
    }

    public u4(bn bnVar, int i7, int i10, boolean z10) {
        this.f4122e = bnVar;
        this.f4120b = i7;
        this.f4121c = i10;
        this.d = z10;
    }
}
