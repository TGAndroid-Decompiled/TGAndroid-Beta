package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f17135a;
    public final int f17136b;
    public final int f17137c;
    public final Object d;
    public final Object f17138e;

    public b5(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f17135a = i12;
        this.d = obj;
        this.f17138e = obj2;
        this.f17136b = i10;
        this.f17137c = i11;
    }

    @Override
    public final void run() {
        switch (this.f17135a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedLoad$6((String) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.f17138e, this.f17136b, this.f17137c);
                return;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.f17136b, this.f17137c, (byte[]) this.f17138e);
                return;
            default:
                int i10 = this.f17137c;
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.f17136b, (Object[]) this.f17138e, i10);
                return;
        }
    }

    public b5(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.f17135a = 6;
        this.d = messagesStorage;
        this.f17136b = i10;
        this.f17137c = i11;
        this.f17138e = bArr;
    }

    public b5(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f17135a = 7;
        this.d = notificationCenter;
        this.f17136b = i10;
        this.f17138e = objArr;
        this.f17137c = i11;
    }
}
