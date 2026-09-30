package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f16239a;
    public final BaseController f16240b;
    public final Object f16241c;
    public final Object d;
    public final Object e;
    public final Runnable f16242f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16239a = 2;
        this.f16240b = topicsController;
        this.f16241c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16242f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16239a) {
            case 0:
                ((TranslateController) this.f16240b).lambda$translatePhoto$43((MessageObject) this.f16241c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16242f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16240b).lambda$translatePhoto$45((MessageObject) this.f16241c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16242f, this.h);
                return;
            default:
                Runnable runnable = this.f16242f;
                ((TopicsController) this.f16240b).lambda$reloadTopics$14((TLObject) this.f16241c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16239a = i10;
        this.f16240b = translateController;
        this.f16241c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16242f = runnable;
        this.h = j3;
    }
}
