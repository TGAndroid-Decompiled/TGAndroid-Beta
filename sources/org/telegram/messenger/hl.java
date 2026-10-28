package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements Runnable {
    public final int f20286a;
    public final BaseController f20287b;
    public final Object f20288c;
    public final Object d;
    public final Object e;
    public final Runnable f20289f;
    public final long h;

    public hl(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f20286a = 2;
        this.f20287b = topicsController;
        this.f20288c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.e = hVar;
        this.f20289f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20286a) {
            case 0:
                ((TranslateController) this.f20287b).lambda$translatePhoto$43((MessageObject) this.f20288c, (String) this.d, (TranslateController.MessageKey) this.e, this.f20289f, this.h);
                return;
            case 1:
                ((TranslateController) this.f20287b).lambda$translatePhoto$45((MessageObject) this.f20288c, (String) this.d, (TranslateController.MessageKey) this.e, this.f20289f, this.h);
                return;
            default:
                Runnable runnable = this.f20289f;
                ((TopicsController) this.f20287b).lambda$reloadTopics$14((TLObject) this.f20288c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.e, runnable);
                return;
        }
    }

    public hl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f20286a = i10;
        this.f20287b = translateController;
        this.f20288c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f20289f = runnable;
        this.h = j10;
    }
}
