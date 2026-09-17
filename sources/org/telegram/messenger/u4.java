package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class u4 implements Runnable {
    public final int f17439a;
    public final boolean f17440b;
    public final int f17441c;
    public final Object d;
    public final Object e;

    public u4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f17439a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17440b = z10;
        this.f17441c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17439a) {
            case 0:
                boolean z10 = this.f17440b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f17441c, (String) this.e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.e, this.f17440b, this.f17441c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f17441c, this.f17440b, (Utilities.Callback) this.e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.e, this.f17440b, this.f17441c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$33(this.f17441c, this.f17440b, (Runnable) this.e);
                return;
        }
    }

    public u4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f17439a = i11;
        this.d = baseController;
        this.f17441c = i10;
        this.f17440b = z10;
        this.e = obj;
    }

    public u4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f17439a = 0;
        this.d = anonymousClass5;
        this.f17441c = i10;
        this.e = str;
        this.f17440b = z10;
    }
}
