package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17374a = 0;
    public final boolean f17375b;
    public final boolean f17376c;
    public final Object d;
    public final Object e;
    public final Object f17377f;
    public final Object h;
    public final Object f17378n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17375b = z10;
        this.e = photoSize;
        this.f17377f = messageObject;
        this.h = photo;
        this.f17376c = z11;
        this.f17378n = document;
    }

    @Override
    public final void run() {
        switch (this.f17374a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17375b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17377f, (TLRPC.Photo) this.h, this.f17376c, (TLRPC.Document) this.f17378n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17377f, this.f17375b, this.f17376c, (ArrayList[]) this.h, (Runnable) this.f17378n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17377f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f17378n, this.f17375b, this.f17376c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17377f = arrayList;
        this.f17375b = z10;
        this.f17376c = z11;
        this.h = arrayListArr;
        this.f17378n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17377f = tL_error;
        this.h = o2Var;
        this.f17378n = tLObject;
        this.f17375b = z10;
        this.f17376c = z11;
    }
}
