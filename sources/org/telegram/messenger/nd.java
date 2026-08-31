package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f19467a = 2;
    public final long f19468b;
    public final boolean f19469c;
    public final BaseController d;
    public final Object f19470e;
    public final Object f19471f;
    public final Object h;

    public nd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z4, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f19470e = tLObject;
        this.f19468b = j10;
        this.f19469c = z4;
        this.f19471f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19467a) {
            case 0:
                boolean z4 = this.f19469c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f19470e, (a0.h) this.f19471f, this.f19468b, (MessagesController.SendAsPeersInfo) this.h, z4);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f19470e, this.f19468b, (TranslateController.PendingTranslation) this.f19471f, this.f19469c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f19470e, this.f19468b, this.f19469c, (String) this.f19471f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f19470e, this.f19469c, this.f19468b, (HashSet) this.f19471f, (Runnable) this.h);
                return;
        }
    }

    public nd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.d = messagesController;
        this.f19470e = tL_channels_sendAsPeers;
        this.f19471f = hVar;
        this.f19468b = j10;
        this.h = sendAsPeersInfo;
        this.f19469c = z4;
    }

    public nd(TopicsController topicsController, TLObject tLObject, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f19470e = tLObject;
        this.f19469c = z4;
        this.f19468b = j10;
        this.f19471f = hashSet;
        this.h = runnable;
    }

    public nd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z4, Set set) {
        this.d = translateController;
        this.f19470e = hashMap;
        this.f19468b = j10;
        this.f19471f = pendingTranslation;
        this.f19469c = z4;
        this.h = set;
    }
}
