package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17792a;
    public final BaseController f17793b;
    public final Object f17794c;
    public final Object d;
    public final Object f17795e;
    public final Runnable f17796f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17792a = 2;
        this.f17793b = topicsController;
        this.f17794c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17795e = iVar;
        this.f17796f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17792a) {
            case 0:
                ((TranslateController) this.f17793b).lambda$translatePhoto$43((MessageObject) this.f17794c, (String) this.d, (TranslateController.MessageKey) this.f17795e, this.f17796f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17793b).lambda$translatePhoto$45((MessageObject) this.f17794c, (String) this.d, (TranslateController.MessageKey) this.f17795e, this.f17796f, this.h);
                return;
            default:
                Runnable runnable = this.f17796f;
                ((TopicsController) this.f17793b).lambda$reloadTopics$14((TLObject) this.f17794c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17795e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17792a = i10;
        this.f17793b = translateController;
        this.f17794c = messageObject;
        this.d = str;
        this.f17795e = messageKey;
        this.f17796f = runnable;
        this.h = j3;
    }
}
