package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class w4 implements Runnable {
    public final int f20511a;
    public final boolean f20512b;
    public final int f20513c;
    public final Object d;
    public final Object f20514e;

    public w4(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        this.f20511a = i11;
        this.d = obj;
        this.f20514e = tLObject;
        this.f20512b = z4;
        this.f20513c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20511a) {
            case 0:
                boolean z4 = this.f20512b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f20513c, (String) this.f20514e, z4);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f20514e, this.f20512b, this.f20513c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f20513c, this.f20512b, (Utilities.Callback) this.f20514e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f20514e, this.f20512b, this.f20513c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f20513c, this.f20512b, (Runnable) this.f20514e);
                return;
        }
    }

    public w4(BaseController baseController, int i10, boolean z4, Object obj, int i11) {
        this.f20511a = i11;
        this.d = baseController;
        this.f20513c = i10;
        this.f20512b = z4;
        this.f20514e = obj;
    }

    public w4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z4) {
        this.f20511a = 0;
        this.d = anonymousClass5;
        this.f20513c = i10;
        this.f20514e = str;
        this.f20512b = z4;
    }
}
