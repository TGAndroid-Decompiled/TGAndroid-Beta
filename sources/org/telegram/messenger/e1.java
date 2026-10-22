package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Utilities.Callback {
    public final int f18224a;
    public final Object f18225b;

    public e1(Object obj, int i10) {
        this.f18224a = i10;
        this.f18225b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18224a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18225b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18225b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18225b).invalidate();
                return;
        }
    }
}
