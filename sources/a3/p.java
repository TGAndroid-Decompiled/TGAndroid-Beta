package a3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class p extends Surface {
    public static int d;
    public static boolean e;
    public final boolean f175a;
    public final o f176b;
    public boolean f177c;

    public p(o oVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f176b = oVar;
        this.f175a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: a3.p.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (p.class) {
            try {
                z10 = true;
                if (!e) {
                    d = a(context);
                    e = true;
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
        synchronized (this.f176b) {
            try {
                if (!this.f177c) {
                    o oVar = this.f176b;
                    oVar.f173b.getClass();
                    oVar.f173b.sendEmptyMessage(2);
                    this.f177c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
