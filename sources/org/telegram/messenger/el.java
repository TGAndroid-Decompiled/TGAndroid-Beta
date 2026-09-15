package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f16072a;
    public final BaseController f16073b;
    public final Object f16074c;
    public final Object d;
    public final Object e;
    public final Runnable f16075f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16072a = 2;
        this.f16073b = topicsController;
        this.f16074c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16075f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16072a) {
            case 0:
                ((TranslateController) this.f16073b).lambda$translatePhoto$43((MessageObject) this.f16074c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16075f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16073b).lambda$translatePhoto$45((MessageObject) this.f16074c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16075f, this.h);
                return;
            default:
                Runnable runnable = this.f16075f;
                ((TopicsController) this.f16073b).lambda$reloadTopics$14((TLObject) this.f16074c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16072a = i10;
        this.f16073b = translateController;
        this.f16074c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16075f = runnable;
        this.h = j3;
    }
}
