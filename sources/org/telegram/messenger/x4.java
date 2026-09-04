package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f19548a;
    public final int f19549b;
    public final int f19550c;
    public final Object d;
    public final Object f19551e;

    public x4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19548a = i12;
        this.f19551e = obj;
        this.f19549b = i10;
        this.f19550c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19548a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f19551e).lambda$fileDidFailedLoad$6((String) this.d, this.f19549b, this.f19550c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f19551e, this.f19549b, this.f19550c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19551e).lambda$loadReactions$11((List) this.d, this.f19549b, this.f19550c);
                return;
            case 3:
                ((MediaDataController) this.f19551e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19549b, this.f19550c);
                return;
            case 4:
                ((MessagesController) this.f19551e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19549b, this.f19550c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f19551e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19549b, this.f19550c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f19551e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19549b, this.f19550c);
                return;
            case 7:
                ((MessagesStorage) this.f19551e).lambda$saveSecretParams$7(this.f19549b, this.f19550c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f19550c;
                ((NotificationCenter) this.f19551e).lambda$postNotificationDebounced$2(this.f19549b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f19550c;
                ((SecretChatHelper) this.f19551e).lambda$resendMessages$15(this.f19549b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public x4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f19548a = i12;
        this.f19551e = obj;
        this.f19549b = i10;
        this.d = obj2;
        this.f19550c = i11;
    }

    public x4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19548a = i12;
        this.f19551e = obj;
        this.d = obj2;
        this.f19549b = i10;
        this.f19550c = i11;
    }
}
