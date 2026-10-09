package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v4 implements Runnable {
    public final int f19388a;
    public final boolean f19389b;
    public final int f19390c;
    public final Object d;
    public final Object f19391e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19388a = i11;
        this.d = obj;
        this.f19391e = tLObject;
        this.f19389b = z10;
        this.f19390c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19388a) {
            case 0:
                boolean z10 = this.f19389b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19390c, (String) this.f19391e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19391e, this.f19389b, this.f19390c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19390c, this.f19389b, (Utilities.Callback) this.f19391e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19391e, this.f19389b, this.f19390c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19390c, this.f19389b, (Runnable) this.f19391e);
                return;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19388a = i11;
        this.d = baseController;
        this.f19390c = i10;
        this.f19389b = z10;
        this.f19391e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19388a = 0;
        this.d = anonymousClass5;
        this.f19390c = i10;
        this.f19391e = str;
        this.f19389b = z10;
    }
}
