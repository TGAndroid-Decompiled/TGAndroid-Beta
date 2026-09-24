package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f15929a;
    public final Object f15930b;

    public b1(Object obj, int i10) {
        this.f15929a = i10;
        this.f15930b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15929a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f15930b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f15930b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f15930b).invalidate();
                return;
        }
    }
}
