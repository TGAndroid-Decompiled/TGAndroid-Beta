package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl implements Runnable {
    public final int f18127a;
    public final BaseController f18128b;
    public final Object f18129c;
    public final Object d;
    public final Object e;
    public final Runnable f18130f;
    public final long h;

    public cl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18127a = 2;
        this.f18128b = topicsController;
        this.f18129c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f18130f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18127a) {
            case 0:
                ((TranslateController) this.f18128b).lambda$translatePhoto$43((MessageObject) this.f18129c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18130f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18128b).lambda$translatePhoto$45((MessageObject) this.f18129c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18130f, this.h);
                return;
            default:
                Runnable runnable = this.f18130f;
                ((TopicsController) this.f18128b).lambda$reloadTopics$14((TLObject) this.f18129c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public cl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18127a = i10;
        this.f18128b = translateController;
        this.f18129c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f18130f = runnable;
        this.h = j10;
    }
}
