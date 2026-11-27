package defpackage;

import android.graphics.SurfaceTexture;
public final class qjc implements Runnable {
    public SurfaceTexture a;
    public final boolean b;
    public final rjc c;

    public qjc(rjc rjcVar, boolean z) {
        this.c = rjcVar;
        this.b = z;
    }

    public final synchronized void a(SurfaceTexture surfaceTexture) {
        this.a = surfaceTexture;
    }

    @Override
    public final synchronized void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjc.run():void");
    }
}
