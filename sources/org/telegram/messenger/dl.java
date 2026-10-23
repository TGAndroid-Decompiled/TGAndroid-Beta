package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f18237a;
    public final BaseController f18238b;
    public final Object f18239c;
    public final Object d;
    public final Object e;
    public final Runnable f18240f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18237a = 2;
        this.f18238b = topicsController;
        this.f18239c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f18240f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18237a) {
            case 0:
                ((TranslateController) this.f18238b).lambda$translatePhoto$43((MessageObject) this.f18239c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18240f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18238b).lambda$translatePhoto$45((MessageObject) this.f18239c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18240f, this.h);
                return;
            default:
                Runnable runnable = this.f18240f;
                ((TopicsController) this.f18238b).lambda$reloadTopics$14((TLObject) this.f18239c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18237a = i10;
        this.f18238b = translateController;
        this.f18239c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f18240f = runnable;
        this.h = j10;
    }
}
