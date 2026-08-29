package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa implements RequestDelegate {
    public final int f21328a;
    public final boolean f21329b;
    public final long f21330c;
    public final BaseController d;
    public final Object f21331e;
    public final Object f21332f;

    public qa(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21328a = i10;
        this.d = baseController;
        this.f21331e = obj;
        this.f21329b = z10;
        this.f21330c = j10;
        this.f21332f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21328a) {
            case 0:
                boolean z10 = this.f21329b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.f21331e, this.f21330c, (MessagesController.SendAsPeersInfo) this.f21332f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f21330c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f21331e, this.f21329b, j10, (Set) this.f21332f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f21330c, this.f21329b, (String) this.f21331e, (Runnable) this.f21332f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f21330c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f21331e, this.f21329b, j11, (RequestDelegate) this.f21332f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f21329b, this.f21330c, (HashSet) this.f21331e, (Runnable) this.f21332f, tLObject, tL_error);
                return;
        }
    }

    public qa(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f21328a = 2;
        this.d = chatThemeController;
        this.f21330c = j10;
        this.f21329b = z10;
        this.f21331e = str;
        this.f21332f = runnable;
    }

    public qa(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f21328a = 0;
        this.d = messagesController;
        this.f21331e = hVar;
        this.f21330c = j10;
        this.f21332f = sendAsPeersInfo;
        this.f21329b = z10;
    }

    public qa(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f21328a = 4;
        this.d = topicsController;
        this.f21329b = z10;
        this.f21330c = j10;
        this.f21331e = hashSet;
        this.f21332f = runnable;
    }
}
