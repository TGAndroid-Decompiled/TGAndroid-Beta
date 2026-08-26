package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TopicsController$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final boolean f$1;
    public final long f$2;
    public final Object f$3;
    public final Object f$4;

    public TopicsController$$ExternalSyntheticLambda7(BaseController baseController, Object obj, boolean z, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$3 = obj;
        this.f$1 = z;
        this.f$2 = j;
        this.f$4 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsController) this.f$0).lambda$reloadTopics$16(this.f$1, this.f$2, (HashSet) this.f$3, (Runnable) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$getSendAsPeers$443((LongSparseArray) this.f$3, this.f$2, (MessagesController.SendAsPeersInfo) this.f$4, this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((TranslateController) this.f$0).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f$3, this.f$1, this.f$2, (Set) this.f$4, tLObject, tL_error);
                break;
            case 3:
                ((ChatThemeController) this.f$0).lambda$setWallpaperToPeer$17(this.f$2, this.f$1, (String) this.f$3, (Runnable) this.f$4, tLObject, tL_error);
                break;
            default:
                ((MemberRequestsController) this.f$0).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f$3, this.f$1, this.f$2, (RequestDelegate) this.f$4, tLObject, tL_error);
                break;
        }
    }

    public TopicsController$$ExternalSyntheticLambda7(ChatThemeController chatThemeController, long j, boolean z, String str, Runnable runnable) {
        this.$r8$classId = 3;
        this.f$0 = chatThemeController;
        this.f$2 = j;
        this.f$1 = z;
        this.f$3 = str;
        this.f$4 = runnable;
    }

    public TopicsController$$ExternalSyntheticLambda7(MessagesController messagesController, LongSparseArray longSparseArray, long j, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$3 = longSparseArray;
        this.f$2 = j;
        this.f$4 = sendAsPeersInfo;
        this.f$1 = z;
    }

    public TopicsController$$ExternalSyntheticLambda7(TopicsController topicsController, boolean z, long j, HashSet hashSet, Runnable runnable) {
        this.$r8$classId = 0;
        this.f$0 = topicsController;
        this.f$1 = z;
        this.f$2 = j;
        this.f$3 = hashSet;
        this.f$4 = runnable;
    }
}
