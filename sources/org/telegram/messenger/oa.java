package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f18761a;
    public final boolean f18762b;
    public final long f18763c;
    public final BaseController d;
    public final Object f18764e;
    public final Object f18765f;

    public oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18761a = i10;
        this.d = baseController;
        this.f18764e = obj;
        this.f18762b = z10;
        this.f18763c = j3;
        this.f18765f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18761a) {
            case 0:
                boolean z10 = this.f18762b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18764e, this.f18763c, (MessagesController.SendAsPeersInfo) this.f18765f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18763c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18764e, this.f18762b, j3, (Set) this.f18765f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18763c, this.f18762b, (String) this.f18764e, (Runnable) this.f18765f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18763c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18764e, this.f18762b, j10, (RequestDelegate) this.f18765f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18762b, this.f18763c, (HashSet) this.f18764e, (Runnable) this.f18765f, tLObject, tL_error);
                return;
        }
    }

    public oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18761a = 2;
        this.d = chatThemeController;
        this.f18763c = j3;
        this.f18762b = z10;
        this.f18764e = str;
        this.f18765f = runnable;
    }

    public oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18761a = 0;
        this.d = messagesController;
        this.f18764e = iVar;
        this.f18763c = j3;
        this.f18765f = sendAsPeersInfo;
        this.f18762b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18761a = 4;
        this.d = topicsController;
        this.f18762b = z10;
        this.f18763c = j3;
        this.f18764e = hashSet;
        this.f18765f = runnable;
    }
}
