package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class u4 implements Runnable {
    public final int f19141a;
    public final boolean f19142b;
    public final int f19143c;
    public final Object d;
    public final Object f19144e;

    public u4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19141a = i11;
        this.d = obj;
        this.f19144e = tLObject;
        this.f19142b = z10;
        this.f19143c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19141a) {
            case 0:
                boolean z10 = this.f19142b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19143c, (String) this.f19144e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19144e, this.f19142b, this.f19143c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19143c, this.f19142b, (Utilities.Callback) this.f19144e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19144e, this.f19142b, this.f19143c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f19143c, this.f19142b, (Runnable) this.f19144e);
                return;
        }
    }

    public u4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19141a = i11;
        this.d = baseController;
        this.f19143c = i10;
        this.f19142b = z10;
        this.f19144e = obj;
    }

    public u4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19141a = 0;
        this.d = anonymousClass5;
        this.f19143c = i10;
        this.f19144e = str;
        this.f19142b = z10;
    }
}
