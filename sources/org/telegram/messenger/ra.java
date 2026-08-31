package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra implements RequestDelegate {
    public final int f19854a;
    public final boolean f19855b;
    public final long f19856c;
    public final BaseController d;
    public final Object f19857e;
    public final Object f19858f;

    public ra(BaseController baseController, Object obj, boolean z4, long j10, Object obj2, int i10) {
        this.f19854a = i10;
        this.d = baseController;
        this.f19857e = obj;
        this.f19855b = z4;
        this.f19856c = j10;
        this.f19858f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19854a) {
            case 0:
                boolean z4 = this.f19855b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.f19857e, this.f19856c, (MessagesController.SendAsPeersInfo) this.f19858f, z4, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f19856c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19857e, this.f19855b, j10, (Set) this.f19858f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19856c, this.f19855b, (String) this.f19857e, (Runnable) this.f19858f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f19856c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19857e, this.f19855b, j11, (RequestDelegate) this.f19858f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19855b, this.f19856c, (HashSet) this.f19857e, (Runnable) this.f19858f, tLObject, tL_error);
                return;
        }
    }

    public ra(ChatThemeController chatThemeController, long j10, boolean z4, String str, Runnable runnable) {
        this.f19854a = 2;
        this.d = chatThemeController;
        this.f19856c = j10;
        this.f19855b = z4;
        this.f19857e = str;
        this.f19858f = runnable;
    }

    public ra(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.f19854a = 0;
        this.d = messagesController;
        this.f19857e = hVar;
        this.f19856c = j10;
        this.f19858f = sendAsPeersInfo;
        this.f19855b = z4;
    }

    public ra(TopicsController topicsController, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.f19854a = 4;
        this.d = topicsController;
        this.f19855b = z4;
        this.f19856c = j10;
        this.f19857e = hashSet;
        this.f19858f = runnable;
    }
}
