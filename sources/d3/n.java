package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f7727e;
    public final boolean f7728a;
    public final m f7729b;
    public boolean f7730c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7729b = mVar;
        this.f7728a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                z10 = true;
                if (!f7727e) {
                    d = a(context);
                    f7727e = true;
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
        synchronized (this.f7729b) {
            try {
                if (!this.f7730c) {
                    m mVar = this.f7729b;
                    mVar.f7724b.getClass();
                    mVar.f7724b.sendEmptyMessage(2);
                    this.f7730c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
