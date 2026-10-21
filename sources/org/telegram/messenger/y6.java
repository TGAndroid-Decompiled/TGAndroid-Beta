package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f20130a = 0;
    public final boolean f20131b;
    public final boolean f20132c;
    public final Object d;
    public final Object e;
    public final Object f20133f;
    public final Object h;
    public final Object f20134n;

    public y6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f20131b = z10;
        this.e = photoSize;
        this.f20133f = messageObject;
        this.h = photo;
        this.f20132c = z11;
        this.f20134n = document;
    }

    @Override
    public final void run() {
        switch (this.f20130a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f20131b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f20133f, (TLRPC.Photo) this.h, this.f20132c, (TLRPC.Document) this.f20134n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f20133f, this.f20131b, this.f20132c, (ArrayList[]) this.h, (Runnable) this.f20134n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f20133f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f20134n, this.f20131b, this.f20132c);
                return;
        }
    }

    public y6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f20133f = arrayList;
        this.f20131b = z10;
        this.f20132c = z11;
        this.h = arrayListArr;
        this.f20134n = runnable;
    }

    public y6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f20133f = tL_error;
        this.h = n2Var;
        this.f20134n = tLObject;
        this.f20131b = z10;
        this.f20132c = z11;
    }
}
