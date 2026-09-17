package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class na implements RequestDelegate {
    public final int f18504a;
    public final boolean f18505b;
    public final long f18506c;
    public final BaseController d;
    public final Object f18507e;
    public final Object f18508f;

    public na(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18504a = i10;
        this.d = baseController;
        this.f18507e = obj;
        this.f18505b = z10;
        this.f18506c = j3;
        this.f18508f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18504a) {
            case 0:
                boolean z10 = this.f18505b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18507e, this.f18506c, (MessagesController.SendAsPeersInfo) this.f18508f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18506c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18507e, this.f18505b, j3, (Set) this.f18508f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18506c, this.f18505b, (String) this.f18507e, (Runnable) this.f18508f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18506c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18507e, this.f18505b, j10, (RequestDelegate) this.f18508f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18505b, this.f18506c, (HashSet) this.f18507e, (Runnable) this.f18508f, tLObject, tL_error);
                return;
        }
    }

    public na(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18504a = 2;
        this.d = chatThemeController;
        this.f18506c = j3;
        this.f18505b = z10;
        this.f18507e = str;
        this.f18508f = runnable;
    }

    public na(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18504a = 0;
        this.d = messagesController;
        this.f18507e = iVar;
        this.f18506c = j3;
        this.f18508f = sendAsPeersInfo;
        this.f18505b = z10;
    }

    public na(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18504a = 4;
        this.d = topicsController;
        this.f18505b = z10;
        this.f18506c = j3;
        this.f18507e = hashSet;
        this.f18508f = runnable;
    }
}
