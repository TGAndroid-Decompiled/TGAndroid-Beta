package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s6 implements Runnable {
    public final int f18957a = 0;
    public final boolean f18958b;
    public final boolean f18959c;
    public final Object d;
    public final Object f18960e;
    public final Object f18961f;
    public final Object h;
    public final Object f18962n;

    public s6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f18958b = z10;
        this.f18960e = photoSize;
        this.f18961f = messageObject;
        this.h = photo;
        this.f18959c = z11;
        this.f18962n = document;
    }

    @Override
    public final void run() {
        switch (this.f18957a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f18958b, (TLRPC.PhotoSize) this.f18960e, (MessageObject) this.f18961f, (TLRPC.Photo) this.h, this.f18959c, (TLRPC.Document) this.f18962n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.f18960e, (ArrayList) this.f18961f, this.f18958b, this.f18959c, (ArrayList[]) this.h, (Runnable) this.f18962n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f18960e, (TLRPC.TL_error) this.f18961f, (org.telegram.ui.ActionBar.n2) this.h, (TLObject) this.f18962n, this.f18958b, this.f18959c);
                return;
        }
    }

    public s6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.f18960e = num;
        this.f18961f = arrayList;
        this.f18958b = z10;
        this.f18959c = z11;
        this.h = arrayListArr;
        this.f18962n = runnable;
    }

    public s6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.f18960e = errorDelegate;
        this.f18961f = tL_error;
        this.h = n2Var;
        this.f18962n = tLObject;
        this.f18958b = z10;
        this.f18959c = z11;
    }
}
