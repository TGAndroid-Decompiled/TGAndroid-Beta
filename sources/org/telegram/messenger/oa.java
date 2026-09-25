package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f17182a;
    public final boolean f17183b;
    public final long f17184c;
    public final BaseController d;
    public final Object e;
    public final Object f17185f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f17182a = i10;
        this.d = baseController;
        this.e = obj;
        this.f17183b = z10;
        this.f17184c = j3;
        this.f17185f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17182a) {
            case 0:
                boolean z10 = this.f17183b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.e, this.f17184c, (MessagesController.SendAsPeersInfo) this.f17185f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f17184c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f17183b, j3, (Set) this.f17185f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f17184c, this.f17183b, (String) this.e, (Runnable) this.f17185f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f17184c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f17183b, j10, (RequestDelegate) this.f17185f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f17183b, this.f17184c, (HashSet) this.e, (Runnable) this.f17185f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f17182a = 2;
        this.d = chatThemeController;
        this.f17184c = j3;
        this.f17183b = z10;
        this.e = str;
        this.f17185f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f17182a = 0;
        this.d = messagesController;
        this.e = iVar;
        this.f17184c = j3;
        this.f17185f = sendAsPeersInfo;
        this.f17183b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f17182a = 4;
        this.d = topicsController;
        this.f17183b = z10;
        this.f17184c = j3;
        this.e = hashSet;
        this.f17185f = runnable;
    }
}
