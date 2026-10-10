package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19308a = 0;
    public final boolean f19309b;
    public final boolean f19310c;
    public final Object d;
    public final Object f19311e;
    public final Object f19312f;
    public final Object h;
    public final Object f19313n;

    public u6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19309b = z10;
        this.f19311e = photoSize;
        this.f19312f = messageObject;
        this.h = photo;
        this.f19310c = z11;
        this.f19313n = document;
    }

    @Override
    public final void run() {
        switch (this.f19308a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19309b, (TLRPC.PhotoSize) this.f19311e, (MessageObject) this.f19312f, (TLRPC.Photo) this.h, this.f19310c, (TLRPC.Document) this.f19313n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19311e, (ArrayList) this.f19312f, this.f19309b, this.f19310c, (ArrayList[]) this.h, (Runnable) this.f19313n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19311e, (TLRPC.TL_error) this.f19312f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19313n, this.f19309b, this.f19310c);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19311e = num;
        this.f19312f = arrayList;
        this.f19309b = z10;
        this.f19310c = z11;
        this.h = arrayListArr;
        this.f19313n = runnable;
    }

    public u6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19311e = errorDelegate;
        this.f19312f = tL_error;
        this.h = n2Var;
        this.f19313n = tLObject;
        this.f19309b = z10;
        this.f19310c = z11;
    }
}
