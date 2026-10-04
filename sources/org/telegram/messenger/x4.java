package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f19766a;
    public final int f19767b;
    public final int f19768c;
    public final Object d;
    public final Object f19769e;

    public x4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19766a = i12;
        this.f19769e = obj;
        this.f19767b = i10;
        this.f19768c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19766a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f19769e).lambda$fileDidFailedLoad$6((String) this.d, this.f19767b, this.f19768c);
                return;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.f19769e, this.f19767b, this.f19768c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19769e).lambda$loadReactions$11((List) this.d, this.f19767b, this.f19768c);
                return;
            case 3:
                ((MediaDataController) this.f19769e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19767b, this.f19768c);
                return;
            case 4:
                ((MessagesController) this.f19769e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19767b, this.f19768c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f19769e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19767b, this.f19768c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f19769e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19767b, this.f19768c);
                return;
            case 7:
                ((MessagesStorage) this.f19769e).lambda$saveSecretParams$7(this.f19767b, this.f19768c, (byte[]) this.d);
                return;
            default:
                int i10 = this.f19768c;
                ((NotificationCenter) this.f19769e).lambda$postNotificationDebounced$2(this.f19767b, (Object[]) this.d, i10);
                return;
        }
    }

    public x4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19766a = i12;
        this.f19769e = obj;
        this.d = obj2;
        this.f19767b = i10;
        this.f19768c = i11;
    }

    public x4(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f19766a = 8;
        this.f19769e = notificationCenter;
        this.f19767b = i10;
        this.d = objArr;
        this.f19768c = i11;
    }
}
