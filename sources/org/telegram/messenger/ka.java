package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ka implements RequestDelegate {
    public final int f20770a;
    public final boolean f20771b;
    public final long f20772c;
    public final BaseController d;
    public final Object f20773e;
    public final Object f20774f;

    public ka(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i9) {
        this.f20770a = i9;
        this.d = baseController;
        this.f20773e = obj;
        this.f20771b = z10;
        this.f20772c = j10;
        this.f20774f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20770a) {
            case 0:
                boolean z10 = this.f20771b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.f20773e, this.f20772c, (MessagesController.SendAsPeersInfo) this.f20774f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f20772c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f20773e, this.f20771b, j10, (Set) this.f20774f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f20772c, this.f20771b, (String) this.f20773e, (Runnable) this.f20774f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f20772c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f20773e, this.f20771b, j11, (RequestDelegate) this.f20774f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f20771b, this.f20772c, (HashSet) this.f20773e, (Runnable) this.f20774f, tLObject, tL_error);
                return;
        }
    }

    public ka(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f20770a = 2;
        this.d = chatThemeController;
        this.f20772c = j10;
        this.f20771b = z10;
        this.f20773e = str;
        this.f20774f = runnable;
    }

    public ka(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f20770a = 0;
        this.d = messagesController;
        this.f20773e = hVar;
        this.f20772c = j10;
        this.f20774f = sendAsPeersInfo;
        this.f20771b = z10;
    }

    public ka(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f20770a = 4;
        this.d = topicsController;
        this.f20771b = z10;
        this.f20772c = j10;
        this.f20773e = hashSet;
        this.f20774f = runnable;
    }
}
