package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f19880a = 0;
    public final boolean f19881b;
    public final boolean f19882c;
    public final Object d;
    public final Object e;
    public final Object f19883f;
    public final Object h;
    public final Object f19884n;

    public d7(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19881b = z10;
        this.e = photoSize;
        this.f19883f = messageObject;
        this.h = photo;
        this.f19882c = z11;
        this.f19884n = document;
    }

    @Override
    public final void run() {
        switch (this.f19880a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19881b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f19883f, (TLRPC.Photo) this.h, this.f19882c, (TLRPC.Document) this.f19884n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f19883f, this.f19881b, this.f19882c, (ArrayList[]) this.h, (Runnable) this.f19884n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f19883f, (org.telegram.ui.ActionBar.r2) this.h, (TLObject) this.f19884n, this.f19881b, this.f19882c);
                return;
        }
    }

    public d7(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f19883f = arrayList;
        this.f19881b = z10;
        this.f19882c = z11;
        this.h = arrayListArr;
        this.f19884n = runnable;
    }

    public d7(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f19883f = tL_error;
        this.h = r2Var;
        this.f19884n = tLObject;
        this.f19881b = z10;
        this.f19882c = z11;
    }
}
