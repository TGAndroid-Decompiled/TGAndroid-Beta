package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md implements Runnable {
    public final int f20958a = 2;
    public final long f20959b;
    public final boolean f20960c;
    public final BaseController d;
    public final Object f20961e;
    public final Object f20962f;
    public final Object h;

    public md(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f20961e = tLObject;
        this.f20959b = j10;
        this.f20960c = z10;
        this.f20962f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20958a) {
            case 0:
                boolean z10 = this.f20960c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f20961e, (a0.h) this.f20962f, this.f20959b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f20961e, this.f20959b, (TranslateController.PendingTranslation) this.f20962f, this.f20960c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f20961e, this.f20959b, this.f20960c, (String) this.f20962f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f20961e, this.f20960c, this.f20959b, (HashSet) this.f20962f, (Runnable) this.h);
                return;
        }
    }

    public md(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f20961e = tL_channels_sendAsPeers;
        this.f20962f = hVar;
        this.f20959b = j10;
        this.h = sendAsPeersInfo;
        this.f20960c = z10;
    }

    public md(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f20961e = tLObject;
        this.f20960c = z10;
        this.f20959b = j10;
        this.f20962f = hashSet;
        this.h = runnable;
    }

    public md(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f20961e = hashMap;
        this.f20959b = j10;
        this.f20962f = pendingTranslation;
        this.f20960c = z10;
        this.h = set;
    }
}
