package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f15606a;
    public final fs f15607b;
    public final Object f15608c;
    public final int d;
    public final int f15609e;
    public final Object f15610f;
    public final boolean h;
    public final boolean f15611n;
    public final Object f15612r;

    public v8(ta taVar, v9 v9Var, int i7, int i10, d7 d7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15606a = i11;
        this.f15607b = taVar;
        this.f15608c = v9Var;
        this.d = i7;
        this.f15609e = i10;
        this.f15610f = d7Var;
        this.h = z10;
        this.f15611n = z11;
        this.f15612r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v8.run():void");
    }

    public v8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15606a = 2;
        this.f15607b = mediaController;
        this.f15608c = file;
        this.f15610f = file2;
        this.f15612r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15609e = i10;
        this.f15611n = z11;
    }
}
