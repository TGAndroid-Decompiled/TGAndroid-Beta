package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17701a;
    public final BaseController f17702b;
    public final Object f17703c;
    public final Object d;
    public final Object f17704e;
    public final Runnable f17705f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17701a = 2;
        this.f17702b = topicsController;
        this.f17703c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17704e = iVar;
        this.f17705f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17701a) {
            case 0:
                ((TranslateController) this.f17702b).lambda$translatePhoto$43((MessageObject) this.f17703c, (String) this.d, (TranslateController.MessageKey) this.f17704e, this.f17705f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17702b).lambda$translatePhoto$45((MessageObject) this.f17703c, (String) this.d, (TranslateController.MessageKey) this.f17704e, this.f17705f, this.h);
                return;
            default:
                Runnable runnable = this.f17705f;
                ((TopicsController) this.f17702b).lambda$reloadTopics$14((TLObject) this.f17703c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17704e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17701a = i10;
        this.f17702b = translateController;
        this.f17703c = messageObject;
        this.d = str;
        this.f17704e = messageKey;
        this.f17705f = runnable;
        this.h = j3;
    }
}
