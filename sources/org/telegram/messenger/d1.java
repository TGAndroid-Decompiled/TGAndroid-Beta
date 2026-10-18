package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Utilities.Callback {
    public final int f18136a;
    public final Object f18137b;

    public d1(Object obj, int i10) {
        this.f18136a = i10;
        this.f18137b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18136a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18137b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18137b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18137b).invalidate();
                return;
        }
    }
}
