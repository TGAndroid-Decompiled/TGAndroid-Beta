package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17542a;
    public final BaseController f17543b;
    public final Object f17544c;
    public final Object d;
    public final Object f17545e;
    public final Runnable f17546f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17542a = 2;
        this.f17543b = topicsController;
        this.f17544c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17545e = iVar;
        this.f17546f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                ((TranslateController) this.f17543b).lambda$translatePhoto$43((MessageObject) this.f17544c, (String) this.d, (TranslateController.MessageKey) this.f17545e, this.f17546f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17543b).lambda$translatePhoto$45((MessageObject) this.f17544c, (String) this.d, (TranslateController.MessageKey) this.f17545e, this.f17546f, this.h);
                return;
            default:
                Runnable runnable = this.f17546f;
                ((TopicsController) this.f17543b).lambda$reloadTopics$14((TLObject) this.f17544c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17545e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17542a = i10;
        this.f17543b = translateController;
        this.f17544c = messageObject;
        this.d = str;
        this.f17545e = messageKey;
        this.f17546f = runnable;
        this.h = j3;
    }
}
