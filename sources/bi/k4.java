package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class k4 implements Runnable {
    public final int f3805a = 0;
    public final boolean f3806b;
    public final int f3807c;
    public final int d;
    public final long f3808e;
    public final Object f3809f;

    public k4(int i7, int i10, long j3, String str, boolean z10) {
        this.f3809f = str;
        this.f3807c = i7;
        this.f3806b = z10;
        this.f3808e = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f3805a;
        Object obj = this.f3809f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.f3807c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.f3808e;
                final boolean z10 = this.f3806b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new m4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                return;
            default:
                int i12 = ChatActivityEnterView.f32538n7;
                ((ChatActivityEnterView) obj).s1(this.f3806b, this.f3807c, this.d, this.f3808e, false);
                return;
        }
    }

    public k4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f3809f = chatActivityEnterView;
        this.f3806b = z10;
        this.f3807c = i7;
        this.d = i10;
        this.f3808e = j3;
    }
}
