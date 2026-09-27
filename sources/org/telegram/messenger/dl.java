package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f16225a;
    public final BaseController f16226b;
    public final Object f16227c;
    public final Object d;
    public final Object e;
    public final Runnable f16228f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16225a = 2;
        this.f16226b = topicsController;
        this.f16227c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16228f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16225a) {
            case 0:
                ((TranslateController) this.f16226b).lambda$translatePhoto$43((MessageObject) this.f16227c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16228f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16226b).lambda$translatePhoto$45((MessageObject) this.f16227c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16228f, this.h);
                return;
            default:
                Runnable runnable = this.f16228f;
                ((TopicsController) this.f16226b).lambda$reloadTopics$14((TLObject) this.f16227c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16225a = i10;
        this.f16226b = translateController;
        this.f16227c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16228f = runnable;
        this.h = j3;
    }
}
