package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f7452e;
    public final boolean f7453a;
    public final m f7454b;
    public boolean f7455c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7454b = mVar;
        this.f7453a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                z10 = true;
                if (!f7452e) {
                    d = a(context);
                    f7452e = true;
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
        synchronized (this.f7454b) {
            try {
                if (!this.f7455c) {
                    m mVar = this.f7454b;
                    mVar.f7449b.getClass();
                    mVar.f7449b.sendEmptyMessage(2);
                    this.f7455c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
