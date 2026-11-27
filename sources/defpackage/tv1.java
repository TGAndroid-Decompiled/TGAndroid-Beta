package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tv1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final long d;
    public final int e;
    public final Object f;

    public tv1(int i, int i2, long j, String str, boolean z) {
        this.f = str;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = i2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj).F1(this.c, this.b, this.e, this.d, false);
                return;
            default:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i2 = this.b;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                final int i3 = this.e;
                final long j = this.d;
                final boolean z = this.c;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        hl.c3(new uv1(tLObject, i2, z, j, i3, str));
                    }
                });
                return;
        }
    }

    public tv1(ChatActivityEnterView chatActivityEnterView, boolean z, int i, int i2, long j) {
        this.f = chatActivityEnterView;
        this.c = z;
        this.b = i;
        this.e = i2;
        this.d = j;
    }
}
