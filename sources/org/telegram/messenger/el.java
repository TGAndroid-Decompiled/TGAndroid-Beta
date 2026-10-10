package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17794a;
    public final BaseController f17795b;
    public final Object f17796c;
    public final Object d;
    public final Object f17797e;
    public final Runnable f17798f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17794a = 2;
        this.f17795b = topicsController;
        this.f17796c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17797e = iVar;
        this.f17798f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17794a) {
            case 0:
                ((TranslateController) this.f17795b).lambda$translatePhoto$43((MessageObject) this.f17796c, (String) this.d, (TranslateController.MessageKey) this.f17797e, this.f17798f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17795b).lambda$translatePhoto$45((MessageObject) this.f17796c, (String) this.d, (TranslateController.MessageKey) this.f17797e, this.f17798f, this.h);
                return;
            default:
                Runnable runnable = this.f17798f;
                ((TopicsController) this.f17795b).lambda$reloadTopics$14((TLObject) this.f17796c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17797e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17794a = i10;
        this.f17795b = translateController;
        this.f17796c = messageObject;
        this.d = str;
        this.f17797e = messageKey;
        this.f17798f = runnable;
        this.h = j3;
    }
}
