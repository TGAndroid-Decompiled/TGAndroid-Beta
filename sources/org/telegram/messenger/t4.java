package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class t4 implements Runnable {
    public final int f21530a;
    public final boolean f21531b;
    public final int f21532c;
    public final Object d;
    public final Object f21533e;

    public t4(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.f21530a = i10;
        this.d = obj;
        this.f21533e = tLObject;
        this.f21531b = z10;
        this.f21532c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21530a) {
            case 0:
                boolean z10 = this.f21531b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f21532c, (String) this.f21533e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f21533e, this.f21531b, this.f21532c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f21532c, this.f21531b, (Utilities.Callback) this.f21533e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f21533e, this.f21531b, this.f21532c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f21532c, this.f21531b, (Runnable) this.f21533e);
                return;
        }
    }

    public t4(BaseController baseController, int i9, boolean z10, Object obj, int i10) {
        this.f21530a = i10;
        this.d = baseController;
        this.f21532c = i9;
        this.f21531b = z10;
        this.f21533e = obj;
    }

    public t4(ImageLoader.AnonymousClass5 anonymousClass5, int i9, String str, boolean z10) {
        this.f21530a = 0;
        this.d = anonymousClass5;
        this.f21532c = i9;
        this.f21533e = str;
        this.f21531b = z10;
    }
}
