package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Utilities.Callback {
    public final int f14825a;
    public final Object f14826b;

    public c1(Object obj, int i10) {
        this.f14825a = i10;
        this.f14826b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f14825a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f14826b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f14826b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f14826b).invalidate();
                return;
        }
    }
}
