package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f20044a = 0;
    public final boolean f20045b;
    public final boolean f20046c;
    public final Object d;
    public final Object e;
    public final Object f20047f;
    public final Object h;
    public final Object f20048n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f20045b = z10;
        this.e = photoSize;
        this.f20047f = messageObject;
        this.h = photo;
        this.f20046c = z11;
        this.f20048n = document;
    }

    @Override
    public final void run() {
        switch (this.f20044a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f20045b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f20047f, (TLRPC.Photo) this.h, this.f20046c, (TLRPC.Document) this.f20048n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f20047f, this.f20045b, this.f20046c, (ArrayList[]) this.h, (Runnable) this.f20048n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f20047f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f20048n, this.f20045b, this.f20046c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f20047f = arrayList;
        this.f20045b = z10;
        this.f20046c = z11;
        this.h = arrayListArr;
        this.f20048n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f20047f = tL_error;
        this.h = n2Var;
        this.f20048n = tLObject;
        this.f20045b = z10;
        this.f20046c = z11;
    }
}
