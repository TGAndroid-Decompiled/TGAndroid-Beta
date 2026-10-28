package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g1 implements Utilities.Callback {
    public final int f20129a;
    public final Object f20130b;

    public g1(Object obj, int i10) {
        this.f20129a = i10;
        this.f20130b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20129a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f20130b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f20130b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f20130b).invalidate();
                return;
        }
    }
}
