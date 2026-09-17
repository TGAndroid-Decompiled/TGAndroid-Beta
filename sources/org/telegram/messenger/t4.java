package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class t4 implements Runnable {
    public final int f19069a;
    public final boolean f19070b;
    public final int f19071c;
    public final Object d;
    public final Object f19072e;

    public t4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19069a = i11;
        this.d = obj;
        this.f19072e = tLObject;
        this.f19070b = z10;
        this.f19071c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19069a) {
            case 0:
                boolean z10 = this.f19070b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19071c, (String) this.f19072e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19072e, this.f19070b, this.f19071c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19071c, this.f19070b, (Utilities.Callback) this.f19072e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19072e, this.f19070b, this.f19071c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f19071c, this.f19070b, (Runnable) this.f19072e);
                return;
        }
    }

    public t4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19069a = i11;
        this.d = baseController;
        this.f19071c = i10;
        this.f19070b = z10;
        this.f19072e = obj;
    }

    public t4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19069a = 0;
        this.d = anonymousClass5;
        this.f19071c = i10;
        this.f19072e = str;
        this.f19070b = z10;
    }
}
