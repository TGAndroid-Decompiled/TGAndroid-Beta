package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc implements Runnable {
    public final int f20514a = 2;
    public final long f20515b;
    public final boolean f20516c;
    public final BaseController d;
    public final Object e;
    public final Object f20517f;
    public final Object h;

    public kc(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f20515b = j10;
        this.f20516c = z10;
        this.f20517f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20514a) {
            case 0:
                boolean z10 = this.f20516c;
                ((MessagesController) this.d).lambda$getSendAsPeers$447((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f20517f, this.f20515b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f20515b, (TranslateController.PendingTranslation) this.f20517f, this.f20516c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f20515b, this.f20516c, (String) this.f20517f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f20516c, this.f20515b, (HashSet) this.f20517f, (Runnable) this.h);
                return;
        }
    }

    public kc(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f20517f = hVar;
        this.f20515b = j10;
        this.h = sendAsPeersInfo;
        this.f20516c = z10;
    }

    public kc(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f20516c = z10;
        this.f20515b = j10;
        this.f20517f = hashSet;
        this.h = runnable;
    }

    public kc(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f20515b = j10;
        this.f20517f = pendingTranslation;
        this.f20516c = z10;
        this.h = set;
    }
}
