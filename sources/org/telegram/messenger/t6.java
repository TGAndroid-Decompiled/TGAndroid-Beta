package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19214a = 0;
    public final boolean f19215b;
    public final boolean f19216c;
    public final Object d;
    public final Object f19217e;
    public final Object f19218f;
    public final Object h;
    public final Object f19219n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19215b = z10;
        this.f19217e = photoSize;
        this.f19218f = messageObject;
        this.h = photo;
        this.f19216c = z11;
        this.f19219n = document;
    }

    @Override
    public final void run() {
        switch (this.f19214a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19215b, (TLRPC.PhotoSize) this.f19217e, (MessageObject) this.f19218f, (TLRPC.Photo) this.h, this.f19216c, (TLRPC.Document) this.f19219n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19217e, (ArrayList) this.f19218f, this.f19215b, this.f19216c, (ArrayList[]) this.h, (Runnable) this.f19219n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19217e, (TLRPC.TL_error) this.f19218f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19219n, this.f19215b, this.f19216c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19217e = num;
        this.f19218f = arrayList;
        this.f19215b = z10;
        this.f19216c = z11;
        this.h = arrayListArr;
        this.f19219n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19217e = errorDelegate;
        this.f19218f = tL_error;
        this.h = n2Var;
        this.f19219n = tLObject;
        this.f19215b = z10;
        this.f19216c = z11;
    }
}
