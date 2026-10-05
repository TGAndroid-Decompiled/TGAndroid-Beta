package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class u4 implements Runnable {
    public final int f19299a;
    public final boolean f19300b;
    public final int f19301c;
    public final Object d;
    public final Object f19302e;

    public u4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19299a = i11;
        this.d = obj;
        this.f19302e = tLObject;
        this.f19300b = z10;
        this.f19301c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19299a) {
            case 0:
                boolean z10 = this.f19300b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19301c, (String) this.f19302e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19302e, this.f19300b, this.f19301c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19301c, this.f19300b, (Utilities.Callback) this.f19302e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19302e, this.f19300b, this.f19301c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f19301c, this.f19300b, (Runnable) this.f19302e);
                return;
        }
    }

    public u4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19299a = i11;
        this.d = baseController;
        this.f19301c = i10;
        this.f19300b = z10;
        this.f19302e = obj;
    }

    public u4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19299a = 0;
        this.d = anonymousClass5;
        this.f19301c = i10;
        this.f19302e = str;
        this.f19300b = z10;
    }
}
