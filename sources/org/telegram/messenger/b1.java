package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f17375a;
    public final Object f17376b;

    public b1(Object obj, int i10) {
        this.f17375a = i10;
        this.f17376b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17375a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f17376b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f17376b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f17376b).invalidate();
                return;
        }
    }
}
