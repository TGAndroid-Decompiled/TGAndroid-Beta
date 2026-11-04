package gi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cs;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f13978a;
    public final cs f13979b;
    public final Object f13980c;
    public final int d;
    public final int f13981e;
    public final Object f13982f;
    public final boolean h;
    public final boolean f13983n;
    public final Object f13984r;

    public y8(va vaVar, x9 x9Var, int i3, int i10, f7 f7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f13978a = i11;
        this.f13979b = vaVar;
        this.f13980c = x9Var;
        this.d = i3;
        this.f13981e = i10;
        this.f13982f = f7Var;
        this.h = z10;
        this.f13983n = z11;
        this.f13984r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.y8.run():void");
    }

    public y8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i3, boolean z10, int i10, boolean z11) {
        this.f13978a = 2;
        this.f13979b = mediaController;
        this.f13980c = file;
        this.f13982f = file2;
        this.f13984r = tL_document;
        this.d = i3;
        this.h = z10;
        this.f13981e = i10;
        this.f13983n = z11;
    }
}
