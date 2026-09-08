package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements Runnable {
    public final int f18187a = 2;
    public final long f18188b;
    public final boolean f18189c;
    public final BaseController d;
    public final Object f18190e;
    public final Object f18191f;
    public final Object h;

    public kd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f18190e = tLObject;
        this.f18188b = j3;
        this.f18189c = z10;
        this.f18191f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                boolean z10 = this.f18189c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f18190e, (a0.i) this.f18191f, this.f18188b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f18190e, this.f18188b, (TranslateController.PendingTranslation) this.f18191f, this.f18189c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f18190e, this.f18188b, this.f18189c, (String) this.f18191f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f18190e, this.f18189c, this.f18188b, (HashSet) this.f18191f, (Runnable) this.h);
                return;
        }
    }

    public kd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f18190e = tL_channels_sendAsPeers;
        this.f18191f = iVar;
        this.f18188b = j3;
        this.h = sendAsPeersInfo;
        this.f18189c = z10;
    }

    public kd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f18190e = tLObject;
        this.f18189c = z10;
        this.f18188b = j3;
        this.f18191f = hashSet;
        this.h = runnable;
    }

    public kd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f18190e = hashMap;
        this.f18188b = j3;
        this.f18191f = pendingTranslation;
        this.f18189c = z10;
        this.h = set;
    }
}
