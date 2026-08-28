package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fd implements Runnable {
    public final int f20283a = 2;
    public final long f20284b;
    public final boolean f20285c;
    public final BaseController d;
    public final Object f20286e;
    public final Object f20287f;
    public final Object h;

    public fd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f20286e = tLObject;
        this.f20284b = j10;
        this.f20285c = z10;
        this.f20287f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20283a) {
            case 0:
                boolean z10 = this.f20285c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f20286e, (a0.h) this.f20287f, this.f20284b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f20286e, this.f20284b, (TranslateController.PendingTranslation) this.f20287f, this.f20285c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f20286e, this.f20284b, this.f20285c, (String) this.f20287f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f20286e, this.f20285c, this.f20284b, (HashSet) this.f20287f, (Runnable) this.h);
                return;
        }
    }

    public fd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f20286e = tL_channels_sendAsPeers;
        this.f20287f = hVar;
        this.f20284b = j10;
        this.h = sendAsPeersInfo;
        this.f20285c = z10;
    }

    public fd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f20286e = tLObject;
        this.f20285c = z10;
        this.f20284b = j10;
        this.f20287f = hashSet;
        this.h = runnable;
    }

    public fd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f20286e = hashMap;
        this.f20284b = j10;
        this.f20287f = pendingTranslation;
        this.f20285c = z10;
        this.h = set;
    }
}
