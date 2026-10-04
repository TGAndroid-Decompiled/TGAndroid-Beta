package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class u4 implements Runnable {
    public final int f19288a;
    public final boolean f19289b;
    public final int f19290c;
    public final Object d;
    public final Object f19291e;

    public u4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19288a = i11;
        this.d = obj;
        this.f19291e = tLObject;
        this.f19289b = z10;
        this.f19290c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19288a) {
            case 0:
                boolean z10 = this.f19289b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19290c, (String) this.f19291e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19291e, this.f19289b, this.f19290c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19290c, this.f19289b, (Utilities.Callback) this.f19291e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19291e, this.f19289b, this.f19290c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f19290c, this.f19289b, (Runnable) this.f19291e);
                return;
        }
    }

    public u4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19288a = i11;
        this.d = baseController;
        this.f19290c = i10;
        this.f19289b = z10;
        this.f19291e = obj;
    }

    public u4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19288a = 0;
        this.d = anonymousClass5;
        this.f19290c = i10;
        this.f19291e = str;
        this.f19289b = z10;
    }
}
