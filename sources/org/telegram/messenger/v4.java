package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v4 implements Runnable {
    public final int f21788a;
    public final boolean f21789b;
    public final int f21790c;
    public final Object d;
    public final Object f21791e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f21788a = i11;
        this.d = obj;
        this.f21791e = tLObject;
        this.f21789b = z10;
        this.f21790c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21788a) {
            case 0:
                boolean z10 = this.f21789b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f21790c, (String) this.f21791e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f21791e, this.f21789b, this.f21790c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f21790c, this.f21789b, (Utilities.Callback) this.f21791e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f21791e, this.f21789b, this.f21790c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f21790c, this.f21789b, (Runnable) this.f21791e);
                return;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f21788a = i11;
        this.d = baseController;
        this.f21790c = i10;
        this.f21789b = z10;
        this.f21791e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f21788a = 0;
        this.d = anonymousClass5;
        this.f21790c = i10;
        this.f21791e = str;
        this.f21789b = z10;
    }
}
