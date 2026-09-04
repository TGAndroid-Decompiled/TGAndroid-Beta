package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f18554a;
    public final boolean f18555b;
    public final long f18556c;
    public final BaseController d;
    public final Object f18557e;
    public final Object f18558f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18554a = i10;
        this.d = baseController;
        this.f18557e = obj;
        this.f18555b = z10;
        this.f18556c = j3;
        this.f18558f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18554a) {
            case 0:
                boolean z10 = this.f18555b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18557e, this.f18556c, (MessagesController.SendAsPeersInfo) this.f18558f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18556c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18557e, this.f18555b, j3, (Set) this.f18558f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18556c, this.f18555b, (String) this.f18557e, (Runnable) this.f18558f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18556c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18557e, this.f18555b, j10, (RequestDelegate) this.f18558f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18555b, this.f18556c, (HashSet) this.f18557e, (Runnable) this.f18558f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18554a = 2;
        this.d = chatThemeController;
        this.f18556c = j3;
        this.f18555b = z10;
        this.f18557e = str;
        this.f18558f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18554a = 0;
        this.d = messagesController;
        this.f18557e = iVar;
        this.f18556c = j3;
        this.f18558f = sendAsPeersInfo;
        this.f18555b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18554a = 4;
        this.d = topicsController;
        this.f18555b = z10;
        this.f18556c = j3;
        this.f18557e = hashSet;
        this.f18558f = runnable;
    }
}
