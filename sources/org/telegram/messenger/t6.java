package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17361a = 0;
    public final boolean f17362b;
    public final boolean f17363c;
    public final Object d;
    public final Object e;
    public final Object f17364f;
    public final Object h;
    public final Object f17365n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17362b = z10;
        this.e = photoSize;
        this.f17364f = messageObject;
        this.h = photo;
        this.f17363c = z11;
        this.f17365n = document;
    }

    @Override
    public final void run() {
        switch (this.f17361a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17362b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17364f, (TLRPC.Photo) this.h, this.f17363c, (TLRPC.Document) this.f17365n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17364f, this.f17362b, this.f17363c, (ArrayList[]) this.h, (Runnable) this.f17365n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17364f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17365n, this.f17362b, this.f17363c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17364f = arrayList;
        this.f17362b = z10;
        this.f17363c = z11;
        this.h = arrayListArr;
        this.f17365n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17364f = tL_error;
        this.h = n2Var;
        this.f17365n = tLObject;
        this.f17362b = z10;
        this.f17363c = z11;
    }
}
