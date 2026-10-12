package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements Runnable {
    public final int f18108a;
    public final BaseController f18109b;
    public final Object f18110c;
    public final Object d;
    public final Object f18111e;
    public final Runnable f18112f;
    public final long h;

    public kl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f18108a = 2;
        this.f18109b = topicsController;
        this.f18110c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f18111e = iVar;
        this.f18112f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18108a) {
            case 0:
                ((TranslateController) this.f18109b).lambda$translatePhoto$43((MessageObject) this.f18110c, (String) this.d, (TranslateController.MessageKey) this.f18111e, this.f18112f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18109b).lambda$translatePhoto$45((MessageObject) this.f18110c, (String) this.d, (TranslateController.MessageKey) this.f18111e, this.f18112f, this.h);
                return;
            default:
                Runnable runnable = this.f18112f;
                ((TopicsController) this.f18109b).lambda$reloadTopics$14((TLObject) this.f18110c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f18111e, runnable);
                return;
        }
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f18108a = i10;
        this.f18109b = translateController;
        this.f18110c = messageObject;
        this.d = str;
        this.f18111e = messageKey;
        this.f18112f = runnable;
        this.h = j3;
    }
}
