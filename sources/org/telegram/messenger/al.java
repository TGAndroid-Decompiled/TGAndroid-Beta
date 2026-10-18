package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements Runnable {
    public final int f17906a;
    public final BaseController f17907b;
    public final Object f17908c;
    public final Object d;
    public final Object e;
    public final Runnable f17909f;
    public final long h;

    public al(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17906a = 2;
        this.f17907b = topicsController;
        this.f17908c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17909f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                ((TranslateController) this.f17907b).lambda$translatePhoto$43((MessageObject) this.f17908c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17909f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17907b).lambda$translatePhoto$45((MessageObject) this.f17908c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17909f, this.h);
                return;
            default:
                Runnable runnable = this.f17909f;
                ((TopicsController) this.f17907b).lambda$reloadTopics$14((TLObject) this.f17908c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public al(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17906a = i10;
        this.f17907b = translateController;
        this.f17908c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17909f = runnable;
        this.h = j10;
    }
}
