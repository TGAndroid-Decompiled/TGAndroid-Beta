package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class c5 implements Runnable {
    public final int f19755a;
    public final boolean f19756b;
    public final int f19757c;
    public final Object d;
    public final Object e;

    public c5(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19755a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f19756b = z10;
        this.f19757c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19755a) {
            case 0:
                boolean z10 = this.f19756b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19757c, (String) this.e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f19756b, this.f19757c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19757c, this.f19756b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$133((TLRPC.User) this.e, this.f19756b, this.f19757c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19757c, this.f19756b, (Runnable) this.e);
                return;
        }
    }

    public c5(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19755a = i11;
        this.d = baseController;
        this.f19757c = i10;
        this.f19756b = z10;
        this.e = obj;
    }

    public c5(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19755a = 0;
        this.d = anonymousClass5;
        this.f19757c = i10;
        this.e = str;
        this.f19756b = z10;
    }
}
