package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class k4 implements Runnable {
    public final int f3783a = 0;
    public final boolean f3784b;
    public final int f3785c;
    public final int d;
    public final long f3786e;
    public final Object f3787f;

    public k4(int i7, int i10, long j3, String str, boolean z10) {
        this.f3787f = str;
        this.f3785c = i7;
        this.f3784b = z10;
        this.f3786e = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f3783a;
        Object obj = this.f3787f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.f3785c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.f3786e;
                final boolean z10 = this.f3784b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new m4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                return;
            default:
                int i12 = ChatActivityEnterView.f32538n7;
                ((ChatActivityEnterView) obj).s1(this.f3784b, this.f3785c, this.d, this.f3786e, false);
                return;
        }
    }

    public k4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f3787f = chatActivityEnterView;
        this.f3784b = z10;
        this.f3785c = i7;
        this.d = i10;
        this.f3786e = j3;
    }
}
