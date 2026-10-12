package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f19539a = 0;
    public final boolean f19540b;
    public final boolean f19541c;
    public final Object d;
    public final Object f19542e;
    public final Object f19543f;
    public final Object h;
    public final Object f19544n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19540b = z10;
        this.f19542e = photoSize;
        this.f19543f = messageObject;
        this.h = photo;
        this.f19541c = z11;
        this.f19544n = document;
    }

    @Override
    public final void run() {
        switch (this.f19539a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19540b, (TLRPC.PhotoSize) this.f19542e, (MessageObject) this.f19543f, (TLRPC.Photo) this.h, this.f19541c, (TLRPC.Document) this.f19544n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19542e, (ArrayList) this.f19543f, this.f19540b, this.f19541c, (ArrayList[]) this.h, (Runnable) this.f19544n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19542e, (TLRPC.TL_error) this.f19543f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f19544n, this.f19540b, this.f19541c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19542e = num;
        this.f19543f = arrayList;
        this.f19540b = z10;
        this.f19541c = z11;
        this.h = arrayListArr;
        this.f19544n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19542e = errorDelegate;
        this.f19543f = tL_error;
        this.h = m2Var;
        this.f19544n = tLObject;
        this.f19540b = z10;
        this.f19541c = z11;
    }
}
