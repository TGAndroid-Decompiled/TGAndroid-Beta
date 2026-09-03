package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra implements RequestDelegate {
    public final int f19856a;
    public final boolean f19857b;
    public final long f19858c;
    public final BaseController d;
    public final Object f19859e;
    public final Object f19860f;

    public ra(BaseController baseController, Object obj, boolean z4, long j10, Object obj2, int i10) {
        this.f19856a = i10;
        this.d = baseController;
        this.f19859e = obj;
        this.f19857b = z4;
        this.f19858c = j10;
        this.f19860f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19856a) {
            case 0:
                boolean z4 = this.f19857b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.f19859e, this.f19858c, (MessagesController.SendAsPeersInfo) this.f19860f, z4, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f19858c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19859e, this.f19857b, j10, (Set) this.f19860f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19858c, this.f19857b, (String) this.f19859e, (Runnable) this.f19860f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f19858c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19859e, this.f19857b, j11, (RequestDelegate) this.f19860f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19857b, this.f19858c, (HashSet) this.f19859e, (Runnable) this.f19860f, tLObject, tL_error);
                return;
        }
    }

    public ra(ChatThemeController chatThemeController, long j10, boolean z4, String str, Runnable runnable) {
        this.f19856a = 2;
        this.d = chatThemeController;
        this.f19858c = j10;
        this.f19857b = z4;
        this.f19859e = str;
        this.f19860f = runnable;
    }

    public ra(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.f19856a = 0;
        this.d = messagesController;
        this.f19859e = hVar;
        this.f19858c = j10;
        this.f19860f = sendAsPeersInfo;
        this.f19857b = z4;
    }

    public ra(TopicsController topicsController, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.f19856a = 4;
        this.d = topicsController;
        this.f19857b = z4;
        this.f19858c = j10;
        this.f19859e = hashSet;
        this.f19860f = runnable;
    }
}
