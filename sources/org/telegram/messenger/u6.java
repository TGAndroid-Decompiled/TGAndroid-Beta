package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u6 implements Runnable {
    public final int f19342a = 0;
    public final boolean f19343b;
    public final boolean f19344c;
    public final Object d;
    public final Object f19345e;
    public final Object f19346f;
    public final Object h;
    public final Object f19347n;

    public u6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19343b = z10;
        this.f19345e = photoSize;
        this.f19346f = messageObject;
        this.h = photo;
        this.f19344c = z11;
        this.f19347n = document;
    }

    @Override
    public final void run() {
        switch (this.f19342a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19343b, (TLRPC.PhotoSize) this.f19345e, (MessageObject) this.f19346f, (TLRPC.Photo) this.h, this.f19344c, (TLRPC.Document) this.f19347n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19345e, (ArrayList) this.f19346f, this.f19343b, this.f19344c, (ArrayList[]) this.h, (Runnable) this.f19347n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19345e, (TLRPC.TL_error) this.f19346f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f19347n, this.f19343b, this.f19344c);
                return;
        }
    }

    public u6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19345e = num;
        this.f19346f = arrayList;
        this.f19343b = z10;
        this.f19344c = z11;
        this.h = arrayListArr;
        this.f19347n = runnable;
    }

    public u6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19345e = errorDelegate;
        this.f19346f = tL_error;
        this.h = m2Var;
        this.f19347n = tLObject;
        this.f19343b = z10;
        this.f19344c = z11;
    }
}
