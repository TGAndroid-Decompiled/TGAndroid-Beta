package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class x3 implements q20 {
    public final int f19207a;
    public final Object f19208b;

    public x3(Object obj, int i10) {
        this.f19207a = i10;
        this.f19208b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f19207a) {
            case 0:
                g4 g4Var = (g4) this.f19208b;
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
                ((Runnable) this.f19208b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f19208b).invalidate();
                return;
        }
    }
}
