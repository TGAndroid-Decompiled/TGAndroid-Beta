package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements Runnable {
    public final int f15813a;
    public final BaseController f15814b;
    public final Object f15815c;
    public final Object d;
    public final Object e;
    public final Runnable f15816f;
    public final long h;

    public ml(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f15813a = 2;
        this.f15814b = topicsController;
        this.f15815c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f15816f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15813a) {
            case 0:
                ((TranslateController) this.f15814b).lambda$translatePhoto$43((MessageObject) this.f15815c, (String) this.d, (TranslateController.MessageKey) this.e, this.f15816f, this.h);
                return;
            case 1:
                ((TranslateController) this.f15814b).lambda$translatePhoto$45((MessageObject) this.f15815c, (String) this.d, (TranslateController.MessageKey) this.e, this.f15816f, this.h);
                return;
            default:
                Runnable runnable = this.f15816f;
                ((TopicsController) this.f15814b).lambda$reloadTopics$14((TLObject) this.f15815c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f15813a = i10;
        this.f15814b = translateController;
        this.f15815c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f15816f = runnable;
        this.h = j3;
    }
}
