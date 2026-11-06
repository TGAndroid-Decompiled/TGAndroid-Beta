package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f13094a;
    public final ls f13095b;
    public final Object f13096c;
    public final int d;
    public final int f13097e;
    public final Object f13098f;
    public final boolean h;
    public final boolean f13099n;
    public final Object f13100r;

    public x8(va vaVar, x9 x9Var, int i7, int i10, e7 e7Var, boolean z9, boolean z10, Runnable runnable, int i11) {
        this.f13094a = i11;
        this.f13095b = vaVar;
        this.f13096c = x9Var;
        this.d = i7;
        this.f13097e = i10;
        this.f13098f = e7Var;
        this.h = z9;
        this.f13099n = z10;
        this.f13100r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.x8.run():void");
    }

    public x8(MediaController mediaController, File file, File file2, TLRPC.TL_document tL_document, int i7, boolean z9, int i10, boolean z10) {
        this.f13094a = 2;
        this.f13095b = mediaController;
        this.f13096c = file;
        this.f13098f = file2;
        this.f13100r = tL_document;
        this.d = i7;
        this.h = z9;
        this.f13097e = i10;
        this.f13099n = z10;
    }
}
