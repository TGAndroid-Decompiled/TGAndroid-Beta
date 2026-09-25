package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Utilities.Callback {
    public final int f15944a;
    public final Object f15945b;

    public b1(Object obj, int i10) {
        this.f15944a = i10;
        this.f15945b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15944a) {
            case 0:
                ChatThemeController.q((ChatThemeController) this.f15945b, (List) obj);
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f15945b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f15945b).invalidate();
                return;
        }
    }
}
