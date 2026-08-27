package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

public final class y4 implements Runnable {

    public final int f22195a;

    public final int f22196b;

    public final int f22197c;
    public final Object d;

    public final Object f22198e;

    public y4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f22195a = i12;
        this.f22198e = obj;
        this.f22196b = i10;
        this.f22197c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f22195a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f22198e).lambda$fileDidFailedLoad$6((String) this.d, this.f22196b, this.f22197c);
                break;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.f22198e, this.f22196b, this.f22197c, (String) this.d);
                break;
            case 2:
                ((MediaDataController) this.f22198e).lambda$loadReactions$11((List) this.d, this.f22196b, this.f22197c);
                break;
            case 3:
                ((MediaDataController) this.f22198e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f22196b, this.f22197c);
                break;
            case 4:
                ((MessagesController) this.f22198e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f22196b, this.f22197c);
                break;
            case 5:
                ((MessagesController.DialogPhotos) this.f22198e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f22196b, this.f22197c);
                break;
            case 6:
                ((MessagesController.DialogPhotos) this.f22198e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f22196b, this.f22197c);
                break;
            case 7:
                ((MessagesStorage) this.f22198e).lambda$saveSecretParams$7(this.f22196b, this.f22197c, (byte[]) this.d);
                break;
            case 8:
                ((NotificationCenter) this.f22198e).lambda$postNotificationDebounced$2(this.f22196b, (Object[]) this.d, this.f22197c);
                break;
            default:
                ((SecretChatHelper) this.f22198e).lambda$resendMessages$15(this.f22196b, (TLRPC.EncryptedChat) this.d, this.f22197c);
                break;
        }
    }

    public y4(Object obj, int i10, Object obj2, int i11, int i12) {
        this.f22195a = i12;
        this.f22198e = obj;
        this.f22196b = i10;
        this.d = obj2;
        this.f22197c = i11;
    }

    public y4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f22195a = i12;
        this.f22198e = obj;
        this.d = obj2;
        this.f22196b = i10;
        this.f22197c = i11;
    }
}
