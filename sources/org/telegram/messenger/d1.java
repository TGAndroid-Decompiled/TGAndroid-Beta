package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Utilities.Callback {
    public final int f18149a;
    public final Object f18150b;

    public d1(Object obj, int i10) {
        this.f18149a = i10;
        this.f18150b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18149a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f18150b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f18150b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f18150b).invalidate();
                return;
        }
    }
}
