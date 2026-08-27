package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

public final class h2 implements Utilities.Callback {

    public final int f20437a;

    public final Object f20438b;

    public final Object f20439c;
    public final Object d;

    public h2(Object obj, Object obj2, Object obj3, int i10) {
        this.f20437a = i10;
        this.f20438b = obj;
        this.f20439c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20437a) {
            case 0:
                ((FactCheckController) this.f20438b).lambda$getFactCheck$0((FactCheckController.Key) this.f20439c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                break;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f20438b, (TL_stories.TL_premium_boostsStatus) this.f20439c, (d5.d) this.d, (TL_stories.TL_premium_myBoosts) obj);
                break;
            case 2:
                ((FileRefController) this.f20438b).lambda$requestReferenceFromServer$1((String) this.f20439c, (String) this.d, (jh.a6) obj);
                break;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f20438b, (org.telegram.ui.Components.n9) this.f20439c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f20438b, (ArrayList[]) this.f20439c, (Runnable) this.d, (ArrayList) obj);
                break;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f20438b, (TL_bots.BotInfo[]) this.f20439c, (Runnable) this.d, (TLRPC.UserFull) obj);
                break;
        }
    }
}
