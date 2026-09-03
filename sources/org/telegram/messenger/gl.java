package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f17319a;
    public final BaseController f17320b;
    public final Object f17321c;
    public final Object d;
    public final Object e;
    public final Runnable f17322f;
    public final long h;

    public gl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17319a = 2;
        this.f17320b = topicsController;
        this.f17321c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17322f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17319a) {
            case 0:
                ((TranslateController) this.f17320b).lambda$translatePhoto$43((MessageObject) this.f17321c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17322f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17320b).lambda$translatePhoto$45((MessageObject) this.f17321c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17322f, this.h);
                return;
            default:
                Runnable runnable = this.f17322f;
                ((TopicsController) this.f17320b).lambda$reloadTopics$14((TLObject) this.f17321c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17319a = i10;
        this.f17320b = translateController;
        this.f17321c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17322f = runnable;
        this.h = j10;
    }
}
