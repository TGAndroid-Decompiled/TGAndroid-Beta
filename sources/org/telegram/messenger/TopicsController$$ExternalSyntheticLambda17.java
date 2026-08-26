package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TopicsController$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId = 3;
    public final BaseController f$0;
    public final Object f$1;
    public final boolean f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;

    public TopicsController$$ExternalSyntheticLambda17(ChatThemeController chatThemeController, TLObject tLObject, long j, boolean z, String str, Runnable runnable) {
        this.f$0 = chatThemeController;
        this.f$1 = tLObject;
        this.f$3 = j;
        this.f$2 = z;
        this.f$4 = str;
        this.f$5 = runnable;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsController) this.f$0).lambda$reloadTopics$15((TLObject) this.f$1, this.f$2, this.f$3, (HashSet) this.f$4, (Runnable) this.f$5);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f$1, (LongSparseArray) this.f$4, this.f$3, (MessagesController.SendAsPeersInfo) this.f$5, this.f$2);
                break;
            case 2:
                Set set = (Set) this.f$5;
                ((TranslateController) this.f$0).lambda$pushToTranslate$24((HashMap) this.f$1, this.f$3, (TranslateController.PendingTranslation) this.f$4, this.f$2, set);
                break;
            default:
                ((ChatThemeController) this.f$0).lambda$setWallpaperToPeer$16((TLObject) this.f$1, this.f$3, this.f$2, (String) this.f$4, (Runnable) this.f$5);
                break;
        }
    }

    public TopicsController$$ExternalSyntheticLambda17(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, LongSparseArray longSparseArray, long j, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z) {
        this.f$0 = messagesController;
        this.f$1 = tL_channels_sendAsPeers;
        this.f$4 = longSparseArray;
        this.f$3 = j;
        this.f$5 = sendAsPeersInfo;
        this.f$2 = z;
    }

    public TopicsController$$ExternalSyntheticLambda17(TopicsController topicsController, TLObject tLObject, boolean z, long j, HashSet hashSet, Runnable runnable) {
        this.f$0 = topicsController;
        this.f$1 = tLObject;
        this.f$2 = z;
        this.f$3 = j;
        this.f$4 = hashSet;
        this.f$5 = runnable;
    }

    public TopicsController$$ExternalSyntheticLambda17(TranslateController translateController, HashMap map, long j, TranslateController.PendingTranslation pendingTranslation, boolean z, Set set) {
        this.f$0 = translateController;
        this.f$1 = map;
        this.f$3 = j;
        this.f$4 = pendingTranslation;
        this.f$2 = z;
        this.f$5 = set;
    }
}
