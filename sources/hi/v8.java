package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.is;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f15249a;
    public final is f15250b;
    public final Object f15251c;
    public final int d;
    public final int f15252e;
    public final Object f15253f;
    public final boolean h;
    public final boolean f15254n;
    public final Object f15255r;

    public v8(sa saVar, u9 u9Var, int i7, int i10, d7 d7Var, boolean z10, boolean z11, Runnable runnable, int i11) {
        this.f15249a = i11;
        this.f15250b = saVar;
        this.f15251c = u9Var;
        this.d = i7;
        this.f15252e = i10;
        this.f15253f = d7Var;
        this.h = z10;
        this.f15254n = z11;
        this.f15255r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.v8.run():void");
    }

    public v8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z10, int i10, boolean z11) {
        this.f15249a = 2;
        this.f15250b = mediaController;
        this.f15251c = file;
        this.f15253f = file2;
        this.f15255r = tL_document;
        this.d = i7;
        this.h = z10;
        this.f15252e = i10;
        this.f15254n = z11;
    }
}
