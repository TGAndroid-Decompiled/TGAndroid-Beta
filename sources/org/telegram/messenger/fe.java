package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLRPC;
public final class fe implements Runnable {
    public final int f15720a;
    public final int f15721b;
    public final int f15722c;
    public final boolean d;
    public final boolean e;
    public final vs f15723f;
    public final Object h;
    public final Object f15724n;
    public final Object f15725r;

    public fe(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11) {
        this.f15720a = 0;
        this.f15723f = mediaController;
        this.h = file;
        this.f15724n = file2;
        this.f15725r = tL_document;
        this.f15721b = i10;
        this.d = z10;
        this.f15722c = i11;
        this.e = z11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fe.run():void");
    }

    public fe(vh.o8 o8Var, vh.s7 s7Var, int i10, int i11, vh.n5 n5Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.f15720a = i12;
        this.f15723f = o8Var;
        this.h = s7Var;
        this.f15721b = i10;
        this.f15722c = i11;
        this.f15724n = n5Var;
        this.d = z10;
        this.e = z11;
        this.f15725r = runnable;
    }
}
