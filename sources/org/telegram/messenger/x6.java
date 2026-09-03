package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f18937a = 0;
    public final boolean f18938b;
    public final boolean f18939c;
    public final Object d;
    public final Object e;
    public final Object f18940f;
    public final Object h;
    public final Object f18941n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z4, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z10, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f18938b = z4;
        this.e = photoSize;
        this.f18940f = messageObject;
        this.h = photo;
        this.f18939c = z10;
        this.f18941n = document;
    }

    @Override
    public final void run() {
        switch (this.f18937a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f18938b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f18940f, (TLRPC.Photo) this.h, this.f18939c, (TLRPC.Document) this.f18941n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f18940f, this.f18938b, this.f18939c, (ArrayList[]) this.h, (Runnable) this.f18941n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f18940f, (org.telegram.ui.ActionBar.p2) this.h, (TLObject) this.f18941n, this.f18938b, this.f18939c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z4, boolean z10, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f18940f = arrayList;
        this.f18938b = z4;
        this.f18939c = z10;
        this.h = arrayListArr;
        this.f18941n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, boolean z4, boolean z10) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f18940f = tL_error;
        this.h = p2Var;
        this.f18941n = tLObject;
        this.f18938b = z4;
        this.f18939c = z10;
    }
}
