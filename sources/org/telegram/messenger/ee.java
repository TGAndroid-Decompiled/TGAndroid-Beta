package org.telegram.messenger;

import java.io.File;
import org.telegram.tgnet.TLRPC;
public final class ee implements Runnable {
    public final int f15379a;
    public final int f15380b;
    public final int f15381c;
    public final boolean d;
    public final boolean e;
    public final us f15382f;
    public final Object h;
    public final Object f15383n;
    public final Object f15384r;

    public ee(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11) {
        this.f15379a = 0;
        this.f15382f = mediaController;
        this.h = file;
        this.f15383n = file2;
        this.f15384r = tL_document;
        this.f15380b = i10;
        this.d = z10;
        this.f15381c = i11;
        this.e = z11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ee.run():void");
    }

    public ee(vh.o8 o8Var, vh.s7 s7Var, int i10, int i11, vh.n5 n5Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.f15379a = i12;
        this.f15382f = o8Var;
        this.h = s7Var;
        this.f15380b = i10;
        this.f15381c = i11;
        this.f15383n = n5Var;
        this.d = z10;
        this.e = z11;
        this.f15384r = runnable;
    }
}
