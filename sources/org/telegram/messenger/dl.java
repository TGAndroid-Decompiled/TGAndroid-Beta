package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f18280a;
    public final BaseController f18281b;
    public final Object f18282c;
    public final Object d;
    public final Object e;
    public final Runnable f18283f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f18280a = 2;
        this.f18281b = topicsController;
        this.f18282c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f18283f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                ((TranslateController) this.f18281b).lambda$translatePhoto$43((MessageObject) this.f18282c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18283f, this.h);
                return;
            case 1:
                ((TranslateController) this.f18281b).lambda$translatePhoto$45((MessageObject) this.f18282c, (String) this.d, (TranslateController.MessageKey) this.e, this.f18283f, this.h);
                return;
            default:
                Runnable runnable = this.f18283f;
                ((TopicsController) this.f18281b).lambda$reloadTopics$14((TLObject) this.f18282c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f18280a = i10;
        this.f18281b = translateController;
        this.f18282c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f18283f = runnable;
        this.h = j10;
    }
}
