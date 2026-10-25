package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class l2 implements Utilities.Callback {
    public final int f20556a;
    public final Object f20557b;
    public final Object f20558c;
    public final Object d;

    public l2(Object obj, Object obj2, Object obj3, int i10) {
        this.f20556a = i10;
        this.f20557b = obj;
        this.f20558c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20556a) {
            case 0:
                ((FactCheckController) this.f20557b).lambda$getFactCheck$0((FactCheckController.Key) this.f20558c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f20557b, (TL_stories.TL_premium_boostsStatus) this.f20558c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f20557b).lambda$requestReferenceFromServer$1((String) this.f20558c, (String) this.d, (di.r6) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f20557b, (ArrayList[]) this.f20558c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f20557b, (org.telegram.ui.Components.y9) this.f20558c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$504((boolean[]) this.f20557b, (TL_bots.BotInfo[]) this.f20558c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
