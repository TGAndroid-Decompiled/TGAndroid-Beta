package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ua implements RequestDelegate {
    public final int f18572a;
    public final boolean f18573b;
    public final long f18574c;
    public final BaseController d;
    public final Object e;
    public final Object f18575f;

    public ua(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f18572a = i10;
        this.d = baseController;
        this.e = obj;
        this.f18573b = z10;
        this.f18574c = j10;
        this.f18575f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18572a) {
            case 0:
                boolean z10 = this.f18573b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.h) this.e, this.f18574c, (MessagesController.SendAsPeersInfo) this.f18575f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f18574c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f18573b, j10, (Set) this.f18575f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18574c, this.f18573b, (String) this.e, (Runnable) this.f18575f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f18574c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f18573b, j11, (RequestDelegate) this.f18575f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18573b, this.f18574c, (HashSet) this.e, (Runnable) this.f18575f, tLObject, tL_error);
                return;
        }
    }

    public ua(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f18572a = 2;
        this.d = chatThemeController;
        this.f18574c = j10;
        this.f18573b = z10;
        this.e = str;
        this.f18575f = runnable;
    }

    public ua(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18572a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f18574c = j10;
        this.f18575f = sendAsPeersInfo;
        this.f18573b = z10;
    }

    public ua(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f18572a = 4;
        this.d = topicsController;
        this.f18573b = z10;
        this.f18574c = j10;
        this.e = hashSet;
        this.f18575f = runnable;
    }
}
