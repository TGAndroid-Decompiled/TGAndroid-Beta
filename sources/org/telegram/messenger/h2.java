package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class h2 implements Utilities.Callback {
    public final int f18818a;
    public final Object f18819b;
    public final Object f18820c;
    public final Object d;

    public h2(Object obj, Object obj2, Object obj3, int i10) {
        this.f18818a = i10;
        this.f18819b = obj;
        this.f18820c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18818a) {
            case 0:
                ((FactCheckController) this.f18819b).lambda$getFactCheck$0((FactCheckController.Key) this.f18820c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f18819b, (TL_stories.TL_premium_boostsStatus) this.f18820c, (h5.d) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f18819b).lambda$requestReferenceFromServer$1((String) this.f18820c, (String) this.d, (oh.c6) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f18819b, (org.telegram.ui.Components.p9) this.f18820c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f18819b, (ArrayList[]) this.f18820c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f18819b, (TL_bots.BotInfo[]) this.f18820c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
