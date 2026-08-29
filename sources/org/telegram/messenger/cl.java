package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl implements Runnable {
    public final int f19980a;
    public final BaseController f19981b;
    public final Object f19982c;
    public final Object d;
    public final Object f19983e;
    public final Runnable f19984f;
    public final long h;

    public cl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f19980a = 2;
        this.f19981b = topicsController;
        this.f19982c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.f19983e = hVar;
        this.f19984f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19980a) {
            case 0:
                ((TranslateController) this.f19981b).lambda$translatePhoto$43((MessageObject) this.f19982c, (String) this.d, (TranslateController.MessageKey) this.f19983e, this.f19984f, this.h);
                return;
            case 1:
                ((TranslateController) this.f19981b).lambda$translatePhoto$45((MessageObject) this.f19982c, (String) this.d, (TranslateController.MessageKey) this.f19983e, this.f19984f, this.h);
                return;
            default:
                Runnable runnable = this.f19984f;
                ((TopicsController) this.f19981b).lambda$reloadTopics$14((TLObject) this.f19982c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.f19983e, runnable);
                return;
        }
    }

    public cl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f19980a = i10;
        this.f19981b = translateController;
        this.f19982c = messageObject;
        this.d = str;
        this.f19983e = messageKey;
        this.f19984f = runnable;
        this.h = j10;
    }
}
