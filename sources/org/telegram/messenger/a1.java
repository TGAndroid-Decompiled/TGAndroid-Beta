package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Utilities.Callback {
    public final int f15852a;
    public final Object f15853b;

    public a1(Object obj, int i10) {
        this.f15852a = i10;
        this.f15853b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15852a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f15853b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f15853b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f15853b).invalidate();
                return;
        }
    }
}
