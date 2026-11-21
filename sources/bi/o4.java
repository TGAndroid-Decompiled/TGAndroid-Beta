package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class o4 implements Runnable {
    public final int f3969a = 0;
    public final boolean f3970b;
    public final int f3971c;
    public final int d;
    public final long f3972e;
    public final Object f3973f;

    public o4(int i7, int i10, long j3, String str, boolean z10) {
        this.f3973f = str;
        this.f3971c = i7;
        this.f3970b = z10;
        this.f3972e = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f3969a;
        Object obj = this.f3973f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.f3971c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.f3972e;
                final boolean z10 = this.f3970b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new q4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                return;
            default:
                int i12 = ChatActivityEnterView.f32566s7;
                ((ChatActivityEnterView) obj).w1(this.f3970b, this.f3971c, this.d, this.f3972e, false);
                return;
        }
    }

    public o4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f3973f = chatActivityEnterView;
        this.f3970b = z10;
        this.f3971c = i7;
        this.d = i10;
        this.f3972e = j3;
    }
}
