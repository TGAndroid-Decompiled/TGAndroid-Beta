package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f19959a = 0;
    public final boolean f19960b;
    public final boolean f19961c;
    public final Object d;
    public final Object e;
    public final Object f19962f;
    public final Object h;
    public final Object f19963n;

    public w6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19960b = z10;
        this.e = photoSize;
        this.f19962f = messageObject;
        this.h = photo;
        this.f19961c = z11;
        this.f19963n = document;
    }

    @Override
    public final void run() {
        switch (this.f19959a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19960b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f19962f, (TLRPC.Photo) this.h, this.f19961c, (TLRPC.Document) this.f19963n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f19962f, this.f19960b, this.f19961c, (ArrayList[]) this.h, (Runnable) this.f19963n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f19962f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f19963n, this.f19960b, this.f19961c);
                return;
        }
    }

    public w6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f19962f = arrayList;
        this.f19960b = z10;
        this.f19961c = z11;
        this.h = arrayListArr;
        this.f19963n = runnable;
    }

    public w6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f19962f = tL_error;
        this.h = n2Var;
        this.f19963n = tLObject;
        this.f19960b = z10;
        this.f19961c = z11;
    }
}
