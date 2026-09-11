package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17515a;
    public final BaseController f17516b;
    public final Object f17517c;
    public final Object d;
    public final Object f17518e;
    public final Runnable f17519f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f17515a = 2;
        this.f17516b = topicsController;
        this.f17517c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.f17518e = iVar;
        this.f17519f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17515a) {
            case 0:
                ((TranslateController) this.f17516b).lambda$translatePhoto$43((MessageObject) this.f17517c, (String) this.d, (TranslateController.MessageKey) this.f17518e, this.f17519f, this.h);
                return;
            case 1:
                ((TranslateController) this.f17516b).lambda$translatePhoto$45((MessageObject) this.f17517c, (String) this.d, (TranslateController.MessageKey) this.f17518e, this.f17519f, this.h);
                return;
            default:
                Runnable runnable = this.f17519f;
                ((TopicsController) this.f17516b).lambda$reloadTopics$14((TLObject) this.f17517c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.f17518e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f17515a = i10;
        this.f17516b = translateController;
        this.f17517c = messageObject;
        this.d = str;
        this.f17518e = messageKey;
        this.f17519f = runnable;
        this.h = j3;
    }
}
