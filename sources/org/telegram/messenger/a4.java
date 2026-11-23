package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class a4 implements y10 {
    public final int f22860a;
    public final Object f22861b;

    public a4(Object obj, int i7) {
        this.f22860a = i7;
        this.f22861b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22860a) {
            case 0:
                f4 f4Var = (f4) this.f22861b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        f4Var.f23856e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.s3(f4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f22861b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f22861b).invalidate();
                return;
        }
    }
}
