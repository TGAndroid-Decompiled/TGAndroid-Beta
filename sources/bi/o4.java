package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class o4 implements Runnable {
    public final int f3974a = 0;
    public final boolean f3975b;
    public final int f3976c;
    public final int d;
    public final long f3977e;
    public final Object f3978f;

    public o4(int i7, int i10, long j3, String str, boolean z10) {
        this.f3978f = str;
        this.f3976c = i7;
        this.f3975b = z10;
        this.f3977e = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f3974a;
        Object obj = this.f3978f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.f3976c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.f3977e;
                final boolean z10 = this.f3975b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new q4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                return;
            default:
                int i12 = ChatActivityEnterView.f32569s7;
                ((ChatActivityEnterView) obj).w1(this.f3975b, this.f3976c, this.d, this.f3977e, false);
                return;
        }
    }

    public o4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f3978f = chatActivityEnterView;
        this.f3975b = z10;
        this.f3976c = i7;
        this.d = i10;
        this.f3977e = j3;
    }
}
