package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f16231a;
    public final BaseController f16232b;
    public final Object f16233c;
    public final Object d;
    public final Object e;
    public final Runnable f16234f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16231a = 2;
        this.f16232b = topicsController;
        this.f16233c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16234f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16231a) {
            case 0:
                ((TranslateController) this.f16232b).lambda$translatePhoto$43((MessageObject) this.f16233c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16234f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16232b).lambda$translatePhoto$45((MessageObject) this.f16233c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16234f, this.h);
                return;
            default:
                Runnable runnable = this.f16234f;
                ((TopicsController) this.f16232b).lambda$reloadTopics$14((TLObject) this.f16233c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16231a = i10;
        this.f16232b = translateController;
        this.f16233c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16234f = runnable;
        this.h = j3;
    }
}
