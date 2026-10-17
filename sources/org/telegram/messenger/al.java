package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements Runnable {
    public final int f17890a;
    public final BaseController f17891b;
    public final Object f17892c;
    public final Object d;
    public final Object e;
    public final Runnable f17893f;
    public final long h;

    public al(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17890a = 2;
        this.f17891b = topicsController;
        this.f17892c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17893f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                ((TranslateController) this.f17891b).lambda$translatePhoto$43((MessageObject) this.f17892c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17893f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17891b).lambda$translatePhoto$45((MessageObject) this.f17892c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17893f, this.h);
                return;
            default:
                Runnable runnable = this.f17893f;
                ((TopicsController) this.f17891b).lambda$reloadTopics$14((TLObject) this.f17892c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public al(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17890a = i10;
        this.f17891b = translateController;
        this.f17892c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17893f = runnable;
        this.h = j10;
    }
}
