package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ua implements RequestDelegate {
    public final int f19084a;
    public final boolean f19085b;
    public final long f19086c;
    public final BaseController d;
    public final Object f19087e;
    public final Object f19088f;

    public ua(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f19084a = i10;
        this.d = baseController;
        this.f19087e = obj;
        this.f19085b = z10;
        this.f19086c = j3;
        this.f19088f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19084a) {
            case 0:
                boolean z10 = this.f19085b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.i) this.f19087e, this.f19086c, (MessagesController.SendAsPeersInfo) this.f19088f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f19086c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19087e, this.f19085b, j3, (Set) this.f19088f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19086c, this.f19085b, (String) this.f19087e, (Runnable) this.f19088f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f19086c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19087e, this.f19085b, j10, (RequestDelegate) this.f19088f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19085b, this.f19086c, (HashSet) this.f19087e, (Runnable) this.f19088f, tLObject, tL_error);
                return;
        }
    }

    public ua(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f19084a = 2;
        this.d = chatThemeController;
        this.f19086c = j3;
        this.f19085b = z10;
        this.f19087e = str;
        this.f19088f = runnable;
    }

    public ua(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19084a = 0;
        this.d = messagesController;
        this.f19087e = iVar;
        this.f19086c = j3;
        this.f19088f = sendAsPeersInfo;
        this.f19085b = z10;
    }

    public ua(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f19084a = 4;
        this.d = topicsController;
        this.f19085b = z10;
        this.f19086c = j3;
        this.f19087e = hashSet;
        this.f19088f = runnable;
    }
}
