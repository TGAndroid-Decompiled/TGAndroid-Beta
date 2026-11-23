package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class r4 implements Runnable {
    public final int f4023a = 0;
    public final boolean f4024b;
    public final int f4025c;
    public final int d;
    public final long f4026e;
    public final Object f4027f;

    public r4(int i7, int i10, long j3, String str, boolean z10) {
        this.f4027f = str;
        this.f4025c = i7;
        this.f4024b = z10;
        this.f4026e = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f4023a;
        Object obj = this.f4027f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.f4025c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.f4026e;
                final boolean z10 = this.f4024b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new t4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                return;
            default:
                int i12 = ChatActivityEnterView.f32535s7;
                ((ChatActivityEnterView) obj).w1(this.f4024b, this.f4025c, this.d, this.f4026e, false);
                return;
        }
    }

    public r4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f4027f = chatActivityEnterView;
        this.f4024b = z10;
        this.f4025c = i7;
        this.d = i10;
        this.f4026e = j3;
    }
}
