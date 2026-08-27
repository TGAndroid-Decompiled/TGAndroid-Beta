package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class oa implements RequestDelegate {

    public final int f21144a;

    public final boolean f21145b;

    public final long f21146c;
    public final BaseController d;

    public final Object f21147e;

    public final Object f21148f;

    public oa(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21144a = i10;
        this.d = baseController;
        this.f21147e = obj;
        this.f21145b = z10;
        this.f21146c = j10;
        this.f21148f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21144a) {
            case 0:
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.f21147e, this.f21146c, (MessagesController.SendAsPeersInfo) this.f21148f, this.f21145b, tLObject, tL_error);
                break;
            case 1:
                TranslateController translateController = (TranslateController) this.d;
                TranslateController.PendingTranslation pendingTranslation = (TranslateController.PendingTranslation) this.f21147e;
                Set set = (Set) this.f21148f;
                translateController.lambda$pushToTranslate$23(pendingTranslation, this.f21145b, this.f21146c, set, tLObject, tL_error);
                break;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f21146c, this.f21145b, (String) this.f21147e, (Runnable) this.f21148f, tLObject, tL_error);
                break;
            case 3:
                MemberRequestsController memberRequestsController = (MemberRequestsController) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f21147e;
                RequestDelegate requestDelegate = (RequestDelegate) this.f21148f;
                memberRequestsController.lambda$getImporters$1(tL_chatInviteImporter, this.f21145b, this.f21146c, requestDelegate, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f21145b, this.f21146c, (HashSet) this.f21147e, (Runnable) this.f21148f, tLObject, tL_error);
                break;
        }
    }

    public oa(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f21144a = 2;
        this.d = chatThemeController;
        this.f21146c = j10;
        this.f21145b = z10;
        this.f21147e = str;
        this.f21148f = runnable;
    }

    public oa(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f21144a = 0;
        this.d = messagesController;
        this.f21147e = hVar;
        this.f21146c = j10;
        this.f21148f = sendAsPeersInfo;
        this.f21145b = z10;
    }

    public oa(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f21144a = 4;
        this.d = topicsController;
        this.f21145b = z10;
        this.f21146c = j10;
        this.f21147e = hashSet;
        this.f21148f = runnable;
    }
}
