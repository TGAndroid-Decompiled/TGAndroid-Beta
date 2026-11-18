package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class a4 implements x10 {
    public final int f22817a;
    public final Object f22818b;

    public a4(Object obj, int i7) {
        this.f22817a = i7;
        this.f22818b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22817a) {
            case 0:
                f4 f4Var = (f4) this.f22818b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        f4Var.f23833e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.t3(f4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f22818b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f22818b).invalidate();
                return;
        }
    }
}
