package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class l2 implements Utilities.Callback {
    public final int f20563a;
    public final Object f20564b;
    public final Object f20565c;
    public final Object d;

    public l2(Object obj, Object obj2, Object obj3, int i10) {
        this.f20563a = i10;
        this.f20564b = obj;
        this.f20565c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20563a) {
            case 0:
                ((FactCheckController) this.f20564b).lambda$getFactCheck$0((FactCheckController.Key) this.f20565c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f20564b, (TL_stories.TL_premium_boostsStatus) this.f20565c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f20564b).lambda$requestReferenceFromServer$1((String) this.f20565c, (String) this.d, (di.r6) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f20564b, (ArrayList[]) this.f20565c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f20564b, (org.telegram.ui.Components.y9) this.f20565c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$505((boolean[]) this.f20564b, (TL_bots.BotInfo[]) this.f20565c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
