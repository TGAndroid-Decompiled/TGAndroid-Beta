package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f19862a;
    public final int f19863b;
    public final int f19864c;
    public final Object d;
    public final Object f19865e;

    public y4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19862a = i12;
        this.d = obj;
        this.f19865e = obj2;
        this.f19863b = i10;
        this.f19864c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedLoad$6((String) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$loadReactions$11((List) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$putReactionsToCache$16((ArrayList) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 3:
                ((MessagesController) this.d).lambda$getDifference$349((TLRPC.updates_Difference) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 4:
                ((MessagesController.DialogPhotos) this.d).lambda$load$0((TLRPC.photos_Photos) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.d).lambda$load$2((TLRPC.messages_Messages) this.f19865e, this.f19863b, this.f19864c);
                return;
            case 6:
                ((MessagesStorage) this.d).lambda$saveSecretParams$7(this.f19863b, this.f19864c, (byte[]) this.f19865e);
                return;
            default:
                int i10 = this.f19864c;
                ((NotificationCenter) this.d).lambda$postNotificationDebounced$2(this.f19863b, (Object[]) this.f19865e, i10);
                return;
        }
    }

    public y4(MessagesStorage messagesStorage, int i10, int i11, byte[] bArr) {
        this.f19862a = 6;
        this.d = messagesStorage;
        this.f19863b = i10;
        this.f19864c = i11;
        this.f19865e = bArr;
    }

    public y4(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f19862a = 7;
        this.d = notificationCenter;
        this.f19863b = i10;
        this.f19865e = objArr;
        this.f19864c = i11;
    }
}
