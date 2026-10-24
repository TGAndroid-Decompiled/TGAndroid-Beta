package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f17980a = 0;
    public final boolean f17981b;
    public final boolean f17982c;
    public final Object d;
    public final Object e;
    public final Object f17983f;
    public final Object h;
    public final Object f17984n;

    public b7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17981b = z10;
        this.e = photoSize;
        this.f17983f = messageObject;
        this.h = photo;
        this.f17982c = z11;
        this.f17984n = document;
    }

    @Override
    public final void run() {
        switch (this.f17980a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17981b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17983f, (TLRPC.Photo) this.h, this.f17982c, (TLRPC.Document) this.f17984n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f17983f, this.f17981b, this.f17982c, (ArrayList[]) this.h, (Runnable) this.f17984n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17983f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f17984n, this.f17981b, this.f17982c);
                return;
        }
    }

    public b7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17983f = arrayList;
        this.f17981b = z10;
        this.f17982c = z11;
        this.h = arrayListArr;
        this.f17984n = runnable;
    }

    public b7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17983f = tL_error;
        this.h = o2Var;
        this.f17984n = tLObject;
        this.f17981b = z10;
        this.f17982c = z11;
    }
}
