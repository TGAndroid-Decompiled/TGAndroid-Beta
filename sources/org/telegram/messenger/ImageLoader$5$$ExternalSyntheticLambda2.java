package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class ImageLoader$5$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final boolean f$3;

    public ImageLoader$5$$ExternalSyntheticLambda2(int i, int i2, Object obj, TLObject tLObject, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = tLObject;
        this.f$3 = z;
        this.f$1 = i;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.f$0).lambda$fileDidFailedUpload$4(this.f$1, (String) this.f$2, this.f$3);
                break;
            case 1:
                ((LocaleController) this.f$0).lambda$loadRemoteLanguages$11((Vector) this.f$2, this.f$3, this.f$1);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadStickers$91(this.f$1, this.f$3, (Utilities.Callback) this.f$2);
                break;
            case 3:
                ((MessagesStorage) this.f$0).lambda$loadUserInfo$129((TLRPC.User) this.f$2, this.f$3, this.f$1);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$toggleTodo$33(this.f$1, this.f$3, (Runnable) this.f$2);
                break;
        }
    }

    public ImageLoader$5$$ExternalSyntheticLambda2(BaseController baseController, int i, boolean z, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = i;
        this.f$3 = z;
        this.f$2 = obj;
    }

    public ImageLoader$5$$ExternalSyntheticLambda2(ImageLoader.AnonymousClass5 anonymousClass5, int i, String str, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = anonymousClass5;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = z;
    }
}
