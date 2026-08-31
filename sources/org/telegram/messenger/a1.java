package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Utilities.Callback {
    public final int f18087a;
    public final Object f18088b;

    public a1(Object obj, int i10) {
        this.f18087a = i10;
        this.f18088b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18087a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18088b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18088b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18088b).invalidate();
                return;
        }
    }
}
