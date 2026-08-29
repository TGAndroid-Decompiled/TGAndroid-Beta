package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f22058a = 0;
    public final boolean f22059b;
    public final boolean f22060c;
    public final Object d;
    public final Object f22061e;
    public final Object f22062f;
    public final Object h;
    public final Object f22063n;

    public w6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f22059b = z10;
        this.f22061e = photoSize;
        this.f22062f = messageObject;
        this.h = photo;
        this.f22060c = z11;
        this.f22063n = document;
    }

    @Override
    public final void run() {
        switch (this.f22058a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f22059b, (TLRPC.PhotoSize) this.f22061e, (MessageObject) this.f22062f, (TLRPC.Photo) this.h, this.f22060c, (TLRPC.Document) this.f22063n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f22061e, (ArrayList) this.f22062f, this.f22059b, this.f22060c, (ArrayList[]) this.h, (Runnable) this.f22063n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f22061e, (TLRPC.TL_error) this.f22062f, (org.telegram.ui.ActionBar.o2) this.h, (TLObject) this.f22063n, this.f22059b, this.f22060c);
                return;
        }
    }

    public w6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f22061e = num;
        this.f22062f = arrayList;
        this.f22059b = z10;
        this.f22060c = z11;
        this.h = arrayListArr;
        this.f22063n = runnable;
    }

    public w6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f22061e = errorDelegate;
        this.f22062f = tL_error;
        this.h = o2Var;
        this.f22063n = tLObject;
        this.f22059b = z10;
        this.f22060c = z11;
    }
}
