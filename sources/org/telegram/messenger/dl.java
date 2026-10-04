package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17702a;
    public final BaseController f17703b;
    public final Object f17704c;
    public final Object d;
    public final Object f17705e;
    public final Runnable f17706f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17702a = 2;
        this.f17703b = topicsController;
        this.f17704c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17705e = iVar;
        this.f17706f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17702a) {
            case 0:
                ((TranslateController) this.f17703b).lambda$translatePhoto$43((MessageObject) this.f17704c, (String) this.d, (TranslateController.MessageKey) this.f17705e, this.f17706f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17703b).lambda$translatePhoto$45((MessageObject) this.f17704c, (String) this.d, (TranslateController.MessageKey) this.f17705e, this.f17706f, this.h);
                return;
            default:
                Runnable runnable = this.f17706f;
                ((TopicsController) this.f17703b).lambda$reloadTopics$14((TLObject) this.f17704c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17705e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17702a = i10;
        this.f17703b = translateController;
        this.f17704c = messageObject;
        this.d = str;
        this.f17705e = messageKey;
        this.f17706f = runnable;
        this.h = j3;
    }
}
