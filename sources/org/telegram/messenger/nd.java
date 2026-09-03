package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f19469a = 2;
    public final long f19470b;
    public final boolean f19471c;
    public final BaseController d;
    public final Object f19472e;
    public final Object f19473f;
    public final Object h;

    public nd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z4, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f19472e = tLObject;
        this.f19470b = j10;
        this.f19471c = z4;
        this.f19473f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19469a) {
            case 0:
                boolean z4 = this.f19471c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f19472e, (a0.h) this.f19473f, this.f19470b, (MessagesController.SendAsPeersInfo) this.h, z4);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f19472e, this.f19470b, (TranslateController.PendingTranslation) this.f19473f, this.f19471c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f19472e, this.f19470b, this.f19471c, (String) this.f19473f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f19472e, this.f19471c, this.f19470b, (HashSet) this.f19473f, (Runnable) this.h);
                return;
        }
    }

    public nd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.d = messagesController;
        this.f19472e = tL_channels_sendAsPeers;
        this.f19473f = hVar;
        this.f19470b = j10;
        this.h = sendAsPeersInfo;
        this.f19471c = z4;
    }

    public nd(TopicsController topicsController, TLObject tLObject, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f19472e = tLObject;
        this.f19471c = z4;
        this.f19470b = j10;
        this.f19473f = hashSet;
        this.h = runnable;
    }

    public nd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z4, Set set) {
        this.d = translateController;
        this.f19472e = hashMap;
        this.f19470b = j10;
        this.f19473f = pendingTranslation;
        this.f19471c = z4;
        this.h = set;
    }
}
