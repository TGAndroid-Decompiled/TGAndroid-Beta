package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Stories.StoriesController;

public final class FileRefController$$ExternalSyntheticLambda21 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public FileRefController$$ExternalSyntheticLambda21(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((FileRefController) this.f$0).lambda$requestReferenceFromServer$1((String) this.f$1, (String) this.f$2, (StoriesController.BotPreview) obj);
                break;
            case 1:
                ((FactCheckController) this.f$0).lambda$getFactCheck$0((FactCheckController.Key) this.f$1, (MessageObject) this.f$2, (TLRPC.TL_factCheck) obj);
                break;
            case 2:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f$0, (TL_stories.TL_premium_boostsStatus) this.f$1, (Consumer) this.f$2, (TL_stories.TL_premium_myBoosts) obj);
                break;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f$1, (BackupImageView) this.f$0, (String) this.f$2, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f$0, (ArrayList[]) this.f$1, (Runnable) this.f$2, (ArrayList) obj);
                break;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f$0, (TL_bots.BotInfo[]) this.f$1, (Runnable) this.f$2, (TLRPC.UserFull) obj);
                break;
        }
    }

    public FileRefController$$ExternalSyntheticLambda21(String str, BackupImageView backupImageView, String str2) {
        this.$r8$classId = 3;
        this.f$1 = str;
        this.f$0 = backupImageView;
        this.f$2 = str2;
    }
}
