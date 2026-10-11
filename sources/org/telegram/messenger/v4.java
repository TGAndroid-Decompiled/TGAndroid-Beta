package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v4 implements Runnable {
    public final int f19390a;
    public final boolean f19391b;
    public final int f19392c;
    public final Object d;
    public final Object f19393e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19390a = i11;
        this.d = obj;
        this.f19393e = tLObject;
        this.f19391b = z10;
        this.f19392c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19390a) {
            case 0:
                boolean z10 = this.f19391b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19392c, (String) this.f19393e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19393e, this.f19391b, this.f19392c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19392c, this.f19391b, (Utilities.Callback) this.f19393e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19393e, this.f19391b, this.f19392c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19392c, this.f19391b, (Runnable) this.f19393e);
                return;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19390a = i11;
        this.d = baseController;
        this.f19392c = i10;
        this.f19391b = z10;
        this.f19393e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19390a = 0;
        this.d = anonymousClass5;
        this.f19392c = i10;
        this.f19393e = str;
        this.f19391b = z10;
    }
}
