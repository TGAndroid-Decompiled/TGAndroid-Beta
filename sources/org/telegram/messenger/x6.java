package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f19538a = 0;
    public final boolean f19539b;
    public final boolean f19540c;
    public final Object d;
    public final Object f19541e;
    public final Object f19542f;
    public final Object h;
    public final Object f19543n;

    public x6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f19539b = z10;
        this.f19541e = photoSize;
        this.f19542f = messageObject;
        this.h = photo;
        this.f19540c = z11;
        this.f19543n = document;
    }

    @Override
    public final void run() {
        switch (this.f19538a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f19539b, (TLRPC.PhotoSize) this.f19541e, (MessageObject) this.f19542f, (TLRPC.Photo) this.h, this.f19540c, (TLRPC.Document) this.f19543n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$226((Integer) this.f19541e, (ArrayList) this.f19542f, this.f19539b, this.f19540c, (ArrayList[]) this.h, (Runnable) this.f19543n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$301((MessagesController.ErrorDelegate) this.f19541e, (TLRPC.TL_error) this.f19542f, (org.telegram.ui.ActionBar.m2) this.h, (TLObject) this.f19543n, this.f19539b, this.f19540c);
                return;
        }
    }

    public x6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f19541e = num;
        this.f19542f = arrayList;
        this.f19539b = z10;
        this.f19540c = z11;
        this.h = arrayListArr;
        this.f19543n = runnable;
    }

    public x6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f19541e = errorDelegate;
        this.f19542f = tL_error;
        this.h = m2Var;
        this.f19543n = tLObject;
        this.f19539b = z10;
        this.f19540c = z11;
    }
}
