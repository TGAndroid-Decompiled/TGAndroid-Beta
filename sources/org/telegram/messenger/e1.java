package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e1 implements Utilities.Callback {
    public final int f18245a;
    public final Object f18246b;

    public e1(Object obj, int i10) {
        this.f18245a = i10;
        this.f18246b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18245a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18246b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18246b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18246b).invalidate();
                return;
        }
    }
}
