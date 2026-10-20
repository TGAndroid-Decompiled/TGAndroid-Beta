package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f18019a;
    public final int f18020b;
    public final int f18021c;
    public final Object d;
    public final Object e;

    public c5(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f18019a = i12;
        this.d = obj;
        this.e = obj2;
        this.f18020b = i10;
        this.f18021c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18019a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedLoad$6((String) this.e, this.f18020b, this.f18021c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.e, this.f18020b, this.f18021c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.e, this.f18020b, this.f18021c);
                return;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.e, this.f18020b, this.f18021c);
                return;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.e, this.f18020b, this.f18021c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.e, this.f18020b, this.f18021c);
                return;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.f18020b, this.f18021c, (byte[]) this.e);
                return;
            default:
                int i10 = this.f18021c;
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.f18020b, (Object[]) this.e, i10);
                return;
        }
    }

    public c5(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.f18019a = 6;
        this.d = messagesStorage;
        this.f18020b = i10;
        this.f18021c = i11;
        this.e = bArr;
    }

    public c5(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f18019a = 7;
        this.d = notificationCenter;
        this.f18020b = i10;
        this.e = objArr;
        this.f18021c = i11;
    }
}
