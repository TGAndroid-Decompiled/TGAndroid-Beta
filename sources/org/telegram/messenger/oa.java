package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f18765a;
    public final boolean f18766b;
    public final long f18767c;
    public final BaseController d;
    public final Object f18768e;
    public final Object f18769f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18765a = i10;
        this.d = baseController;
        this.f18768e = obj;
        this.f18766b = z10;
        this.f18767c = j3;
        this.f18769f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18765a) {
            case 0:
                boolean z10 = this.f18766b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18768e, this.f18767c, (MessagesController.SendAsPeersInfo) this.f18769f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18767c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18768e, this.f18766b, j3, (Set) this.f18769f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18767c, this.f18766b, (String) this.f18768e, (Runnable) this.f18769f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18767c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18768e, this.f18766b, j10, (RequestDelegate) this.f18769f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18766b, this.f18767c, (HashSet) this.f18768e, (Runnable) this.f18769f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18765a = 2;
        this.d = chatThemeController;
        this.f18767c = j3;
        this.f18766b = z10;
        this.f18768e = str;
        this.f18769f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18765a = 0;
        this.d = messagesController;
        this.f18768e = iVar;
        this.f18767c = j3;
        this.f18769f = sendAsPeersInfo;
        this.f18766b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18765a = 4;
        this.d = topicsController;
        this.f18766b = z10;
        this.f18767c = j3;
        this.f18768e = hashSet;
        this.f18769f = runnable;
    }
}
