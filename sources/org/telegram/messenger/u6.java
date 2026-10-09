package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19304a = 0;
    public final boolean f19305b;
    public final boolean f19306c;
    public final Object d;
    public final Object f19307e;
    public final Object f19308f;
    public final Object h;
    public final Object f19309n;

    public u6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19305b = z10;
        this.f19307e = photoSize;
        this.f19308f = messageObject;
        this.h = photo;
        this.f19306c = z11;
        this.f19309n = document;
    }

    @Override
    public final void run() {
        switch (this.f19304a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19305b, (TLRPC.PhotoSize) this.f19307e, (MessageObject) this.f19308f, (TLRPC.Photo) this.h, this.f19306c, (TLRPC.Document) this.f19309n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19307e, (ArrayList) this.f19308f, this.f19305b, this.f19306c, (ArrayList[]) this.h, (Runnable) this.f19309n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19307e, (TLRPC.TL_error) this.f19308f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19309n, this.f19305b, this.f19306c);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19307e = num;
        this.f19308f = arrayList;
        this.f19305b = z10;
        this.f19306c = z11;
        this.h = arrayListArr;
        this.f19309n = runnable;
    }

    public u6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19307e = errorDelegate;
        this.f19308f = tL_error;
        this.h = n2Var;
        this.f19309n = tLObject;
        this.f19305b = z10;
        this.f19306c = z11;
    }
}
