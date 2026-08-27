package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class u6 implements Runnable {

    public final int f21693a = 0;

    public final boolean f21694b;

    public final boolean f21695c;
    public final Object d;

    public final Object f21696e;

    public final Object f21697f;
    public final Object h;

    public final Object f21698n;

    public u6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f21694b = z10;
        this.f21696e = photoSize;
        this.f21697f = messageObject;
        this.h = photo;
        this.f21695c = z11;
        this.f21698n = document;
    }

    @Override
    public final void run() {
        switch (this.f21693a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f21694b, (TLRPC.PhotoSize) this.f21696e, (MessageObject) this.f21697f, (TLRPC.Photo) this.h, this.f21695c, (TLRPC.Document) this.f21698n);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f21696e, (ArrayList) this.f21697f, this.f21694b, this.f21695c, (ArrayList[]) this.h, (Runnable) this.f21698n);
                break;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f21696e, (TLRPC.TL_error) this.f21697f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f21698n, this.f21694b, this.f21695c);
                break;
        }
    }

    public u6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f21696e = num;
        this.f21697f = arrayList;
        this.f21694b = z10;
        this.f21695c = z11;
        this.h = arrayListArr;
        this.f21698n = runnable;
    }

    public u6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f21696e = errorDelegate;
        this.f21697f = tL_error;
        this.h = n2Var;
        this.f21698n = tLObject;
        this.f21694b = z10;
        this.f21695c = z11;
    }
}
