package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f17917a = 0;
    public final boolean f17918b;
    public final boolean f17919c;
    public final Object d;
    public final Object e;
    public final Object f17920f;
    public final Object h;
    public final Object f17921n;

    public b7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17918b = z10;
        this.e = photoSize;
        this.f17920f = messageObject;
        this.h = photo;
        this.f17919c = z11;
        this.f17921n = document;
    }

    @Override
    public final void run() {
        switch (this.f17917a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17918b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17920f, (TLRPC.Photo) this.h, this.f17919c, (TLRPC.Document) this.f17921n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f17920f, this.f17918b, this.f17919c, (ArrayList[]) this.h, (Runnable) this.f17921n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17920f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f17921n, this.f17918b, this.f17919c);
                return;
        }
    }

    public b7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17920f = arrayList;
        this.f17918b = z10;
        this.f17919c = z11;
        this.h = arrayListArr;
        this.f17921n = runnable;
    }

    public b7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17920f = tL_error;
        this.h = n2Var;
        this.f17921n = tLObject;
        this.f17918b = z10;
        this.f17919c = z11;
    }
}
