package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f17589a;
    public final BaseController f17590b;
    public final Object f17591c;
    public final Object d;
    public final Object f17592e;
    public final Runnable f17593f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17589a = 2;
        this.f17590b = topicsController;
        this.f17591c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17592e = iVar;
        this.f17593f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                ((TranslateController) this.f17590b).lambda$translatePhoto$43((MessageObject) this.f17591c, (String) this.d, (TranslateController.MessageKey) this.f17592e, this.f17593f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17590b).lambda$translatePhoto$45((MessageObject) this.f17591c, (String) this.d, (TranslateController.MessageKey) this.f17592e, this.f17593f, this.h);
                return;
            default:
                Runnable runnable = this.f17593f;
                ((TopicsController) this.f17590b).lambda$reloadTopics$14((TLObject) this.f17591c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17592e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17589a = i10;
        this.f17590b = translateController;
        this.f17591c = messageObject;
        this.d = str;
        this.f17592e = messageKey;
        this.f17593f = runnable;
        this.h = j3;
    }
}
