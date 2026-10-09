package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f17387a;
    public final Object f17388b;

    public b1(Object obj, int i10) {
        this.f17387a = i10;
        this.f17388b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17387a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f17388b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f17388b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f17388b).invalidate();
                return;
        }
    }
}
