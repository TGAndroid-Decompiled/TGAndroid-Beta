package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements Runnable {
    public final int f18109a;
    public final BaseController f18110b;
    public final Object f18111c;
    public final Object d;
    public final Object f18112e;
    public final Runnable f18113f;
    public final long h;

    public kl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f18109a = 2;
        this.f18110b = topicsController;
        this.f18111c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f18112e = iVar;
        this.f18113f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18109a) {
            case 0:
                ((TranslateController) this.f18110b).lambda$translatePhoto$43((MessageObject) this.f18111c, (String) this.d, (TranslateController.MessageKey) this.f18112e, this.f18113f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18110b).lambda$translatePhoto$45((MessageObject) this.f18111c, (String) this.d, (TranslateController.MessageKey) this.f18112e, this.f18113f, this.h);
                return;
            default:
                Runnable runnable = this.f18113f;
                ((TopicsController) this.f18110b).lambda$reloadTopics$14((TLObject) this.f18111c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f18112e, runnable);
                return;
        }
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f18109a = i10;
        this.f18110b = translateController;
        this.f18111c = messageObject;
        this.d = str;
        this.f18112e = messageKey;
        this.f18113f = runnable;
        this.h = j3;
    }
}
