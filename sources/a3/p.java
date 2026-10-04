package a3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class p extends Surface {
    public static int d;
    public static boolean f191e;
    public final boolean f192a;
    public final o f193b;
    public boolean f194c;

    public p(o oVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f193b = oVar;
        this.f192a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: a3.p.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (p.class) {
            try {
                z10 = true;
                if (!f191e) {
                    d = a(context);
                    f191e = true;
                }
                if (d == 0) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.f193b) {
            try {
                if (!this.f194c) {
                    o oVar = this.f193b;
                    oVar.f188b.getClass();
                    oVar.f188b.sendEmptyMessage(2);
                    this.f194c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
