package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements Runnable {
    public final int f18115a = 2;
    public final long f18116b;
    public final boolean f18117c;
    public final BaseController d;
    public final Object f18118e;
    public final Object f18119f;
    public final Object h;

    public jd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f18118e = tLObject;
        this.f18116b = j3;
        this.f18117c = z10;
        this.f18119f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18115a) {
            case 0:
                boolean z10 = this.f18117c;
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f18118e, (a0.i) this.f18119f, this.f18116b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f18118e, this.f18116b, (TranslateController.PendingTranslation) this.f18119f, this.f18117c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f18118e, this.f18116b, this.f18117c, (String) this.f18119f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f18118e, this.f18117c, this.f18116b, (HashSet) this.f18119f, (Runnable) this.h);
                return;
        }
    }

    public jd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f18118e = tL_channels_sendAsPeers;
        this.f18119f = iVar;
        this.f18116b = j3;
        this.h = sendAsPeersInfo;
        this.f18117c = z10;
    }

    public jd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f18118e = tLObject;
        this.f18117c = z10;
        this.f18116b = j3;
        this.f18119f = hashSet;
        this.h = runnable;
    }

    public jd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f18118e = hashMap;
        this.f18116b = j3;
        this.f18119f = pendingTranslation;
        this.f18117c = z10;
        this.h = set;
    }
}
