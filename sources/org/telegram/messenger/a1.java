package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Utilities.Callback {
    public final int f16680a;
    public final Object f16681b;

    public a1(Object obj, int i10) {
        this.f16680a = i10;
        this.f16681b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16680a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f16681b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f16681b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f16681b).invalidate();
                return;
        }
    }
}
