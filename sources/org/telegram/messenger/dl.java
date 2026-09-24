package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f16216a;
    public final BaseController f16217b;
    public final Object f16218c;
    public final Object d;
    public final Object e;
    public final Runnable f16219f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16216a = 2;
        this.f16217b = topicsController;
        this.f16218c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16219f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16216a) {
            case 0:
                ((TranslateController) this.f16217b).lambda$translatePhoto$43((MessageObject) this.f16218c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16219f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16217b).lambda$translatePhoto$45((MessageObject) this.f16218c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16219f, this.h);
                return;
            default:
                Runnable runnable = this.f16219f;
                ((TopicsController) this.f16217b).lambda$reloadTopics$14((TLObject) this.f16218c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16216a = i10;
        this.f16217b = translateController;
        this.f16218c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16219f = runnable;
        this.h = j3;
    }
}
