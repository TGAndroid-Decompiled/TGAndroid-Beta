package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f20600a = 0;
    public final boolean f20601b;
    public final boolean f20602c;
    public final Object d;
    public final Object f20603e;
    public final Object f20604f;
    public final Object h;
    public final Object f20605n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z4, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f20601b = z4;
        this.f20603e = photoSize;
        this.f20604f = messageObject;
        this.h = photo;
        this.f20602c = z10;
        this.f20605n = document;
    }

    @Override
    public final void run() {
        switch (this.f20600a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f20601b, (TLRPC.PhotoSize) this.f20603e, (MessageObject) this.f20604f, (TLRPC.Photo) this.h, this.f20602c, (TLRPC.Document) this.f20605n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f20603e, (ArrayList) this.f20604f, this.f20601b, this.f20602c, (ArrayList[]) this.h, (Runnable) this.f20605n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f20603e, (TLRPC.TL_error) this.f20604f, (org.telegram.ui.ActionBar.p2) this.h, (TLObject) this.f20605n, this.f20601b, this.f20602c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z4, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f20603e = num;
        this.f20604f = arrayList;
        this.f20601b = z4;
        this.f20602c = z10;
        this.h = arrayListArr;
        this.f20605n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, boolean z4, boolean z10) {
        this.d = messagesController;
        this.f20603e = errorDelegate;
        this.f20604f = tL_error;
        this.h = p2Var;
        this.f20605n = tLObject;
        this.f20601b = z4;
        this.f20602c = z10;
    }
}
