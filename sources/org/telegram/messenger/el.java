package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17790a;
    public final BaseController f17791b;
    public final Object f17792c;
    public final Object d;
    public final Object f17793e;
    public final Runnable f17794f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17790a = 2;
        this.f17791b = topicsController;
        this.f17792c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17793e = iVar;
        this.f17794f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                ((TranslateController) this.f17791b).lambda$translatePhoto$43((MessageObject) this.f17792c, (String) this.d, (TranslateController.MessageKey) this.f17793e, this.f17794f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17791b).lambda$translatePhoto$45((MessageObject) this.f17792c, (String) this.d, (TranslateController.MessageKey) this.f17793e, this.f17794f, this.h);
                return;
            default:
                Runnable runnable = this.f17794f;
                ((TopicsController) this.f17791b).lambda$reloadTopics$14((TLObject) this.f17792c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17793e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17790a = i10;
        this.f17791b = translateController;
        this.f17792c = messageObject;
        this.d = str;
        this.f17793e = messageKey;
        this.f17794f = runnable;
        this.h = j3;
    }
}
