package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f15941a;
    public final Object f15942b;

    public b1(Object obj, int i10) {
        this.f15941a = i10;
        this.f15942b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15941a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f15942b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f15942b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f15942b).invalidate();
                return;
        }
    }
}
