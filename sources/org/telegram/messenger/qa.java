package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa implements RequestDelegate {
    public final int f19332a;
    public final boolean f19333b;
    public final long f19334c;
    public final BaseController d;
    public final Object e;
    public final Object f19335f;

    public qa(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f19332a = i10;
        this.d = baseController;
        this.e = obj;
        this.f19333b = z10;
        this.f19334c = j10;
        this.f19335f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19332a) {
            case 0:
                boolean z10 = this.f19333b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.h) this.e, this.f19334c, (MessagesController.SendAsPeersInfo) this.f19335f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f19334c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f19333b, j10, (Set) this.f19335f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19334c, this.f19333b, (String) this.e, (Runnable) this.f19335f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f19334c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f19333b, j11, (RequestDelegate) this.f19335f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19333b, this.f19334c, (HashSet) this.e, (Runnable) this.f19335f, tLObject, tL_error);
                return;
        }
    }

    public qa(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f19332a = 2;
        this.d = chatThemeController;
        this.f19334c = j10;
        this.f19333b = z10;
        this.e = str;
        this.f19335f = runnable;
    }

    public qa(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19332a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f19334c = j10;
        this.f19335f = sendAsPeersInfo;
        this.f19333b = z10;
    }

    public qa(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f19332a = 4;
        this.d = topicsController;
        this.f19333b = z10;
        this.f19334c = j10;
        this.e = hashSet;
        this.f19335f = runnable;
    }
}
