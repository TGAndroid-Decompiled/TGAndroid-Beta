package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f18687a = 0;
    public final boolean f18688b;
    public final boolean f18689c;
    public final Object d;
    public final Object e;
    public final Object f18690f;
    public final Object h;
    public final Object f18691n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f18688b = z10;
        this.e = photoSize;
        this.f18690f = messageObject;
        this.h = photo;
        this.f18689c = z11;
        this.f18691n = document;
    }

    @Override
    public final void run() {
        switch (this.f18687a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f18688b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f18690f, (TLRPC.Photo) this.h, this.f18689c, (TLRPC.Document) this.f18691n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.e, (ArrayList) this.f18690f, this.f18688b, this.f18689c, (ArrayList[]) this.h, (Runnable) this.f18691n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f18690f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f18691n, this.f18688b, this.f18689c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f18690f = arrayList;
        this.f18688b = z10;
        this.f18689c = z11;
        this.h = arrayListArr;
        this.f18691n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f18690f = tL_error;
        this.h = m2Var;
        this.f18691n = tLObject;
        this.f18688b = z10;
        this.f18689c = z11;
    }
}
