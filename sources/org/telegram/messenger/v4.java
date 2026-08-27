package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class v4 implements Runnable {

    public final int f21767a;

    public final boolean f21768b;

    public final int f21769c;
    public final Object d;

    public final Object f21770e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f21767a = i11;
        this.d = obj;
        this.f21770e = tLObject;
        this.f21768b = z10;
        this.f21769c = i10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21767a) {
            case 0:
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f21769c, (String) this.f21770e, this.f21768b);
                break;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f21770e, this.f21768b, this.f21769c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f21769c, this.f21768b, (Utilities.Callback) this.f21770e);
                break;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f21770e, this.f21768b, this.f21769c);
                break;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f21769c, this.f21768b, (Runnable) this.f21770e);
                break;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f21767a = i11;
        this.d = baseController;
        this.f21769c = i10;
        this.f21768b = z10;
        this.f21770e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f21767a = 0;
        this.d = anonymousClass5;
        this.f21769c = i10;
        this.f21770e = str;
        this.f21768b = z10;
    }
}
