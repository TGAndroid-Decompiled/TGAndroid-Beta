package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f19758a = 0;
    public final boolean f19759b;
    public final boolean f19760c;
    public final Object d;
    public final Object e;
    public final Object f19761f;
    public final Object h;
    public final Object f19762n;

    public c7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19759b = z10;
        this.e = photoSize;
        this.f19761f = messageObject;
        this.h = photo;
        this.f19760c = z11;
        this.f19762n = document;
    }

    @Override
    public final void run() {
        switch (this.f19758a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19759b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f19761f, (TLRPC.Photo) this.h, this.f19760c, (TLRPC.Document) this.f19762n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f19761f, this.f19759b, this.f19760c, (ArrayList[]) this.h, (Runnable) this.f19762n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f19761f, (org.telegram.ui.ActionBar.r2) this.h, (TLObject) this.f19762n, this.f19759b, this.f19760c);
                return;
        }
    }

    public c7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f19761f = arrayList;
        this.f19759b = z10;
        this.f19760c = z11;
        this.h = arrayListArr;
        this.f19762n = runnable;
    }

    public c7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f19761f = tL_error;
        this.h = r2Var;
        this.f19762n = tLObject;
        this.f19759b = z10;
        this.f19760c = z11;
    }
}
