package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class na implements RequestDelegate {
    public final int f18477a;
    public final boolean f18478b;
    public final long f18479c;
    public final BaseController d;
    public final Object f18480e;
    public final Object f18481f;

    public na(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f18477a = i10;
        this.d = baseController;
        this.f18480e = obj;
        this.f18478b = z10;
        this.f18479c = j3;
        this.f18481f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18477a) {
            case 0:
                boolean z10 = this.f18478b;
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.f18480e, this.f18479c, (MessagesController.SendAsPeersInfo) this.f18481f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f18479c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f18480e, this.f18478b, j3, (Set) this.f18481f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f18479c, this.f18478b, (String) this.f18480e, (Runnable) this.f18481f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f18479c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f18480e, this.f18478b, j10, (RequestDelegate) this.f18481f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f18478b, this.f18479c, (HashSet) this.f18480e, (Runnable) this.f18481f, tLObject, tL_error);
                return;
        }
    }

    public na(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f18477a = 2;
        this.d = chatThemeController;
        this.f18479c = j3;
        this.f18478b = z10;
        this.f18480e = str;
        this.f18481f = runnable;
    }

    public na(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f18477a = 0;
        this.d = messagesController;
        this.f18480e = iVar;
        this.f18479c = j3;
        this.f18481f = sendAsPeersInfo;
        this.f18478b = z10;
    }

    public na(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f18477a = 4;
        this.d = topicsController;
        this.f18478b = z10;
        this.f18479c = j3;
        this.f18480e = hashSet;
        this.f18481f = runnable;
    }
}
