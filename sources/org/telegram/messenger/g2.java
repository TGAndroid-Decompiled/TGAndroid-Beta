package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f17772a;
    public final Object f17773b;
    public final Object f17774c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f17772a = i10;
        this.f17773b = obj;
        this.f17774c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17772a) {
            case 0:
                ((FactCheckController) this.f17773b).lambda$getFactCheck$0((FactCheckController.Key) this.f17774c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f17773b, (TL_stories.TL_premium_boostsStatus) this.f17774c, (e2.h) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f17773b).lambda$requestReferenceFromServer$1((String) this.f17774c, (String) this.d, (bi.a8) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f17773b, (org.telegram.ui.Components.x9) this.f17774c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f17773b, (ArrayList[]) this.f17774c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f17773b, (TL_bots.BotInfo[]) this.f17774c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
