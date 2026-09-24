package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17574a = 0;
    public final boolean f17575b;
    public final boolean f17576c;
    public final Object d;
    public final Object e;
    public final Object f17577f;
    public final Object h;
    public final Object f17578n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17575b = z10;
        this.e = photoSize;
        this.f17577f = messageObject;
        this.h = photo;
        this.f17576c = z11;
        this.f17578n = document;
    }

    @Override
    public final void run() {
        switch (this.f17574a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17575b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17577f, (TLRPC.Photo) this.h, this.f17576c, (TLRPC.Document) this.f17578n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17577f, this.f17575b, this.f17576c, (ArrayList[]) this.h, (Runnable) this.f17578n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17577f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f17578n, this.f17575b, this.f17576c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17577f = arrayList;
        this.f17575b = z10;
        this.f17576c = z11;
        this.h = arrayListArr;
        this.f17578n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17577f = tL_error;
        this.h = m2Var;
        this.f17578n = tLObject;
        this.f17575b = z10;
        this.f17576c = z11;
    }
}
