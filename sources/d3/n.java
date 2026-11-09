package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f8058e;
    public final boolean f8059a;
    public final m f8060b;
    public boolean f8061c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f8060b = mVar;
        this.f8059a = z9;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z9;
        synchronized (n.class) {
            try {
                z9 = true;
                if (!f8058e) {
                    d = a(context);
                    f8058e = true;
                }
                if (d == 0) {
                    z9 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z9;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.f8060b) {
            try {
                if (!this.f8061c) {
                    m mVar = this.f8060b;
                    mVar.f8055b.getClass();
                    mVar.f8055b.sendEmptyMessage(2);
                    this.f8061c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
