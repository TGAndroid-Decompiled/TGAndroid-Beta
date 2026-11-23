package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gs;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f15576a;
    public final gs f15577b;
    public final Object f15578c;
    public final int d;
    public final int f15579e;
    public final Object f15580f;
    public final boolean h;
    public final boolean f15581n;
    public final Object f15582r;

    public u8(sa saVar, u9 u9Var, int i7, int i10, c7 c7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15576a = i11;
        this.f15577b = saVar;
        this.f15578c = u9Var;
        this.d = i7;
        this.f15579e = i10;
        this.f15580f = c7Var;
        this.h = z10;
        this.f15581n = z11;
        this.f15582r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.u8.run():void");
    }

    public u8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15576a = 2;
        this.f15577b = mediaController;
        this.f15578c = file;
        this.f15580f = file2;
        this.f15582r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15579e = i10;
        this.f15581n = z11;
    }
}
