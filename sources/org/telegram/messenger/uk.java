package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uk implements Runnable {
    public final int f21704a;
    public final BaseController f21705b;
    public final Object f21706c;
    public final Object d;
    public final Object f21707e;
    public final Runnable f21708f;
    public final long h;

    public uk(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f21704a = 2;
        this.f21705b = topicsController;
        this.f21706c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.f21707e = hVar;
        this.f21708f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21704a) {
            case 0:
                ((TranslateController) this.f21705b).lambda$translatePhoto$43((MessageObject) this.f21706c, (String) this.d, (TranslateController.MessageKey) this.f21707e, this.f21708f, this.h);
                return;
            case 1:
                ((TranslateController) this.f21705b).lambda$translatePhoto$45((MessageObject) this.f21706c, (String) this.d, (TranslateController.MessageKey) this.f21707e, this.f21708f, this.h);
                return;
            default:
                Runnable runnable = this.f21708f;
                ((TopicsController) this.f21705b).lambda$reloadTopics$14((TLObject) this.f21706c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.f21707e, runnable);
                return;
        }
    }

    public uk(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i9) {
        this.f21704a = i9;
        this.f21705b = translateController;
        this.f21706c = messageObject;
        this.d = str;
        this.f21707e = messageKey;
        this.f21708f = runnable;
        this.h = j10;
    }
}
