package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa implements RequestDelegate {
    public final int f19330a;
    public final boolean f19331b;
    public final long f19332c;
    public final BaseController d;
    public final Object e;
    public final Object f19333f;

    public qa(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19330a = i10;
        this.d = baseController;
        this.e = obj;
        this.f19331b = z10;
        this.f19332c = j10;
        this.f19333f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19330a) {
            case 0:
                boolean z10 = this.f19331b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.h) this.e, this.f19332c, (MessagesController.SendAsPeersInfo) this.f19333f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f19332c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f19331b, j10, (Set) this.f19333f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19332c, this.f19331b, (String) this.e, (Runnable) this.f19333f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f19332c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f19331b, j11, (RequestDelegate) this.f19333f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19331b, this.f19332c, (HashSet) this.e, (Runnable) this.f19333f, tLObject, tL_error);
                return;
        }
    }

    public qa(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f19330a = 2;
        this.d = chatThemeController;
        this.f19332c = j10;
        this.f19331b = z10;
        this.e = str;
        this.f19333f = runnable;
    }

    public qa(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19330a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f19332c = j10;
        this.f19333f = sendAsPeersInfo;
        this.f19331b = z10;
    }

    public qa(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f19330a = 4;
        this.d = topicsController;
        this.f19331b = z10;
        this.f19332c = j10;
        this.e = hashSet;
        this.f19333f = runnable;
    }
}
