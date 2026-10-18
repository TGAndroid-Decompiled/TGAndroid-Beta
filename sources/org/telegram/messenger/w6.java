package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f19965a = 0;
    public final boolean f19966b;
    public final boolean f19967c;
    public final Object d;
    public final Object e;
    public final Object f19968f;
    public final Object h;
    public final Object f19969n;

    public w6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19966b = z10;
        this.e = photoSize;
        this.f19968f = messageObject;
        this.h = photo;
        this.f19967c = z11;
        this.f19969n = document;
    }

    @Override
    public final void run() {
        switch (this.f19965a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19966b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f19968f, (TLRPC.Photo) this.h, this.f19967c, (TLRPC.Document) this.f19969n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f19968f, this.f19966b, this.f19967c, (ArrayList[]) this.h, (Runnable) this.f19969n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f19968f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19969n, this.f19966b, this.f19967c);
                return;
        }
    }

    public w6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f19968f = arrayList;
        this.f19966b = z10;
        this.f19967c = z11;
        this.h = arrayListArr;
        this.f19969n = runnable;
    }

    public w6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f19968f = tL_error;
        this.h = n2Var;
        this.f19969n = tLObject;
        this.f19966b = z10;
        this.f19967c = z11;
    }
}
