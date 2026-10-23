package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl implements Runnable {
    public final int f18201a;
    public final BaseController f18202b;
    public final Object f18203c;
    public final Object d;
    public final Object e;
    public final Runnable f18204f;
    public final long h;

    public cl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18201a = 2;
        this.f18202b = topicsController;
        this.f18203c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f18204f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18201a) {
            case 0:
                ((TranslateController) this.f18202b).lambda$translatePhoto$43((MessageObject) this.f18203c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18204f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18202b).lambda$translatePhoto$45((MessageObject) this.f18203c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18204f, this.h);
                return;
            default:
                Runnable runnable = this.f18204f;
                ((TopicsController) this.f18202b).lambda$reloadTopics$14((TLObject) this.f18203c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public cl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18201a = i10;
        this.f18202b = translateController;
        this.f18203c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f18204f = runnable;
        this.h = j10;
    }
}
