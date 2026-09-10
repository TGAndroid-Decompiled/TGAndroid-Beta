package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class va implements RequestDelegate {
    public final int f16580a;
    public final boolean f16581b;
    public final long f16582c;
    public final BaseController d;
    public final Object e;
    public final Object f16583f;

    public va(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f16580a = i10;
        this.d = baseController;
        this.e = obj;
        this.f16581b = z10;
        this.f16582c = j3;
        this.f16583f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16580a) {
            case 0:
                boolean z10 = this.f16581b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.e, this.f16582c, (MessagesController.SendAsPeersInfo) this.f16583f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f16582c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f16581b, j3, (Set) this.f16583f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f16582c, this.f16581b, (String) this.e, (Runnable) this.f16583f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f16582c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f16581b, j10, (RequestDelegate) this.f16583f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f16581b, this.f16582c, (HashSet) this.e, (Runnable) this.f16583f, tLObject, tL_error);
                return;
        }
    }

    public va(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f16580a = 2;
        this.d = chatThemeController;
        this.f16582c = j3;
        this.f16581b = z10;
        this.e = str;
        this.f16583f = runnable;
    }

    public va(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f16580a = 0;
        this.d = messagesController;
        this.e = iVar;
        this.f16582c = j3;
        this.f16583f = sendAsPeersInfo;
        this.f16581b = z10;
    }

    public va(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f16580a = 4;
        this.d = topicsController;
        this.f16581b = z10;
        this.f16582c = j3;
        this.e = hashSet;
        this.f16583f = runnable;
    }
}
