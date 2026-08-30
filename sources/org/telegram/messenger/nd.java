package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f17937a = 2;
    public final long f17938b;
    public final boolean f17939c;
    public final BaseController d;
    public final Object e;
    public final Object f17940f;
    public final Object h;

    public nd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z4, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f17938b = j10;
        this.f17939c = z4;
        this.f17940f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17937a) {
            case 0:
                boolean z4 = this.f17939c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f17940f, this.f17938b, (MessagesController.SendAsPeersInfo) this.h, z4);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f17938b, (TranslateController.PendingTranslation) this.f17940f, this.f17939c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f17938b, this.f17939c, (String) this.f17940f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f17939c, this.f17938b, (HashSet) this.f17940f, (Runnable) this.h);
                return;
        }
    }

    public nd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f17940f = hVar;
        this.f17938b = j10;
        this.h = sendAsPeersInfo;
        this.f17939c = z4;
    }

    public nd(TopicsController topicsController, TLObject tLObject, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f17939c = z4;
        this.f17938b = j10;
        this.f17940f = hashSet;
        this.h = runnable;
    }

    public nd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z4, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f17938b = j10;
        this.f17940f = pendingTranslation;
        this.f17939c = z4;
        this.h = set;
    }
}
