package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f19425a = 2;
    public final long f19426b;
    public final boolean f19427c;
    public final BaseController d;
    public final Object f19428e;
    public final Object f19429f;
    public final Object h;

    public vd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f19428e = tLObject;
        this.f19426b = j3;
        this.f19427c = z10;
        this.f19429f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19425a) {
            case 0:
                boolean z10 = this.f19427c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.f19428e, (a0.i) this.f19429f, this.f19426b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f19428e, this.f19426b, (TranslateController.PendingTranslation) this.f19429f, this.f19427c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f19428e, this.f19426b, this.f19427c, (String) this.f19429f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f19428e, this.f19427c, this.f19426b, (HashSet) this.f19429f, (Runnable) this.h);
                return;
        }
    }

    public vd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f19428e = tL_channels_sendAsPeers;
        this.f19429f = iVar;
        this.f19426b = j3;
        this.h = sendAsPeersInfo;
        this.f19427c = z10;
    }

    public vd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f19428e = tLObject;
        this.f19427c = z10;
        this.f19426b = j3;
        this.f19429f = hashSet;
        this.h = runnable;
    }

    public vd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f19428e = hashMap;
        this.f19426b = j3;
        this.f19429f = pendingTranslation;
        this.f19427c = z10;
        this.h = set;
    }
}
