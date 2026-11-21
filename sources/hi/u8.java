package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f15573a;
    public final fs f15574b;
    public final Object f15575c;
    public final int d;
    public final int f15576e;
    public final Object f15577f;
    public final boolean h;
    public final boolean f15578n;
    public final Object f15579r;

    public u8(sa saVar, u9 u9Var, int i7, int i10, c7 c7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15573a = i11;
        this.f15574b = saVar;
        this.f15575c = u9Var;
        this.d = i7;
        this.f15576e = i10;
        this.f15577f = c7Var;
        this.h = z10;
        this.f15578n = z11;
        this.f15579r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.u8.run():void");
    }

    public u8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15573a = 2;
        this.f15574b = mediaController;
        this.f15575c = file;
        this.f15577f = file2;
        this.f15579r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15576e = i10;
        this.f15578n = z11;
    }
}
