package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19068a = 0;
    public final boolean f19069b;
    public final boolean f19070c;
    public final Object d;
    public final Object f19071e;
    public final Object f19072f;
    public final Object h;
    public final Object f19073n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19069b = z10;
        this.f19071e = photoSize;
        this.f19072f = messageObject;
        this.h = photo;
        this.f19070c = z11;
        this.f19073n = document;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19069b, (TLRPC.PhotoSize) this.f19071e, (MessageObject) this.f19072f, (TLRPC.Photo) this.h, this.f19070c, (TLRPC.Document) this.f19073n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f19071e, (ArrayList) this.f19072f, this.f19069b, this.f19070c, (ArrayList[]) this.h, (Runnable) this.f19073n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19071e, (TLRPC.TL_error) this.f19072f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19073n, this.f19069b, this.f19070c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19071e = num;
        this.f19072f = arrayList;
        this.f19069b = z10;
        this.f19070c = z11;
        this.h = arrayListArr;
        this.f19073n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19071e = errorDelegate;
        this.f19072f = tL_error;
        this.h = n2Var;
        this.f19073n = tLObject;
        this.f19069b = z10;
        this.f19070c = z11;
    }
}
