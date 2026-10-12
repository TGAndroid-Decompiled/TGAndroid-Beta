package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ua implements RequestDelegate {
    public final int f19085a;
    public final boolean f19086b;
    public final long f19087c;
    public final BaseController d;
    public final Object f19088e;
    public final Object f19089f;

    public ua(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f19085a = i10;
        this.d = baseController;
        this.f19088e = obj;
        this.f19086b = z10;
        this.f19087c = j3;
        this.f19089f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19085a) {
            case 0:
                boolean z10 = this.f19086b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.i) this.f19088e, this.f19087c, (MessagesController.SendAsPeersInfo) this.f19089f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f19087c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19088e, this.f19086b, j3, (Set) this.f19089f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19087c, this.f19086b, (String) this.f19088e, (Runnable) this.f19089f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f19087c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19088e, this.f19086b, j10, (RequestDelegate) this.f19089f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19086b, this.f19087c, (HashSet) this.f19088e, (Runnable) this.f19089f, tLObject, tL_error);
                return;
        }
    }

    public ua(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f19085a = 2;
        this.d = chatThemeController;
        this.f19087c = j3;
        this.f19086b = z10;
        this.f19088e = str;
        this.f19089f = runnable;
    }

    public ua(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19085a = 0;
        this.d = messagesController;
        this.f19088e = iVar;
        this.f19087c = j3;
        this.f19089f = sendAsPeersInfo;
        this.f19086b = z10;
    }

    public ua(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f19085a = 4;
        this.d = topicsController;
        this.f19086b = z10;
        this.f19087c = j3;
        this.f19088e = hashSet;
        this.f19089f = runnable;
    }
}
