package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f7761e;
    public final boolean f7762a;
    public final m f7763b;
    public boolean f7764c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7763b = mVar;
        this.f7762a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                z10 = true;
                if (!f7761e) {
                    d = a(context);
                    f7761e = true;
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
        synchronized (this.f7763b) {
            try {
                if (!this.f7764c) {
                    m mVar = this.f7763b;
                    mVar.f7758b.getClass();
                    mVar.f7758b.sendEmptyMessage(2);
                    this.f7764c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
