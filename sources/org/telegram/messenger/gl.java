package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements Runnable {
    public final int f20209a;
    public final BaseController f20210b;
    public final Object f20211c;
    public final Object d;
    public final Object e;
    public final Runnable f20212f;
    public final long h;

    public gl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f20209a = 2;
        this.f20210b = topicsController;
        this.f20211c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f20212f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20209a) {
            case 0:
                ((TranslateController) this.f20210b).lambda$translatePhoto$43((MessageObject) this.f20211c, (String) this.d, (TranslateController.MessageKey) this.e, this.f20212f, this.h);
                return;
            case 1:
                ((TranslateController) this.f20210b).lambda$translatePhoto$45((MessageObject) this.f20211c, (String) this.d, (TranslateController.MessageKey) this.e, this.f20212f, this.h);
                return;
            default:
                Runnable runnable = this.f20212f;
                ((TopicsController) this.f20210b).lambda$reloadTopics$14((TLObject) this.f20211c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f20209a = i10;
        this.f20210b = translateController;
        this.f20211c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f20212f = runnable;
        this.h = j10;
    }
}
