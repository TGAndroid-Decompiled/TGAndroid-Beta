package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f18797a;
    public final BaseController f18798b;
    public final Object f18799c;
    public final Object d;
    public final Object f18800e;
    public final Runnable f18801f;
    public final long h;

    public gl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18797a = 2;
        this.f18798b = topicsController;
        this.f18799c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.f18800e = hVar;
        this.f18801f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18797a) {
            case 0:
                ((TranslateController) this.f18798b).lambda$translatePhoto$43((MessageObject) this.f18799c, (String) this.d, (TranslateController.MessageKey) this.f18800e, this.f18801f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18798b).lambda$translatePhoto$45((MessageObject) this.f18799c, (String) this.d, (TranslateController.MessageKey) this.f18800e, this.f18801f, this.h);
                return;
            default:
                Runnable runnable = this.f18801f;
                ((TopicsController) this.f18798b).lambda$reloadTopics$14((TLObject) this.f18799c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.f18800e, runnable);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18797a = i10;
        this.f18798b = translateController;
        this.f18799c = messageObject;
        this.d = str;
        this.f18800e = messageKey;
        this.f18801f = runnable;
        this.h = j10;
    }
}
