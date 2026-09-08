package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f19575a;
    public final int f19576b;
    public final int f19577c;
    public final Object d;
    public final Object f19578e;

    public x4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19575a = i12;
        this.f19578e = obj;
        this.f19576b = i10;
        this.f19577c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19575a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f19578e).lambda$fileDidFailedLoad$6((String) this.d, this.f19576b, this.f19577c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f19578e, this.f19576b, this.f19577c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19578e).lambda$loadReactions$11((List) this.d, this.f19576b, this.f19577c);
                return;
            case 3:
                ((MediaDataController) this.f19578e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19576b, this.f19577c);
                return;
            case 4:
                ((MessagesController) this.f19578e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19576b, this.f19577c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f19578e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19576b, this.f19577c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f19578e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19576b, this.f19577c);
                return;
            case 7:
                ((MessagesStorage) this.f19578e).lambda$saveSecretParams$7(this.f19576b, this.f19577c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f19577c;
                ((NotificationCenter) this.f19578e).lambda$postNotificationDebounced$2(this.f19576b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f19577c;
                ((SecretChatHelper) this.f19578e).lambda$resendMessages$15(this.f19576b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public x4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f19575a = i12;
        this.f19578e = obj;
        this.f19576b = i10;
        this.d = obj2;
        this.f19577c = i11;
    }

    public x4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19575a = i12;
        this.f19578e = obj;
        this.d = obj2;
        this.f19576b = i10;
        this.f19577c = i11;
    }
}
