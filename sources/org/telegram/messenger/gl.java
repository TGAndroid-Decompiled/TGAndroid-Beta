package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f18799a;
    public final BaseController f18800b;
    public final Object f18801c;
    public final Object d;
    public final Object f18802e;
    public final Runnable f18803f;
    public final long h;

    public gl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18799a = 2;
        this.f18800b = topicsController;
        this.f18801c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.f18802e = hVar;
        this.f18803f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18799a) {
            case 0:
                ((TranslateController) this.f18800b).lambda$translatePhoto$43((MessageObject) this.f18801c, (String) this.d, (TranslateController.MessageKey) this.f18802e, this.f18803f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18800b).lambda$translatePhoto$45((MessageObject) this.f18801c, (String) this.d, (TranslateController.MessageKey) this.f18802e, this.f18803f, this.h);
                return;
            default:
                Runnable runnable = this.f18803f;
                ((TopicsController) this.f18800b).lambda$reloadTopics$14((TLObject) this.f18801c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.f18802e, runnable);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18799a = i10;
        this.f18800b = translateController;
        this.f18801c = messageObject;
        this.d = str;
        this.f18802e = messageKey;
        this.f18803f = runnable;
        this.h = j10;
    }
}
