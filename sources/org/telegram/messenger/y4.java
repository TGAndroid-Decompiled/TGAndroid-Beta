package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19898a;
    public final int f19899b;
    public final int f19900c;
    public final Object d;
    public final Object f19901e;

    public y4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19898a = i12;
        this.d = obj;
        this.f19901e = obj2;
        this.f19899b = i10;
        this.f19900c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedLoad$6((String) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.f19901e, this.f19899b, this.f19900c);
                return;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.f19899b, this.f19900c, (byte[]) this.f19901e);
                return;
            default:
                int i10 = this.f19900c;
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.f19899b, (Object[]) this.f19901e, i10);
                return;
        }
    }

    public y4(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.f19898a = 6;
        this.d = messagesStorage;
        this.f19899b = i10;
        this.f19900c = i11;
        this.f19901e = bArr;
    }

    public y4(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f19898a = 7;
        this.d = notificationCenter;
        this.f19899b = i10;
        this.f19901e = objArr;
        this.f19900c = i11;
    }
}
