package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f15689a;
    public final Object f15690b;

    public b1(Object obj, int i10) {
        this.f15689a = i10;
        this.f15690b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15689a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f15690b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f15690b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f15690b).invalidate();
                return;
        }
    }
}
