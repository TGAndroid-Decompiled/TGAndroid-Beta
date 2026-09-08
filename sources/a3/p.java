package a3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class p extends Surface {
    public static int d;
    public static boolean f189e;
    public final boolean f190a;
    public final o f191b;
    public boolean f192c;

    public p(o oVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f191b = oVar;
        this.f190a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: a3.p.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (p.class) {
            try {
                z10 = true;
                if (!f189e) {
                    d = a(context);
                    f189e = true;
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
        synchronized (this.f191b) {
            try {
                if (!this.f192c) {
                    o oVar = this.f191b;
                    oVar.f186b.getClass();
                    oVar.f186b.sendEmptyMessage(2);
                    this.f192c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
