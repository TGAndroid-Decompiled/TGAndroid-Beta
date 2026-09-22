package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements Runnable {
    public final int f16821a = 2;
    public final long f16822b;
    public final boolean f16823c;
    public final BaseController d;
    public final Object e;
    public final Object f16824f;
    public final Object h;

    public kd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f16822b = j3;
        this.f16823c = z10;
        this.f16824f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16821a) {
            case 0:
                boolean z10 = this.f16823c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.e, (a0.i) this.f16824f, this.f16822b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f16822b, (TranslateController.PendingTranslation) this.f16824f, this.f16823c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f16822b, this.f16823c, (String) this.f16824f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f16823c, this.f16822b, (HashSet) this.f16824f, (Runnable) this.h);
                return;
        }
    }

    public kd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f16824f = iVar;
        this.f16822b = j3;
        this.h = sendAsPeersInfo;
        this.f16823c = z10;
    }

    public kd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f16823c = z10;
        this.f16822b = j3;
        this.f16824f = hashSet;
        this.h = runnable;
    }

    public kd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f16822b = j3;
        this.f16824f = pendingTranslation;
        this.f16823c = z10;
        this.h = set;
    }
}
