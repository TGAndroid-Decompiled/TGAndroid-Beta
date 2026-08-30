package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class w4 implements Runnable {
    public final int f18874a;
    public final boolean f18875b;
    public final int f18876c;
    public final Object d;
    public final Object e;

    public w4(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
        this.f18874a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f18875b = z4;
        this.f18876c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18874a) {
            case 0:
                boolean z4 = this.f18875b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f18876c, (String) this.e, z4);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f18875b, this.f18876c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f18876c, this.f18875b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.f18875b, this.f18876c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f18876c, this.f18875b, (Runnable) this.e);
                return;
        }
    }

    public w4(BaseController baseController, int i10, boolean z4, Object obj, int i11) {
        this.f18874a = i11;
        this.d = baseController;
        this.f18876c = i10;
        this.f18875b = z4;
        this.e = obj;
    }

    public w4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z4) {
        this.f18874a = 0;
        this.d = anonymousClass5;
        this.f18876c = i10;
        this.e = str;
        this.f18875b = z4;
    }
}
