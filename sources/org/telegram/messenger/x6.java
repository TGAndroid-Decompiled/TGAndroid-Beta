package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f20602a = 0;
    public final boolean f20603b;
    public final boolean f20604c;
    public final Object d;
    public final Object f20605e;
    public final Object f20606f;
    public final Object h;
    public final Object f20607n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z4, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f20603b = z4;
        this.f20605e = photoSize;
        this.f20606f = messageObject;
        this.h = photo;
        this.f20604c = z10;
        this.f20607n = document;
    }

    @Override
    public final void run() {
        switch (this.f20602a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f20603b, (TLRPC.PhotoSize) this.f20605e, (MessageObject) this.f20606f, (TLRPC.Photo) this.h, this.f20604c, (TLRPC.Document) this.f20607n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f20605e, (ArrayList) this.f20606f, this.f20603b, this.f20604c, (ArrayList[]) this.h, (Runnable) this.f20607n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f20605e, (TLRPC.TL_error) this.f20606f, (org.telegram.ui.ActionBar.p2) this.h, (TLObject) this.f20607n, this.f20603b, this.f20604c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z4, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f20605e = num;
        this.f20606f = arrayList;
        this.f20603b = z4;
        this.f20604c = z10;
        this.h = arrayListArr;
        this.f20607n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, boolean z4, boolean z10) {
        this.d = messagesController;
        this.f20605e = errorDelegate;
        this.f20606f = tL_error;
        this.h = p2Var;
        this.f20607n = tLObject;
        this.f20603b = z4;
        this.f20604c = z10;
    }
}
