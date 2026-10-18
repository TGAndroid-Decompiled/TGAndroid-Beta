package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class j2 implements Utilities.Callback {
    public final int f18667a;
    public final Object f18668b;
    public final Object f18669c;
    public final Object d;

    public j2(Object obj, Object obj2, Object obj3, int i10) {
        this.f18667a = i10;
        this.f18668b = obj;
        this.f18669c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18667a) {
            case 0:
                ((FactCheckController) this.f18668b).lambda$getFactCheck$0((FactCheckController.Key) this.f18669c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f18668b, (TL_stories.TL_premium_boostsStatus) this.f18669c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f18668b).lambda$requestReferenceFromServer$1((String) this.f18669c, (String) this.d, (ci.s6) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18668b, (ArrayList[]) this.f18669c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f18668b, (org.telegram.ui.Components.w9) this.f18669c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f18668b, (TL_bots.BotInfo[]) this.f18669c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
