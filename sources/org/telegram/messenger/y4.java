package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class y4 implements Runnable {
    public final int f19631a;
    public final boolean f19632b;
    public final int f19633c;
    public final Object d;
    public final Object f19634e;

    public y4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19631a = i11;
        this.d = obj;
        this.f19634e = tLObject;
        this.f19632b = z10;
        this.f19633c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19631a) {
            case 0:
                boolean z10 = this.f19632b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19633c, (String) this.f19634e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19634e, this.f19632b, this.f19633c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19633c, this.f19632b, (Utilities.Callback) this.f19634e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19634e, this.f19632b, this.f19633c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19633c, this.f19632b, (Runnable) this.f19634e);
                return;
        }
    }

    public y4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19631a = i11;
        this.d = baseController;
        this.f19633c = i10;
        this.f19632b = z10;
        this.f19634e = obj;
    }

    public y4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19631a = 0;
        this.d = anonymousClass5;
        this.f19633c = i10;
        this.f19634e = str;
        this.f19632b = z10;
    }
}
