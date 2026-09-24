package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f17167a;
    public final boolean f17168b;
    public final long f17169c;
    public final BaseController d;
    public final Object e;
    public final Object f17170f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17167a = i10;
        this.d = baseController;
        this.e = obj;
        this.f17168b = z10;
        this.f17169c = j3;
        this.f17170f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17167a) {
            case 0:
                boolean z10 = this.f17168b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.e, this.f17169c, (MessagesController.SendAsPeersInfo) this.f17170f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f17169c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f17168b, j3, (Set) this.f17170f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f17169c, this.f17168b, (String) this.e, (Runnable) this.f17170f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f17169c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f17168b, j10, (RequestDelegate) this.f17170f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f17168b, this.f17169c, (HashSet) this.e, (Runnable) this.f17170f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f17167a = 2;
        this.d = chatThemeController;
        this.f17169c = j3;
        this.f17168b = z10;
        this.e = str;
        this.f17170f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f17167a = 0;
        this.d = messagesController;
        this.e = iVar;
        this.f17169c = j3;
        this.f17170f = sendAsPeersInfo;
        this.f17168b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f17167a = 4;
        this.d = topicsController;
        this.f17168b = z10;
        this.f17169c = j3;
        this.e = hashSet;
        this.f17170f = runnable;
    }
}
