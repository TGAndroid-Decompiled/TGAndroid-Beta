package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Utilities.Callback {
    public final int f19681a;
    public final Object f19682b;

    public a1(Object obj, int i9) {
        this.f19681a = i9;
        this.f19682b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19681a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f19682b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f19682b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f19682b).invalidate();
                return;
        }
    }
}
