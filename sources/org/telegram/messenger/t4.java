package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class t4 implements Runnable {
    public final int f19042a;
    public final boolean f19043b;
    public final int f19044c;
    public final Object d;
    public final Object f19045e;

    public t4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19042a = i11;
        this.d = obj;
        this.f19045e = tLObject;
        this.f19043b = z10;
        this.f19044c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19042a) {
            case 0:
                boolean z10 = this.f19043b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19044c, (String) this.f19045e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19045e, this.f19043b, this.f19044c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19044c, this.f19043b, (Utilities.Callback) this.f19045e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19045e, this.f19043b, this.f19044c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f19044c, this.f19043b, (Runnable) this.f19045e);
                return;
        }
    }

    public t4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19042a = i11;
        this.d = baseController;
        this.f19044c = i10;
        this.f19043b = z10;
        this.f19045e = obj;
    }

    public t4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19042a = 0;
        this.d = anonymousClass5;
        this.f19044c = i10;
        this.f19045e = str;
        this.f19043b = z10;
    }
}
