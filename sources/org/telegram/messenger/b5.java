package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f16537a;
    public final int f16538b;
    public final int f16539c;
    public final Object d;
    public final Object e;

    public b5(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f16537a = i12;
        this.d = obj;
        this.e = obj2;
        this.f16538b = i10;
        this.f16539c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16537a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedLoad$6((String) this.e, this.f16538b, this.f16539c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.e, this.f16538b, this.f16539c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.e, this.f16538b, this.f16539c);
                return;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.e, this.f16538b, this.f16539c);
                return;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.e, this.f16538b, this.f16539c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.e, this.f16538b, this.f16539c);
                return;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.f16538b, this.f16539c, (byte[]) this.e);
                return;
            default:
                int i10 = this.f16539c;
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.f16538b, (Object[]) this.e, i10);
                return;
        }
    }

    public b5(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.f16537a = 6;
        this.d = messagesStorage;
        this.f16538b = i10;
        this.f16539c = i11;
        this.e = bArr;
    }

    public b5(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f16537a = 7;
        this.d = notificationCenter;
        this.f16538b = i10;
        this.e = objArr;
        this.f16539c = i11;
    }
}
