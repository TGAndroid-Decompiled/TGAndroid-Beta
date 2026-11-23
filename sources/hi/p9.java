package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;
public final class p9 implements Runnable {
    public final int f15190a;
    public final fs f15191b;
    public final Object f15192c;
    public final int d;
    public final int f15193e;
    public final Object f15194f;
    public final boolean h;
    public final boolean f15195n;
    public final Object f15196r;

    public p9(nb nbVar, pa paVar, int i7, int i10, x7 x7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15190a = i11;
        this.f15191b = nbVar;
        this.f15192c = paVar;
        this.d = i7;
        this.f15193e = i10;
        this.f15194f = x7Var;
        this.h = z10;
        this.f15195n = z11;
        this.f15196r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.p9.run():void");
    }

    public p9(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15190a = 2;
        this.f15191b = mediaController;
        this.f15192c = file;
        this.f15194f = file2;
        this.f15196r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15193e = i10;
        this.f15195n = z11;
    }
}
