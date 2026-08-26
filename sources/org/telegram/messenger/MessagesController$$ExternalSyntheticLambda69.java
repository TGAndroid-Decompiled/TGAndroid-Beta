package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class MessagesController$$ExternalSyntheticLambda69 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final boolean f$6;

    public MessagesController$$ExternalSyntheticLambda69(MediaController.MediaLoader mediaLoader, boolean z, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
        this.f$0 = mediaLoader;
        this.f$5 = z;
        this.f$1 = photoSize;
        this.f$2 = messageObject;
        this.f$3 = photo;
        this.f$6 = z2;
        this.f$4 = document;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.f$1, (TLRPC.TL_error) this.f$2, (BaseFragment) this.f$3, (TLObject) this.f$4, this.f$5, this.f$6);
                break;
            case 1:
                ((MediaController.MediaLoader) this.f$0).lambda$processLivePhotoMessage$5(this.f$5, (TLRPC.PhotoSize) this.f$1, (MessageObject) this.f$2, (TLRPC.Photo) this.f$3, this.f$6, (TLRPC.Document) this.f$4);
                break;
            default:
                ArrayList[] arrayListArr = (ArrayList[]) this.f$3;
                ((MediaDataController) this.f$0).lambda$fillWithAnimatedEmoji$225((Integer) this.f$1, (ArrayList) this.f$2, this.f$5, this.f$6, arrayListArr, (Runnable) this.f$4);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda69(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        this.f$0 = mediaDataController;
        this.f$1 = num;
        this.f$2 = arrayList;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$3 = arrayListArr;
        this.f$4 = runnable;
    }

    public MessagesController$$ExternalSyntheticLambda69(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2) {
        this.f$0 = messagesController;
        this.f$1 = errorDelegate;
        this.f$2 = tL_error;
        this.f$3 = baseFragment;
        this.f$4 = tLObject;
        this.f$5 = z;
        this.f$6 = z2;
    }
}
