package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f16178a;
    public final Object f16179b;
    public final Object f16180c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f16178a = i10;
        this.f16179b = obj;
        this.f16180c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16178a) {
            case 0:
                ((FactCheckController) this.f16179b).lambda$getFactCheck$0((FactCheckController.Key) this.f16180c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f16179b, (TL_stories.TL_premium_boostsStatus) this.f16180c, (e2.h) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f16179b).lambda$requestReferenceFromServer$1((String) this.f16180c, (String) this.d, (ai.s8) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f16179b, (org.telegram.ui.Components.u9) this.f16180c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f16179b, (ArrayList[]) this.f16180c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f16179b, (TL_bots.BotInfo[]) this.f16180c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
