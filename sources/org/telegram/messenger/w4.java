package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w4 implements Runnable {
    public final int f19473a;
    public final int f19474b;
    public final int f19475c;
    public final Object d;
    public final Object f19476e;

    public w4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19473a = i12;
        this.f19476e = obj;
        this.f19474b = i10;
        this.f19475c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19473a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f19476e).lambda$fileDidFailedLoad$6((String) this.d, this.f19474b, this.f19475c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f19476e, this.f19474b, this.f19475c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19476e).lambda$loadReactions$11((List) this.d, this.f19474b, this.f19475c);
                return;
            case 3:
                ((MediaDataController) this.f19476e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19474b, this.f19475c);
                return;
            case 4:
                ((MessagesController) this.f19476e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19474b, this.f19475c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f19476e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19474b, this.f19475c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f19476e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19474b, this.f19475c);
                return;
            case 7:
                ((MessagesStorage) this.f19476e).lambda$saveSecretParams$7(this.f19474b, this.f19475c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f19475c;
                ((NotificationCenter) this.f19476e).lambda$postNotificationDebounced$2(this.f19474b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f19475c;
                ((SecretChatHelper) this.f19476e).lambda$resendMessages$15(this.f19474b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public w4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f19473a = i12;
        this.f19476e = obj;
        this.f19474b = i10;
        this.d = obj2;
        this.f19475c = i11;
    }

    public w4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19473a = i12;
        this.f19476e = obj;
        this.d = obj2;
        this.f19474b = i10;
        this.f19475c = i11;
    }
}
