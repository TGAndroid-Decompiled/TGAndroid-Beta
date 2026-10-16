package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements Runnable {
    public final int f17222a;
    public final BaseController f17223b;
    public final Object f17224c;
    public final Object d;
    public final Object e;
    public final Runnable f17225f;
    public final long h;

    public il(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f17222a = 2;
        this.f17223b = topicsController;
        this.f17224c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f17225f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17222a) {
            case 0:
                ((TranslateController) this.f17223b).lambda$translatePhoto$43((MessageObject) this.f17224c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17225f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17223b).lambda$translatePhoto$45((MessageObject) this.f17224c, (String) this.d, (TranslateController.MessageKey) this.e, this.f17225f, this.h);
                return;
            default:
                Runnable runnable = this.f17225f;
                ((TopicsController) this.f17223b).lambda$reloadTopics$14((TLObject) this.f17224c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public il(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f17222a = i10;
        this.f17223b = translateController;
        this.f17224c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f17225f = runnable;
        this.h = j10;
    }
}
