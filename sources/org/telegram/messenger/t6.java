package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19212a = 0;
    public final boolean f19213b;
    public final boolean f19214c;
    public final Object d;
    public final Object f19215e;
    public final Object f19216f;
    public final Object h;
    public final Object f19217n;

    public t6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19213b = z10;
        this.f19215e = photoSize;
        this.f19216f = messageObject;
        this.h = photo;
        this.f19214c = z11;
        this.f19217n = document;
    }

    @Override
    public final void run() {
        switch (this.f19212a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19213b, (TLRPC.PhotoSize) this.f19215e, (MessageObject) this.f19216f, (TLRPC.Photo) this.h, this.f19214c, (TLRPC.Document) this.f19217n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19215e, (ArrayList) this.f19216f, this.f19213b, this.f19214c, (ArrayList[]) this.h, (Runnable) this.f19217n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f19215e, (TLRPC.TL_error) this.f19216f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19217n, this.f19213b, this.f19214c);
                return;
        }
    }

    public t6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19215e = num;
        this.f19216f = arrayList;
        this.f19213b = z10;
        this.f19214c = z11;
        this.h = arrayListArr;
        this.f19217n = runnable;
    }

    public t6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19215e = errorDelegate;
        this.f19216f = tL_error;
        this.h = n2Var;
        this.f19217n = tLObject;
        this.f19213b = z10;
        this.f19214c = z11;
    }
}
