package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements Runnable {
    public final int f16576a = 2;
    public final long f16577b;
    public final boolean f16578c;
    public final BaseController d;
    public final Object e;
    public final Object f16579f;
    public final Object h;

    public kd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f16577b = j3;
        this.f16578c = z10;
        this.f16579f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16576a) {
            case 0:
                boolean z10 = this.f16578c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.e, (a0.i) this.f16579f, this.f16577b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f16577b, (TranslateController.PendingTranslation) this.f16579f, this.f16578c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f16577b, this.f16578c, (String) this.f16579f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f16578c, this.f16577b, (HashSet) this.f16579f, (Runnable) this.h);
                return;
        }
    }

    public kd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f16579f = iVar;
        this.f16577b = j3;
        this.h = sendAsPeersInfo;
        this.f16578c = z10;
    }

    public kd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f16578c = z10;
        this.f16577b = j3;
        this.f16579f = hashSet;
        this.h = runnable;
    }

    public kd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f16577b = j3;
        this.f16579f = pendingTranslation;
        this.f16578c = z10;
        this.h = set;
    }
}
