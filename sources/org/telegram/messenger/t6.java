package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f17365a = 0;
    public final boolean f17366b;
    public final boolean f17367c;
    public final Object d;
    public final Object e;
    public final Object f17368f;
    public final Object h;
    public final Object f17369n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17366b = z10;
        this.e = photoSize;
        this.f17368f = messageObject;
        this.h = photo;
        this.f17367c = z11;
        this.f17369n = document;
    }

    @Override
    public final void run() {
        switch (this.f17365a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17366b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17368f, (TLRPC.Photo) this.h, this.f17367c, (TLRPC.Document) this.f17369n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17368f, this.f17366b, this.f17367c, (ArrayList[]) this.h, (Runnable) this.f17369n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17368f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17369n, this.f17366b, this.f17367c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17368f = arrayList;
        this.f17366b = z10;
        this.f17367c = z11;
        this.h = arrayListArr;
        this.f17369n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17368f = tL_error;
        this.h = n2Var;
        this.f17369n = tLObject;
        this.f17366b = z10;
        this.f17367c = z11;
    }
}
