package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class x3 implements r20 {
    public final int f19395a;
    public final Object f19396b;

    public x3(Object obj, int i10) {
        this.f19395a = i10;
        this.f19396b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19395a) {
            case 0:
                g4 g4Var = (g4) this.f19396b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        g4Var.e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.y3(g4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f19396b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f19396b).invalidate();
                return;
        }
    }
}
