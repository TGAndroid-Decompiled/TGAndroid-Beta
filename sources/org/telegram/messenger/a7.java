package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f17845a = 0;
    public final boolean f17846b;
    public final boolean f17847c;
    public final Object d;
    public final Object e;
    public final Object f17848f;
    public final Object h;
    public final Object f17849n;

    public a7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17846b = z10;
        this.e = photoSize;
        this.f17848f = messageObject;
        this.h = photo;
        this.f17847c = z11;
        this.f17849n = document;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17846b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17848f, (TLRPC.Photo) this.h, this.f17847c, (TLRPC.Document) this.f17849n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f17848f, this.f17846b, this.f17847c, (ArrayList[]) this.h, (Runnable) this.f17849n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17848f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17849n, this.f17846b, this.f17847c);
                return;
        }
    }

    public a7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17848f = arrayList;
        this.f17846b = z10;
        this.f17847c = z11;
        this.h = arrayListArr;
        this.f17849n = runnable;
    }

    public a7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17848f = tL_error;
        this.h = n2Var;
        this.f17849n = tLObject;
        this.f17846b = z10;
        this.f17847c = z11;
    }
}
