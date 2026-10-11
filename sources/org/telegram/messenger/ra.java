package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra implements RequestDelegate {
    public final int f19071a;
    public final boolean f19072b;
    public final long f19073c;
    public final BaseController d;
    public final Object f19074e;
    public final Object f19075f;

    public ra(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.f19071a = i10;
        this.d = baseController;
        this.f19074e = obj;
        this.f19072b = z10;
        this.f19073c = j3;
        this.f19075f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19071a) {
            case 0:
                boolean z10 = this.f19072b;
                ((MessagesController) this.d).lambda$getSendAsPeers$446((a0.i) this.f19074e, this.f19073c, (MessagesController.SendAsPeersInfo) this.f19075f, z10, tLObject, tL_error);
                return;
            case 1:
                long j3 = this.f19073c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.f19074e, this.f19072b, j3, (Set) this.f19075f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f19073c, this.f19072b, (String) this.f19074e, (Runnable) this.f19075f, tLObject, tL_error);
                return;
            case 3:
                long j10 = this.f19073c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.f19074e, this.f19072b, j10, (RequestDelegate) this.f19075f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f19072b, this.f19073c, (HashSet) this.f19074e, (Runnable) this.f19075f, tLObject, tL_error);
                return;
        }
    }

    public ra(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.f19071a = 2;
        this.d = chatThemeController;
        this.f19073c = j3;
        this.f19072b = z10;
        this.f19074e = str;
        this.f19075f = runnable;
    }

    public ra(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f19071a = 0;
        this.d = messagesController;
        this.f19074e = iVar;
        this.f19073c = j3;
        this.f19075f = sendAsPeersInfo;
        this.f19072b = z10;
    }

    public ra(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.f19071a = 4;
        this.d = topicsController;
        this.f19072b = z10;
        this.f19073c = j3;
        this.f19074e = hashSet;
        this.f19075f = runnable;
    }
}
