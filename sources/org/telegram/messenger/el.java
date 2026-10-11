package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17828a;
    public final BaseController f17829b;
    public final Object f17830c;
    public final Object d;
    public final Object f17831e;
    public final Runnable f17832f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17828a = 2;
        this.f17829b = topicsController;
        this.f17830c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17831e = iVar;
        this.f17832f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17828a) {
            case 0:
                ((TranslateController) this.f17829b).lambda$translatePhoto$43((MessageObject) this.f17830c, (String) this.d, (TranslateController.MessageKey) this.f17831e, this.f17832f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17829b).lambda$translatePhoto$45((MessageObject) this.f17830c, (String) this.d, (TranslateController.MessageKey) this.f17831e, this.f17832f, this.h);
                return;
            default:
                Runnable runnable = this.f17832f;
                ((TopicsController) this.f17829b).lambda$reloadTopics$14((TLObject) this.f17830c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17831e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17828a = i10;
        this.f17829b = translateController;
        this.f17830c = messageObject;
        this.d = str;
        this.f17831e = messageKey;
        this.f17832f = runnable;
        this.h = j3;
    }
}
