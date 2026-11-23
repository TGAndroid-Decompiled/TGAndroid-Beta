package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gs;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f15561a;
    public final gs f15562b;
    public final Object f15563c;
    public final int d;
    public final int f15564e;
    public final Object f15565f;
    public final boolean h;
    public final boolean f15566n;
    public final Object f15567r;

    public v8(ta taVar, v9 v9Var, int i7, int i10, d7 d7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15561a = i11;
        this.f15562b = taVar;
        this.f15563c = v9Var;
        this.d = i7;
        this.f15564e = i10;
        this.f15565f = d7Var;
        this.h = z10;
        this.f15566n = z11;
        this.f15567r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v8.run():void");
    }

    public v8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15561a = 2;
        this.f15562b = mediaController;
        this.f15563c = file;
        this.f15565f = file2;
        this.f15567r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15564e = i10;
        this.f15566n = z11;
    }
}
