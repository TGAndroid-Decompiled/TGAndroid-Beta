package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f20047a = 0;
    public final boolean f20048b;
    public final boolean f20049c;
    public final Object d;
    public final Object e;
    public final Object f20050f;
    public final Object h;
    public final Object f20051n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f20048b = z10;
        this.e = photoSize;
        this.f20050f = messageObject;
        this.h = photo;
        this.f20049c = z11;
        this.f20051n = document;
    }

    @Override
    public final void run() {
        switch (this.f20047a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f20048b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f20050f, (TLRPC.Photo) this.h, this.f20049c, (TLRPC.Document) this.f20051n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f20050f, this.f20048b, this.f20049c, (ArrayList[]) this.h, (Runnable) this.f20051n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f20050f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f20051n, this.f20048b, this.f20049c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f20050f = arrayList;
        this.f20048b = z10;
        this.f20049c = z11;
        this.h = arrayListArr;
        this.f20051n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f20050f = tL_error;
        this.h = n2Var;
        this.f20051n = tLObject;
        this.f20048b = z10;
        this.f20049c = z11;
    }
}
