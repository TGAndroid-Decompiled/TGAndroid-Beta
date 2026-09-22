package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17593a = 0;
    public final boolean f17594b;
    public final boolean f17595c;
    public final Object d;
    public final Object e;
    public final Object f17596f;
    public final Object h;
    public final Object f17597n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17594b = z10;
        this.e = photoSize;
        this.f17596f = messageObject;
        this.h = photo;
        this.f17595c = z11;
        this.f17597n = document;
    }

    @Override
    public final void run() {
        switch (this.f17593a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17594b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17596f, (TLRPC.Photo) this.h, this.f17595c, (TLRPC.Document) this.f17597n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17596f, this.f17594b, this.f17595c, (ArrayList[]) this.h, (Runnable) this.f17597n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17596f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17597n, this.f17594b, this.f17595c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17596f = arrayList;
        this.f17594b = z10;
        this.f17595c = z11;
        this.h = arrayListArr;
        this.f17597n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17596f = tL_error;
        this.h = n2Var;
        this.f17597n = tLObject;
        this.f17594b = z10;
        this.f17595c = z11;
    }
}
