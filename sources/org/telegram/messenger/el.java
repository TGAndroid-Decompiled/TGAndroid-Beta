package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f18310a;
    public final BaseController f18311b;
    public final Object f18312c;
    public final Object d;
    public final Object e;
    public final Runnable f18313f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18310a = 2;
        this.f18311b = topicsController;
        this.f18312c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f18313f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18310a) {
            case 0:
                ((TranslateController) this.f18311b).lambda$translatePhoto$43((MessageObject) this.f18312c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18313f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18311b).lambda$translatePhoto$45((MessageObject) this.f18312c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18313f, this.h);
                return;
            default:
                Runnable runnable = this.f18313f;
                ((TopicsController) this.f18311b).lambda$reloadTopics$14((TLObject) this.f18312c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18310a = i10;
        this.f18311b = translateController;
        this.f18312c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f18313f = runnable;
        this.h = j10;
    }
}
