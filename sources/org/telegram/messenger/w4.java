package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Runnable {
    public final int f21988a;
    public final int f21989b;
    public final int f21990c;
    public final Object d;
    public final Object f21991e;

    public w4(Object obj, int i9, int i10, Serializable serializable, int i11) {
        this.f21988a = i11;
        this.f21991e = obj;
        this.f21989b = i9;
        this.f21990c = i10;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f21988a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f21991e).lambda$fileDidFailedLoad$6((String) this.d, this.f21989b, this.f21990c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f21991e, this.f21989b, this.f21990c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f21991e).lambda$loadReactions$11((List) this.d, this.f21989b, this.f21990c);
                return;
            case 3:
                ((MediaDataController) this.f21991e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f21989b, this.f21990c);
                return;
            case 4:
                ((MessagesController) this.f21991e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f21989b, this.f21990c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f21991e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f21989b, this.f21990c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f21991e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f21989b, this.f21990c);
                return;
            case 7:
                ((MessagesStorage) this.f21991e).lambda$saveSecretParams$7(this.f21989b, this.f21990c, (byte[]) this.d);
                return;
            case 8:
                int i9 = this.f21990c;
                ((NotificationCenter) this.f21991e).lambda$postNotificationDebounced$2(this.f21989b, (Object[]) this.d, i9);
                return;
            default:
                int i10 = this.f21990c;
                ((SecretChatHelper) this.f21991e).lambda$resendMessages$15(this.f21989b, (TLRPC.EncryptedChat) this.d, i10);
                return;
        }
    }

    public w4(Object obj, int i9, Object obj2, int i10, int i11) {
        this.f21988a = i11;
        this.f21991e = obj;
        this.f21989b = i9;
        this.d = obj2;
        this.f21990c = i10;
    }

    public w4(Object obj, Object obj2, int i9, int i10, int i11) {
        this.f21988a = i11;
        this.f21991e = obj;
        this.d = obj2;
        this.f21989b = i9;
        this.f21990c = i10;
    }
}
