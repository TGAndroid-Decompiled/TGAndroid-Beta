package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19041a = 0;
    public final boolean f19042b;
    public final boolean f19043c;
    public final Object d;
    public final Object f19044e;
    public final Object f19045f;
    public final Object h;
    public final Object f19046n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19042b = z10;
        this.f19044e = photoSize;
        this.f19045f = messageObject;
        this.h = photo;
        this.f19043c = z11;
        this.f19046n = document;
    }

    @Override
    public final void run() {
        switch (this.f19041a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19042b, (TLRPC.PhotoSize) this.f19044e, (MessageObject) this.f19045f, (TLRPC.Photo) this.h, this.f19043c, (TLRPC.Document) this.f19046n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f19044e, (ArrayList) this.f19045f, this.f19042b, this.f19043c, (ArrayList[]) this.h, (Runnable) this.f19046n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19044e, (TLRPC.TL_error) this.f19045f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19046n, this.f19042b, this.f19043c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19044e = num;
        this.f19045f = arrayList;
        this.f19042b = z10;
        this.f19043c = z11;
        this.h = arrayListArr;
        this.f19046n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19044e = errorDelegate;
        this.f19045f = tL_error;
        this.h = n2Var;
        this.f19046n = tLObject;
        this.f19042b = z10;
        this.f19043c = z11;
    }
}
