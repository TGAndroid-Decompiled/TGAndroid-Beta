package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class u3 implements c20 {
    public final int f25730a;
    public final Object f25731b;

    public u3(Object obj, int i7) {
        this.f25730a = i7;
        this.f25731b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f25730a) {
            case 0:
                d4 d4Var = (d4) this.f25731b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        d4Var.f21986e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.s3(d4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f25731b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f25731b).invalidate();
                return;
        }
    }
}
