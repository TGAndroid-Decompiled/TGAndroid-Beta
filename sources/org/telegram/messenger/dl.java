package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f16238a;
    public final BaseController f16239b;
    public final Object f16240c;
    public final Object d;
    public final Object e;
    public final Runnable f16241f;
    public final long h;

    public dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.f16238a = 2;
        this.f16239b = topicsController;
        this.f16240c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f16241f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16238a) {
            case 0:
                ((TranslateController) this.f16239b).lambda$translatePhoto$43((MessageObject) this.f16240c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16241f, this.h);
                return;
            case 1:
                ((TranslateController) this.f16239b).lambda$translatePhoto$45((MessageObject) this.f16240c, (String) this.d, (TranslateController.MessageKey) this.e, this.f16241f, this.h);
                return;
            default:
                Runnable runnable = this.f16241f;
                ((TopicsController) this.f16239b).lambda$reloadTopics$14((TLObject) this.f16240c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, runnable);
                return;
        }
    }

    public dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.f16238a = i10;
        this.f16239b = translateController;
        this.f16240c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f16241f = runnable;
        this.h = j3;
    }
}
