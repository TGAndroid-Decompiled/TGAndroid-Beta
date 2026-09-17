package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s6 implements Runnable {
    public final int f18984a = 0;
    public final boolean f18985b;
    public final boolean f18986c;
    public final Object d;
    public final Object f18987e;
    public final Object f18988f;
    public final Object h;
    public final Object f18989n;

    public s6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f18985b = z10;
        this.f18987e = photoSize;
        this.f18988f = messageObject;
        this.h = photo;
        this.f18986c = z11;
        this.f18989n = document;
    }

    @Override
    public final void run() {
        switch (this.f18984a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f18985b, (TLRPC.PhotoSize) this.f18987e, (MessageObject) this.f18988f, (TLRPC.Photo) this.h, this.f18986c, (TLRPC.Document) this.f18989n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f18987e, (ArrayList) this.f18988f, this.f18985b, this.f18986c, (ArrayList[]) this.h, (Runnable) this.f18989n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f18987e, (TLRPC.TL_error) this.f18988f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f18989n, this.f18985b, this.f18986c);
                return;
        }
    }

    public s6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f18987e = num;
        this.f18988f = arrayList;
        this.f18985b = z10;
        this.f18986c = z11;
        this.h = arrayListArr;
        this.f18989n = runnable;
    }

    public s6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f18987e = errorDelegate;
        this.f18988f = tL_error;
        this.h = n2Var;
        this.f18989n = tLObject;
        this.f18985b = z10;
        this.f18986c = z11;
    }
}
