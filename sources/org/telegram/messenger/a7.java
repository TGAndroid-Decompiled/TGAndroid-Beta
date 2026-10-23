package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f17908a = 0;
    public final boolean f17909b;
    public final boolean f17910c;
    public final Object d;
    public final Object e;
    public final Object f17911f;
    public final Object h;
    public final Object f17912n;

    public a7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17909b = z10;
        this.e = photoSize;
        this.f17911f = messageObject;
        this.h = photo;
        this.f17910c = z11;
        this.f17912n = document;
    }

    @Override
    public final void run() {
        switch (this.f17908a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17909b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17911f, (TLRPC.Photo) this.h, this.f17910c, (TLRPC.Document) this.f17912n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f17911f, this.f17909b, this.f17910c, (ArrayList[]) this.h, (Runnable) this.f17912n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17911f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f17912n, this.f17909b, this.f17910c);
                return;
        }
    }

    public a7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17911f = arrayList;
        this.f17909b = z10;
        this.f17910c = z11;
        this.h = arrayListArr;
        this.f17912n = runnable;
    }

    public a7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17911f = tL_error;
        this.h = o2Var;
        this.f17912n = tLObject;
        this.f17909b = z10;
        this.f17910c = z11;
    }
}
