package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class y4 implements Runnable {
    public final int f22221a;
    public final int f22222b;
    public final int f22223c;
    public final Object d;
    public final Object f22224e;

    public y4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f22221a = i12;
        this.f22224e = obj;
        this.f22222b = i10;
        this.f22223c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f22221a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f22224e).lambda$fileDidFailedLoad$6((String) this.d, this.f22222b, this.f22223c);
                return;
            case 1:
                CodeHighlighting.c((Spannable) this.f22224e, this.f22222b, this.f22223c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f22224e).lambda$loadReactions$11((List) this.d, this.f22222b, this.f22223c);
                return;
            case 3:
                ((MediaDataController) this.f22224e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f22222b, this.f22223c);
                return;
            case 4:
                ((MessagesController) this.f22224e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f22222b, this.f22223c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f22224e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f22222b, this.f22223c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f22224e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f22222b, this.f22223c);
                return;
            case 7:
                ((MessagesStorage) this.f22224e).lambda$saveSecretParams$7(this.f22222b, this.f22223c, (byte[]) this.d);
                return;
            case 8:
                int i10 = this.f22223c;
                ((NotificationCenter) this.f22224e).lambda$postNotificationDebounced$2(this.f22222b, (Object[]) this.d, i10);
                return;
            default:
                int i11 = this.f22223c;
                ((SecretChatHelper) this.f22224e).lambda$resendMessages$15(this.f22222b, (TLRPC.EncryptedChat) this.d, i11);
                return;
        }
    }

    public y4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f22221a = i12;
        this.f22224e = obj;
        this.f22222b = i10;
        this.d = obj2;
        this.f22223c = i11;
    }

    public y4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f22221a = i12;
        this.f22224e = obj;
        this.d = obj2;
        this.f22222b = i10;
        this.f22223c = i11;
    }
}
