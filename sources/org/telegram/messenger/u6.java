package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19306a = 0;
    public final boolean f19307b;
    public final boolean f19308c;
    public final Object d;
    public final Object f19309e;
    public final Object f19310f;
    public final Object h;
    public final Object f19311n;

    public u6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19307b = z10;
        this.f19309e = photoSize;
        this.f19310f = messageObject;
        this.h = photo;
        this.f19308c = z11;
        this.f19311n = document;
    }

    @Override
    public final void run() {
        switch (this.f19306a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19307b, (TLRPC.PhotoSize) this.f19309e, (MessageObject) this.f19310f, (TLRPC.Photo) this.h, this.f19308c, (TLRPC.Document) this.f19311n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19309e, (ArrayList) this.f19310f, this.f19307b, this.f19308c, (ArrayList[]) this.h, (Runnable) this.f19311n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19309e, (TLRPC.TL_error) this.f19310f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f19311n, this.f19307b, this.f19308c);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19309e = num;
        this.f19310f = arrayList;
        this.f19307b = z10;
        this.f19308c = z11;
        this.h = arrayListArr;
        this.f19311n = runnable;
    }

    public u6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19309e = errorDelegate;
        this.f19310f = tL_error;
        this.h = m2Var;
        this.f19311n = tLObject;
        this.f19307b = z10;
        this.f19308c = z11;
    }
}
