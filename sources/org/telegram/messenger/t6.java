package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19219a = 0;
    public final boolean f19220b;
    public final boolean f19221c;
    public final Object d;
    public final Object f19222e;
    public final Object f19223f;
    public final Object h;
    public final Object f19224n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19220b = z10;
        this.f19222e = photoSize;
        this.f19223f = messageObject;
        this.h = photo;
        this.f19221c = z11;
        this.f19224n = document;
    }

    @Override
    public final void run() {
        switch (this.f19219a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19220b, (TLRPC.PhotoSize) this.f19222e, (MessageObject) this.f19223f, (TLRPC.Photo) this.h, this.f19221c, (TLRPC.Document) this.f19224n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19222e, (ArrayList) this.f19223f, this.f19220b, this.f19221c, (ArrayList[]) this.h, (Runnable) this.f19224n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19222e, (TLRPC.TL_error) this.f19223f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19224n, this.f19220b, this.f19221c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19222e = num;
        this.f19223f = arrayList;
        this.f19220b = z10;
        this.f19221c = z11;
        this.h = arrayListArr;
        this.f19224n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19222e = errorDelegate;
        this.f19223f = tL_error;
        this.h = n2Var;
        this.f19224n = tLObject;
        this.f19220b = z10;
        this.f19221c = z11;
    }
}
