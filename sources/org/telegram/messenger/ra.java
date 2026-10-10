package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra implements RequestDelegate {
    public final int f19032a;
    public final boolean f19033b;
    public final long f19034c;
    public final BaseController d;
    public final Object f19035e;
    public final Object f19036f;

    public ra(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f19032a = i10;
        this.d = baseController;
        this.f19035e = obj;
        this.f19033b = z10;
        this.f19034c = j3;
        this.f19036f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19032a) {
            case 0:
                boolean z10 = this.f19033b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.i) this.f19035e, this.f19034c, (MessagesController.SendAsPeersInfo) this.f19036f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f19034c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19035e, this.f19033b, j3, (Set) this.f19036f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19034c, this.f19033b, (String) this.f19035e, (Runnable) this.f19036f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f19034c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19035e, this.f19033b, j10, (RequestDelegate) this.f19036f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19033b, this.f19034c, (HashSet) this.f19035e, (Runnable) this.f19036f, tLObject, tL_error);
                return;
        }
    }

    public ra(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f19032a = 2;
        this.d = chatThemeController;
        this.f19034c = j3;
        this.f19033b = z10;
        this.f19035e = str;
        this.f19036f = runnable;
    }

    public ra(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19032a = 0;
        this.d = messagesController;
        this.f19035e = iVar;
        this.f19034c = j3;
        this.f19036f = sendAsPeersInfo;
        this.f19033b = z10;
    }

    public ra(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f19032a = 4;
        this.d = topicsController;
        this.f19033b = z10;
        this.f19034c = j3;
        this.f19035e = hashSet;
        this.f19036f = runnable;
    }
}
