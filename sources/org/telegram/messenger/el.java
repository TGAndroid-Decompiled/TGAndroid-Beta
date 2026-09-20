package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class el implements Runnable {
    public final int f16293a;
    public final BaseController f16294b;
    public final Object f16295c;
    public final Object d;
    public final Object e;
    public final Runnable f16296f;
    public final long h;

    public el(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16293a = 2;
        this.f16294b = topicsController;
        this.f16295c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16296f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16293a) {
            case 0:
                ((TranslateController) this.f16294b).lambda$translatePhoto$43((MessageObject) this.f16295c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16296f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16294b).lambda$translatePhoto$45((MessageObject) this.f16295c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16296f, this.h);
                return;
            default:
                Runnable runnable = this.f16296f;
                ((TopicsController) this.f16294b).lambda$reloadTopics$14((TLObject) this.f16295c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public el(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16293a = i10;
        this.f16294b = translateController;
        this.f16295c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16296f = runnable;
        this.h = j3;
    }
}
