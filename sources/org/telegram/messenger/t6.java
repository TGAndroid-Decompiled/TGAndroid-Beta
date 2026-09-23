package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17336a = 0;
    public final boolean f17337b;
    public final boolean f17338c;
    public final Object d;
    public final Object e;
    public final Object f17339f;
    public final Object h;
    public final Object f17340n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17337b = z10;
        this.e = photoSize;
        this.f17339f = messageObject;
        this.h = photo;
        this.f17338c = z11;
        this.f17340n = document;
    }

    @Override
    public final void run() {
        switch (this.f17336a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17337b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17339f, (TLRPC.Photo) this.h, this.f17338c, (TLRPC.Document) this.f17340n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17339f, this.f17337b, this.f17338c, (ArrayList[]) this.h, (Runnable) this.f17340n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17339f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17340n, this.f17337b, this.f17338c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17339f = arrayList;
        this.f17337b = z10;
        this.f17338c = z11;
        this.h = arrayListArr;
        this.f17340n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17339f = tL_error;
        this.h = n2Var;
        this.f17340n = tLObject;
        this.f17337b = z10;
        this.f17338c = z11;
    }
}
