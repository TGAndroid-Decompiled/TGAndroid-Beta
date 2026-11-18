package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f7735e;
    public final boolean f7736a;
    public final m f7737b;
    public boolean f7738c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7737b = mVar;
        this.f7736a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                z10 = true;
                if (!f7735e) {
                    d = a(context);
                    f7735e = true;
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
        synchronized (this.f7737b) {
            try {
                if (!this.f7738c) {
                    m mVar = this.f7737b;
                    mVar.f7732b.getClass();
                    mVar.f7732b.sendEmptyMessage(2);
                    this.f7738c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
