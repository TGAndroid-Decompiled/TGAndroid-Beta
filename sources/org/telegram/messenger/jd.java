package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements Runnable {
    public final int f18256a = 2;
    public final long f18257b;
    public final boolean f18258c;
    public final BaseController d;
    public final Object f18259e;
    public final Object f18260f;
    public final Object h;

    public jd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f18259e = tLObject;
        this.f18257b = j3;
        this.f18258c = z10;
        this.f18260f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18256a) {
            case 0:
                boolean z10 = this.f18258c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f18259e, (a0.i) this.f18260f, this.f18257b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f18259e, this.f18257b, (TranslateController.PendingTranslation) this.f18260f, this.f18258c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f18259e, this.f18257b, this.f18258c, (String) this.f18260f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f18259e, this.f18258c, this.f18257b, (HashSet) this.f18260f, (Runnable) this.h);
                return;
        }
    }

    public jd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f18259e = tL_channels_sendAsPeers;
        this.f18260f = iVar;
        this.f18257b = j3;
        this.h = sendAsPeersInfo;
        this.f18258c = z10;
    }

    public jd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f18259e = tLObject;
        this.f18258c = z10;
        this.f18257b = j3;
        this.f18260f = hashSet;
        this.h = runnable;
    }

    public jd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f18259e = hashMap;
        this.f18257b = j3;
        this.f18260f = pendingTranslation;
        this.f18258c = z10;
        this.h = set;
    }
}
