package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements Runnable {
    public final int f17989a;
    public final BaseController f17990b;
    public final Object f17991c;
    public final Object d;
    public final Object e;
    public final Runnable f17992f;
    public final long h;

    public bl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17989a = 2;
        this.f17990b = topicsController;
        this.f17991c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17992f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                ((TranslateController) this.f17990b).lambda$translatePhoto$43((MessageObject) this.f17991c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17992f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17990b).lambda$translatePhoto$45((MessageObject) this.f17991c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17992f, this.h);
                return;
            default:
                Runnable runnable = this.f17992f;
                ((TopicsController) this.f17990b).lambda$reloadTopics$14((TLObject) this.f17991c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public bl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17989a = i10;
        this.f17990b = translateController;
        this.f17991c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17992f = runnable;
        this.h = j10;
    }
}
