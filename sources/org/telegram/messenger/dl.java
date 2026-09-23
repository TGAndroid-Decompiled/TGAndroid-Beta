package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f15977a;
    public final BaseController f15978b;
    public final Object f15979c;
    public final Object d;
    public final Object e;
    public final Runnable f15980f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f15977a = 2;
        this.f15978b = topicsController;
        this.f15979c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f15980f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15977a) {
            case 0:
                ((TranslateController) this.f15978b).lambda$translatePhoto$43((MessageObject) this.f15979c, (String) this.d, (TranslateController.MessageKey) this.e, this.f15980f, this.h);
                return;
            case 1:
                ((TranslateController) this.f15978b).lambda$translatePhoto$45((MessageObject) this.f15979c, (String) this.d, (TranslateController.MessageKey) this.e, this.f15980f, this.h);
                return;
            default:
                Runnable runnable = this.f15980f;
                ((TopicsController) this.f15978b).lambda$reloadTopics$14((TLObject) this.f15979c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f15977a = i10;
        this.f15978b = translateController;
        this.f15979c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f15980f = runnable;
        this.h = j3;
    }
}
