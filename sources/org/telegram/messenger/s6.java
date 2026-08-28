package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s6 implements Runnable {
    public final int f21456a = 0;
    public final boolean f21457b;
    public final boolean f21458c;
    public final Object d;
    public final Object f21459e;
    public final Object f21460f;
    public final Object h;
    public final Object f21461n;

    public s6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f21457b = z10;
        this.f21459e = photoSize;
        this.f21460f = messageObject;
        this.h = photo;
        this.f21458c = z11;
        this.f21461n = document;
    }

    @Override
    public final void run() {
        switch (this.f21456a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f21457b, (TLRPC.PhotoSize) this.f21459e, (MessageObject) this.f21460f, (TLRPC.Photo) this.h, this.f21458c, (TLRPC.Document) this.f21461n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f21459e, (ArrayList) this.f21460f, this.f21457b, this.f21458c, (ArrayList[]) this.h, (Runnable) this.f21461n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f21459e, (TLRPC.TL_error) this.f21460f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f21461n, this.f21457b, this.f21458c);
                return;
        }
    }

    public s6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f21459e = num;
        this.f21460f = arrayList;
        this.f21457b = z10;
        this.f21458c = z11;
        this.h = arrayListArr;
        this.f21461n = runnable;
    }

    public s6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f21459e = errorDelegate;
        this.f21460f = tL_error;
        this.h = o2Var;
        this.f21461n = tLObject;
        this.f21457b = z10;
        this.f21458c = z11;
    }
}
