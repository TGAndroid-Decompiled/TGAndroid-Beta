package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17583a = 0;
    public final boolean f17584b;
    public final boolean f17585c;
    public final Object d;
    public final Object e;
    public final Object f17586f;
    public final Object h;
    public final Object f17587n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17584b = z10;
        this.e = photoSize;
        this.f17586f = messageObject;
        this.h = photo;
        this.f17585c = z11;
        this.f17587n = document;
    }

    @Override
    public final void run() {
        switch (this.f17583a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17584b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17586f, (TLRPC.Photo) this.h, this.f17585c, (TLRPC.Document) this.f17587n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17586f, this.f17584b, this.f17585c, (ArrayList[]) this.h, (Runnable) this.f17587n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17586f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f17587n, this.f17584b, this.f17585c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17586f = arrayList;
        this.f17584b = z10;
        this.f17585c = z11;
        this.h = arrayListArr;
        this.f17587n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17586f = tL_error;
        this.h = o2Var;
        this.f17587n = tLObject;
        this.f17584b = z10;
        this.f17585c = z11;
    }
}
