package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class v4 implements Runnable {
    public final int f19392a;
    public final boolean f19393b;
    public final int f19394c;
    public final Object d;
    public final Object f19395e;

    public v4(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.f19392a = i11;
        this.d = obj;
        this.f19395e = tLObject;
        this.f19393b = z10;
        this.f19394c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19392a) {
            case 0:
                boolean z10 = this.f19393b;
                ((ImageLoader.AnonymousClass5) this.d).lambda$fileDidFailedUpload$4(this.f19394c, (String) this.f19395e, z10);
                return;
            case 1:
                ((LocaleController) this.d).lambda$loadRemoteLanguages$11((Vector) this.f19395e, this.f19393b, this.f19394c);
                return;
            case 2:
                ((MediaDataController) this.d).lambda$loadStickers$91(this.f19394c, this.f19393b, (Utilities.Callback) this.f19395e);
                return;
            case 3:
                ((MessagesStorage) this.d).lambda$loadUserInfo$129((TLRPC.User) this.f19395e, this.f19393b, this.f19394c);
                return;
            default:
                ((SendMessagesHelper) this.d).lambda$toggleTodo$36(this.f19394c, this.f19393b, (Runnable) this.f19395e);
                return;
        }
    }

    public v4(BaseController baseController, int i10, boolean z10, Object obj, int i11) {
        this.f19392a = i11;
        this.d = baseController;
        this.f19394c = i10;
        this.f19393b = z10;
        this.f19395e = obj;
    }

    public v4(ImageLoader.AnonymousClass5 anonymousClass5, int i10, String str, boolean z10) {
        this.f19392a = 0;
        this.d = anonymousClass5;
        this.f19394c = i10;
        this.f19395e = str;
        this.f19393b = z10;
    }
}
