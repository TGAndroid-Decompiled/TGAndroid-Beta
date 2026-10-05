package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17707a;
    public final BaseController f17708b;
    public final Object f17709c;
    public final Object d;
    public final Object f17710e;
    public final Runnable f17711f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17707a = 2;
        this.f17708b = topicsController;
        this.f17709c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17710e = iVar;
        this.f17711f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17707a) {
            case 0:
                ((TranslateController) this.f17708b).lambda$translatePhoto$43((MessageObject) this.f17709c, (String) this.d, (TranslateController.MessageKey) this.f17710e, this.f17711f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17708b).lambda$translatePhoto$45((MessageObject) this.f17709c, (String) this.d, (TranslateController.MessageKey) this.f17710e, this.f17711f, this.h);
                return;
            default:
                Runnable runnable = this.f17711f;
                ((TopicsController) this.f17708b).lambda$reloadTopics$14((TLObject) this.f17709c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17710e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17707a = i10;
        this.f17708b = translateController;
        this.f17709c = messageObject;
        this.d = str;
        this.f17710e = messageKey;
        this.f17711f = runnable;
        this.h = j3;
    }
}
