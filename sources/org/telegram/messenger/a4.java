package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class a4 implements y10 {
    public final int f22824a;
    public final Object f22825b;

    public a4(Object obj, int i7) {
        this.f22824a = i7;
        this.f22825b = obj;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22824a) {
            case 0:
                f4 f4Var = (f4) this.f22825b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        f4Var.f23820e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.s3(f4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) this.f22825b).run();
                return;
            default:
                Object[] objArr = (Object[]) obj;
                ((View) this.f22825b).invalidate();
                return;
        }
    }
}
