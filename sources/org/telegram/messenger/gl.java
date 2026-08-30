package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f17337a;
    public final BaseController f17338b;
    public final Object f17339c;
    public final Object d;
    public final Object e;
    public final Runnable f17340f;
    public final long h;

    public gl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17337a = 2;
        this.f17338b = topicsController;
        this.f17339c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17340f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17337a) {
            case 0:
                ((TranslateController) this.f17338b).lambda$translatePhoto$43((MessageObject) this.f17339c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17340f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17338b).lambda$translatePhoto$45((MessageObject) this.f17339c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17340f, this.h);
                return;
            default:
                Runnable runnable = this.f17340f;
                ((TopicsController) this.f17338b).lambda$reloadTopics$14((TLObject) this.f17339c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17337a = i10;
        this.f17338b = translateController;
        this.f17339c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17340f = runnable;
        this.h = j10;
    }
}
