package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements Runnable {
    public final int f17448a;
    public final BaseController f17449b;
    public final Object f17450c;
    public final Object d;
    public final Object e;
    public final Runnable f17451f;
    public final long h;

    public hl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17448a = 2;
        this.f17449b = topicsController;
        this.f17450c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17451f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17448a) {
            case 0:
                ((TranslateController) this.f17449b).lambda$translatePhoto$43((MessageObject) this.f17450c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17451f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17449b).lambda$translatePhoto$45((MessageObject) this.f17450c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17451f, this.h);
                return;
            default:
                Runnable runnable = this.f17451f;
                ((TopicsController) this.f17449b).lambda$reloadTopics$14((TLObject) this.f17450c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public hl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17448a = i10;
        this.f17449b = translateController;
        this.f17450c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17451f = runnable;
        this.h = j10;
    }
}
