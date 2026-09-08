package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17616a;
    public final BaseController f17617b;
    public final Object f17618c;
    public final Object d;
    public final Object f17619e;
    public final Runnable f17620f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17616a = 2;
        this.f17617b = topicsController;
        this.f17618c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17619e = iVar;
        this.f17620f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17616a) {
            case 0:
                ((TranslateController) this.f17617b).lambda$translatePhoto$43((MessageObject) this.f17618c, (String) this.d, (TranslateController.MessageKey) this.f17619e, this.f17620f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17617b).lambda$translatePhoto$45((MessageObject) this.f17618c, (String) this.d, (TranslateController.MessageKey) this.f17619e, this.f17620f, this.h);
                return;
            default:
                Runnable runnable = this.f17620f;
                ((TopicsController) this.f17617b).lambda$reloadTopics$14((TLObject) this.f17618c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17619e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17616a = i10;
        this.f17617b = translateController;
        this.f17618c = messageObject;
        this.d = str;
        this.f17619e = messageKey;
        this.f17620f = runnable;
        this.h = j3;
    }
}
