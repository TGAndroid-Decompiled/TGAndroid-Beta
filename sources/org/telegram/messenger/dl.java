package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17700a;
    public final BaseController f17701b;
    public final Object f17702c;
    public final Object d;
    public final Object f17703e;
    public final Runnable f17704f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17700a = 2;
        this.f17701b = topicsController;
        this.f17702c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17703e = iVar;
        this.f17704f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17700a) {
            case 0:
                ((TranslateController) this.f17701b).lambda$translatePhoto$43((MessageObject) this.f17702c, (String) this.d, (TranslateController.MessageKey) this.f17703e, this.f17704f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17701b).lambda$translatePhoto$45((MessageObject) this.f17702c, (String) this.d, (TranslateController.MessageKey) this.f17703e, this.f17704f, this.h);
                return;
            default:
                Runnable runnable = this.f17704f;
                ((TopicsController) this.f17701b).lambda$reloadTopics$14((TLObject) this.f17702c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17703e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17700a = i10;
        this.f17701b = translateController;
        this.f17702c = messageObject;
        this.d = str;
        this.f17703e = messageKey;
        this.f17704f = runnable;
        this.h = j3;
    }
}
