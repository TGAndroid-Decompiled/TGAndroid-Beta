package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sa implements RequestDelegate {
    public final int f21218a;
    public final boolean f21219b;
    public final long f21220c;
    public final BaseController d;
    public final Object e;
    public final Object f21221f;

    public sa(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21218a = i10;
        this.d = baseController;
        this.e = obj;
        this.f21219b = z10;
        this.f21220c = j10;
        this.f21221f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21218a) {
            case 0:
                boolean z10 = this.f21219b;
                ((MessagesController) this.d).lambda$getSendAsPeers$448((a0.h) this.e, this.f21220c, (MessagesController.SendAsPeersInfo) this.f21221f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f21220c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f21219b, j10, (Set) this.f21221f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f21220c, this.f21219b, (String) this.e, (Runnable) this.f21221f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f21220c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f21219b, j11, (RequestDelegate) this.f21221f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f21219b, this.f21220c, (HashSet) this.e, (Runnable) this.f21221f, tLObject, tL_error);
                return;
        }
    }

    public sa(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f21218a = 2;
        this.d = chatThemeController;
        this.f21220c = j10;
        this.f21219b = z10;
        this.e = str;
        this.f21221f = runnable;
    }

    public sa(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f21218a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f21220c = j10;
        this.f21221f = sendAsPeersInfo;
        this.f21219b = z10;
    }

    public sa(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f21218a = 4;
        this.d = topicsController;
        this.f21219b = z10;
        this.f21220c = j10;
        this.e = hashSet;
        this.f21221f = runnable;
    }
}
