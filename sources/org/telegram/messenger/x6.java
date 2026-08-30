package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f18952a = 0;
    public final boolean f18953b;
    public final boolean f18954c;
    public final Object d;
    public final Object e;
    public final Object f18955f;
    public final Object h;
    public final Object f18956n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z4, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f18953b = z4;
        this.e = photoSize;
        this.f18955f = messageObject;
        this.h = photo;
        this.f18954c = z10;
        this.f18956n = document;
    }

    @Override
    public final void run() {
        switch (this.f18952a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f18953b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f18955f, (TLRPC.Photo) this.h, this.f18954c, (TLRPC.Document) this.f18956n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f18955f, this.f18953b, this.f18954c, (ArrayList[]) this.h, (Runnable) this.f18956n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f18955f, (org.telegram.ui.ActionBar.p2) this.h, (TLObject) this.f18956n, this.f18953b, this.f18954c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z4, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f18955f = arrayList;
        this.f18953b = z4;
        this.f18954c = z10;
        this.h = arrayListArr;
        this.f18956n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, boolean z4, boolean z10) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f18955f = tL_error;
        this.h = p2Var;
        this.f18956n = tLObject;
        this.f18953b = z4;
        this.f18954c = z10;
    }
}
