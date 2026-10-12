package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class y4 implements Runnable {
    public final int f19060a;
    public final boolean f19061b;
    public final int f19062c;
    public final Object d;
    public final Object e;

    public y4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19060a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f19061b = z10;
        this.f19062c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19060a) {
            case 0:
                boolean z10 = this.f19061b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19062c, (String) this.e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f19061b, this.f19062c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19062c, this.f19061b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.f19061b, this.f19062c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19062c, this.f19061b, (Runnable) this.e);
                return;
        }
    }

    public y4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19060a = i11;
        this.d = baseController;
        this.f19062c = i10;
        this.f19061b = z10;
        this.e = obj;
    }

    public y4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19060a = 0;
        this.d = anonymousClass5;
        this.f19062c = i10;
        this.e = str;
        this.f19061b = z10;
    }
}
