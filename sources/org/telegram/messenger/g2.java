package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f20295a;
    public final Object f20296b;
    public final Object f20297c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f20295a = i10;
        this.f20296b = obj;
        this.f20297c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20295a) {
            case 0:
                ((FactCheckController) this.f20296b).lambda$getFactCheck$0((FactCheckController.Key) this.f20297c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f20296b, (TL_stories.TL_premium_boostsStatus) this.f20297c, (f5.d) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f20296b).lambda$requestReferenceFromServer$1((String) this.f20297c, (String) this.d, (lh.b6) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f20296b, (org.telegram.ui.Components.t9) this.f20297c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f20296b, (ArrayList[]) this.f20297c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f20296b, (TL_bots.BotInfo[]) this.f20297c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
