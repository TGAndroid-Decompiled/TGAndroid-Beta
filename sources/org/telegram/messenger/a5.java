package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class a5 implements Runnable {
    public final int f17899a;
    public final boolean f17900b;
    public final int f17901c;
    public final Object d;
    public final Object e;

    public a5(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f17899a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17900b = z10;
        this.f17901c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17899a) {
            case 0:
                boolean z10 = this.f17900b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f17901c, (String) this.e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f17900b, this.f17901c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f17901c, this.f17900b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.f17900b, this.f17901c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f17901c, this.f17900b, (Runnable) this.e);
                return;
        }
    }

    public a5(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f17899a = i11;
        this.d = baseController;
        this.f17901c = i10;
        this.f17900b = z10;
        this.e = obj;
    }

    public a5(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f17899a = 0;
        this.d = anonymousClass5;
        this.f17901c = i10;
        this.e = str;
        this.f17900b = z10;
    }
}
