package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

public final class ImageLoader$5$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final int f$3;

    public ImageLoader$5$$ExternalSyntheticLambda6(Object obj, int i, int i2, Serializable serializable, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$1 = serializable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f$0).lambda$fileDidFailedLoad$6((String) this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.f$0, this.f$2, this.f$3, (String) this.f$1);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$getDifference$350((TLRPC.updates_Difference) this.f$1, this.f$2, this.f$3);
                break;
            case 3:
                ((MessagesController.DialogPhotos) this.f$0).lambda$load$0((TLRPC.photos_Photos) this.f$1, this.f$2, this.f$3);
                break;
            case 4:
                ((MessagesController.DialogPhotos) this.f$0).lambda$load$2((TLRPC.messages_Messages) this.f$1, this.f$2, this.f$3);
                break;
            case 5:
                ((MessagesStorage) this.f$0).lambda$saveSecretParams$7(this.f$2, this.f$3, (byte[]) this.f$1);
                break;
            case 6:
                ((NotificationCenter) this.f$0).lambda$postNotificationDebounced$2(this.f$2, (Object[]) this.f$1, this.f$3);
                break;
            default:
                ((SecretChatHelper) this.f$0).lambda$resendMessages$15(this.f$2, (TLRPC.EncryptedChat) this.f$1, this.f$3);
                break;
        }
    }

    public ImageLoader$5$$ExternalSyntheticLambda6(Object obj, int i, Object obj2, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
        this.f$3 = i2;
    }

    public ImageLoader$5$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
