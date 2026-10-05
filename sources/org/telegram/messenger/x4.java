package org.telegram.messenger;

import android.text.Spannable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x4 implements Runnable {
    public final int f19764a;
    public final int f19765b;
    public final int f19766c;
    public final Object d;
    public final Object f19767e;

    public x4(Object obj, int i10, int i11, Serializable serializable, int i12) {
        this.f19764a = i12;
        this.f19767e = obj;
        this.f19765b = i10;
        this.f19766c = i11;
        this.d = serializable;
    }

    @Override
    public final void run() {
        switch (this.f19764a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f19767e).lambda$fileDidFailedLoad$6((String) this.d, this.f19765b, this.f19766c);
                return;
            case 1:
                CodeHighlighting.lambda$highlight$5((Spannable) this.f19767e, this.f19765b, this.f19766c, (String) this.d);
                return;
            case 2:
                ((MediaDataController) this.f19767e).lambda$loadReactions$11((List) this.d, this.f19765b, this.f19766c);
                return;
            case 3:
                ((MediaDataController) this.f19767e).lambda$putReactionsToCache$16((ArrayList) this.d, this.f19765b, this.f19766c);
                return;
            case 4:
                ((MessagesController) this.f19767e).lambda$getDifference$350((TLRPC.updates_Difference) this.d, this.f19765b, this.f19766c);
                return;
            case 5:
                ((MessagesController.DialogPhotos) this.f19767e).lambda$load$0((TLRPC.photos_Photos) this.d, this.f19765b, this.f19766c);
                return;
            case 6:
                ((MessagesController.DialogPhotos) this.f19767e).lambda$load$2((TLRPC.messages_Messages) this.d, this.f19765b, this.f19766c);
                return;
            case 7:
                ((MessagesStorage) this.f19767e).lambda$saveSecretParams$7(this.f19765b, this.f19766c, (byte[]) this.d);
                return;
            default:
                int i10 = this.f19766c;
                ((NotificationCenter) this.f19767e).lambda$postNotificationDebounced$2(this.f19765b, (Object[]) this.d, i10);
                return;
        }
    }

    public x4(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f19764a = i12;
        this.f19767e = obj;
        this.d = obj2;
        this.f19765b = i10;
        this.f19766c = i11;
    }

    public x4(NotificationCenter notificationCenter, int i10, Object[] objArr, int i11) {
        this.f19764a = 8;
        this.f19767e = notificationCenter;
        this.f19765b = i10;
        this.d = objArr;
        this.f19766c = i11;
    }
}
