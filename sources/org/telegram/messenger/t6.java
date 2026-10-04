package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19211a = 0;
    public final boolean f19212b;
    public final boolean f19213c;
    public final Object d;
    public final Object f19214e;
    public final Object f19215f;
    public final Object h;
    public final Object f19216n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19212b = z10;
        this.f19214e = photoSize;
        this.f19215f = messageObject;
        this.h = photo;
        this.f19213c = z11;
        this.f19216n = document;
    }

    @Override
    public final void run() {
        switch (this.f19211a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19212b, (TLRPC.PhotoSize) this.f19214e, (MessageObject) this.f19215f, (TLRPC.Photo) this.h, this.f19213c, (TLRPC.Document) this.f19216n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19214e, (ArrayList) this.f19215f, this.f19212b, this.f19213c, (ArrayList[]) this.h, (Runnable) this.f19216n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19214e, (TLRPC.TL_error) this.f19215f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19216n, this.f19212b, this.f19213c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19214e = num;
        this.f19215f = arrayList;
        this.f19212b = z10;
        this.f19213c = z11;
        this.h = arrayListArr;
        this.f19216n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19214e = errorDelegate;
        this.f19215f = tL_error;
        this.h = n2Var;
        this.f19216n = tLObject;
        this.f19212b = z10;
        this.f19213c = z11;
    }
}
