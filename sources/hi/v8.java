package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f15609a;
    public final fs f15610b;
    public final Object f15611c;
    public final int d;
    public final int f15612e;
    public final Object f15613f;
    public final boolean h;
    public final boolean f15614n;
    public final Object f15615r;

    public v8(ta taVar, v9 v9Var, int i7, int i10, d7 d7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15609a = i11;
        this.f15610b = taVar;
        this.f15611c = v9Var;
        this.d = i7;
        this.f15612e = i10;
        this.f15613f = d7Var;
        this.h = z10;
        this.f15614n = z11;
        this.f15615r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v8.run():void");
    }

    public v8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15609a = 2;
        this.f15610b = mediaController;
        this.f15611c = file;
        this.f15613f = file2;
        this.f15615r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15612e = i10;
        this.f15614n = z11;
    }
}
