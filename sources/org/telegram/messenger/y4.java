package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class y4 implements Runnable {
    public final int f19632a;
    public final boolean f19633b;
    public final int f19634c;
    public final Object d;
    public final Object f19635e;

    public y4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19632a = i11;
        this.d = obj;
        this.f19635e = tLObject;
        this.f19633b = z10;
        this.f19634c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                boolean z10 = this.f19633b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19634c, (String) this.f19635e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19635e, this.f19633b, this.f19634c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19634c, this.f19633b, (Utilities.Callback) this.f19635e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19635e, this.f19633b, this.f19634c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19634c, this.f19633b, (Runnable) this.f19635e);
                return;
        }
    }

    public y4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19632a = i11;
        this.d = baseController;
        this.f19634c = i10;
        this.f19633b = z10;
        this.f19635e = obj;
    }

    public y4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19632a = 0;
        this.d = anonymousClass5;
        this.f19634c = i10;
        this.f19635e = str;
        this.f19633b = z10;
    }
}
