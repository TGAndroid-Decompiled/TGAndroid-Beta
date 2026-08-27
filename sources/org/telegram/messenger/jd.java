package org.telegram.messenger;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class jd implements Runnable {

    public final int f20671a = 2;

    public final long f20672b;

    public final boolean f20673c;
    public final BaseController d;

    public final Object f20674e;

    public final Object f20675f;
    public final Object h;

    public jd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f20674e = tLObject;
        this.f20672b = j10;
        this.f20673c = z10;
        this.f20675f = str;
        this.h = runnable;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.f20671a) {
            case 0:
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.f20674e, (a0.h) this.f20675f, this.f20672b, (MessagesController.SendAsPeersInfo) this.h, this.f20673c);
                break;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f20674e, this.f20672b, (TranslateController.PendingTranslation) this.f20675f, this.f20673c, (Set) this.h);
                break;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f20674e, this.f20672b, this.f20673c, (String) this.f20675f, (Runnable) this.h);
                break;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f20674e, this.f20673c, this.f20672b, (HashSet) this.f20675f, (Runnable) this.h);
                break;
        }
    }

    public jd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f20674e = tL_channels_sendAsPeers;
        this.f20675f = hVar;
        this.f20672b = j10;
        this.h = sendAsPeersInfo;
        this.f20673c = z10;
    }

    public jd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f20674e = tLObject;
        this.f20673c = z10;
        this.f20672b = j10;
        this.f20675f = hashSet;
        this.h = runnable;
    }

    public jd(TranslateController translateController, HashMap map, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f20674e = map;
        this.f20672b = j10;
        this.f20675f = pendingTranslation;
        this.f20673c = z10;
        this.h = set;
    }
}
