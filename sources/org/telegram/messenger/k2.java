package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class k2 implements Utilities.Callback {
    public final int f15578a;
    public final Object f15579b;
    public final Object f15580c;
    public final Object d;

    public k2(Object obj, Object obj2, Object obj3, int i10) {
        this.f15578a = i10;
        this.f15579b = obj;
        this.f15580c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15578a) {
            case 0:
                ((FactCheckController) this.f15579b).lambda$getFactCheck$0((FactCheckController.Key) this.f15580c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f15579b, (TL_stories.TL_premium_boostsStatus) this.f15580c, (e2.h) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f15579b).lambda$requestReferenceFromServer$1((String) this.f15580c, (String) this.d, (zh.r4) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f15579b, (org.telegram.ui.Components.w9) this.f15580c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f15579b, (ArrayList[]) this.f15580c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f15579b, (TL_bots.BotInfo[]) this.f15580c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
