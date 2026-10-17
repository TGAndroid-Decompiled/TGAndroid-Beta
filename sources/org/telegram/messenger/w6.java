package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f19953a = 0;
    public final boolean f19954b;
    public final boolean f19955c;
    public final Object d;
    public final Object e;
    public final Object f19956f;
    public final Object h;
    public final Object f19957n;

    public w6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19954b = z10;
        this.e = photoSize;
        this.f19956f = messageObject;
        this.h = photo;
        this.f19955c = z11;
        this.f19957n = document;
    }

    @Override
    public final void run() {
        switch (this.f19953a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19954b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f19956f, (TLRPC.Photo) this.h, this.f19955c, (TLRPC.Document) this.f19957n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f19956f, this.f19954b, this.f19955c, (ArrayList[]) this.h, (Runnable) this.f19957n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f19956f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19957n, this.f19954b, this.f19955c);
                return;
        }
    }

    public w6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f19956f = arrayList;
        this.f19954b = z10;
        this.f19955c = z11;
        this.h = arrayListArr;
        this.f19957n = runnable;
    }

    public w6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f19956f = tL_error;
        this.h = n2Var;
        this.f19957n = tLObject;
        this.f19954b = z10;
        this.f19955c = z11;
    }
}
