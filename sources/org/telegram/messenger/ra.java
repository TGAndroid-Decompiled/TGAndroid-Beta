package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra implements RequestDelegate {
    public final int f18288a;
    public final boolean f18289b;
    public final long f18290c;
    public final BaseController d;
    public final Object e;
    public final Object f18291f;

    public ra(BaseController baseController, Object obj, boolean z4, long j10, Object obj2, int i10) {
        this.f18288a = i10;
        this.d = baseController;
        this.e = obj;
        this.f18289b = z4;
        this.f18290c = j10;
        this.f18291f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18288a) {
            case 0:
                boolean z4 = this.f18289b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.e, this.f18290c, (MessagesController.SendAsPeersInfo) this.f18291f, z4, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f18290c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f18289b, j10, (Set) this.f18291f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18290c, this.f18289b, (String) this.e, (Runnable) this.f18291f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f18290c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f18289b, j11, (RequestDelegate) this.f18291f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18289b, this.f18290c, (HashSet) this.e, (Runnable) this.f18291f, tLObject, tL_error);
                return;
        }
    }

    public ra(ChatThemeController chatThemeController, long j10, boolean z4, String str, Runnable runnable) {
        this.f18288a = 2;
        this.d = chatThemeController;
        this.f18290c = j10;
        this.f18289b = z4;
        this.e = str;
        this.f18291f = runnable;
    }

    public ra(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.f18288a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f18290c = j10;
        this.f18291f = sendAsPeersInfo;
        this.f18289b = z4;
    }

    public ra(TopicsController topicsController, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.f18288a = 4;
        this.d = topicsController;
        this.f18289b = z4;
        this.f18290c = j10;
        this.e = hashSet;
        this.f18291f = runnable;
    }
}
