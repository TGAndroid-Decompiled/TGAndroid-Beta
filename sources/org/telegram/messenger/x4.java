package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f18057a;
    public final int f18058b;
    public final int f18059c;
    public final Object d;
    public final Object e;

    public x4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f18057a = i12;
        this.e = obj;
        this.f18058b = i10;
        this.f18059c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.e).lambda$fileDidFailedLoad$6((String) this.d, this.f18058b, this.f18059c);
                return;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.e, this.f18058b, this.f18059c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.e).lambda$loadReactions$11((List) this.d, this.f18058b, this.f18059c);
                return;
            case 3:
                ((MediaDataController) this.e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f18058b, this.f18059c);
                return;
            case 4:
                ((MessagesController) this.e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f18058b, this.f18059c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f18058b, this.f18059c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f18058b, this.f18059c);
                return;
            case 7:
                ((MessagesStorage) this.e).lambda$saveSecretParams$7(this.f18058b, this.f18059c, (byte[]) this.d);
                return;
            default:
                int i10 = this.f18059c;
                ((NotificationCenter) this.e).lambda$postNotificationDebounced$2(this.f18058b, (Object[]) this.d, i10);
                return;
        }
    }

    public x4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f18057a = i12;
        this.e = obj;
        this.d = obj2;
        this.f18058b = i10;
        this.f18059c = i11;
    }

    public x4(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f18057a = 8;
        this.e = notificationCenter;
        this.f18058b = i10;
        this.d = objArr;
        this.f18059c = i11;
    }
}
