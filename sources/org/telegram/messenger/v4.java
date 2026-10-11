package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v4 implements Runnable {
    public final int f19426a;
    public final boolean f19427b;
    public final int f19428c;
    public final Object d;
    public final Object f19429e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19426a = i11;
        this.d = obj;
        this.f19429e = tLObject;
        this.f19427b = z10;
        this.f19428c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19426a) {
            case 0:
                boolean z10 = this.f19427b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19428c, (String) this.f19429e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19429e, this.f19427b, this.f19428c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19428c, this.f19427b, (Utilities.Callback) this.f19429e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19429e, this.f19427b, this.f19428c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19428c, this.f19427b, (Runnable) this.f19429e);
                return;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19426a = i11;
        this.d = baseController;
        this.f19428c = i10;
        this.f19427b = z10;
        this.f19429e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19426a = 0;
        this.d = anonymousClass5;
        this.f19428c = i10;
        this.f19429e = str;
        this.f19427b = z10;
    }
}
