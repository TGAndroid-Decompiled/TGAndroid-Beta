package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f18581a;
    public final boolean f18582b;
    public final long f18583c;
    public final BaseController d;
    public final Object f18584e;
    public final Object f18585f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18581a = i10;
        this.d = baseController;
        this.f18584e = obj;
        this.f18582b = z10;
        this.f18583c = j3;
        this.f18585f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18581a) {
            case 0:
                boolean z10 = this.f18582b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18584e, this.f18583c, (MessagesController.SendAsPeersInfo) this.f18585f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18583c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18584e, this.f18582b, j3, (Set) this.f18585f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18583c, this.f18582b, (String) this.f18584e, (Runnable) this.f18585f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18583c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18584e, this.f18582b, j10, (RequestDelegate) this.f18585f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18582b, this.f18583c, (HashSet) this.f18584e, (Runnable) this.f18585f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18581a = 2;
        this.d = chatThemeController;
        this.f18583c = j3;
        this.f18582b = z10;
        this.f18584e = str;
        this.f18585f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18581a = 0;
        this.d = messagesController;
        this.f18584e = iVar;
        this.f18583c = j3;
        this.f18585f = sendAsPeersInfo;
        this.f18582b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18581a = 4;
        this.d = topicsController;
        this.f18582b = z10;
        this.f18583c = j3;
        this.f18584e = hashSet;
        this.f18585f = runnable;
    }
}
