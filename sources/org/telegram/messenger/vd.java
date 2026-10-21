package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f19741a = 2;
    public final long f19742b;
    public final boolean f19743c;
    public final BaseController d;
    public final Object e;
    public final Object f19744f;
    public final Object h;

    public vd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f19742b = j10;
        this.f19743c = z10;
        this.f19744f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19741a) {
            case 0:
                boolean z10 = this.f19743c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f19744f, this.f19742b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f19742b, (TranslateController.PendingTranslation) this.f19744f, this.f19743c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f19742b, this.f19743c, (String) this.f19744f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f19743c, this.f19742b, (HashSet) this.f19744f, (Runnable) this.h);
                return;
        }
    }

    public vd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f19744f = hVar;
        this.f19742b = j10;
        this.h = sendAsPeersInfo;
        this.f19743c = z10;
    }

    public vd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f19743c = z10;
        this.f19742b = j10;
        this.f19744f = hashSet;
        this.h = runnable;
    }

    public vd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f19742b = j10;
        this.f19744f = pendingTranslation;
        this.f19743c = z10;
        this.h = set;
    }
}
