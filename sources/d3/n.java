package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f8063e;
    public final boolean f8064a;
    public final m f8065b;
    public boolean f8066c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f8065b = mVar;
        this.f8064a = z9;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z9;
        synchronized (n.class) {
            try {
                z9 = true;
                if (!f8063e) {
                    d = a(context);
                    f8063e = true;
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
        synchronized (this.f8065b) {
            try {
                if (!this.f8066c) {
                    m mVar = this.f8065b;
                    mVar.f8060b.getClass();
                    mVar.f8060b.sendEmptyMessage(2);
                    this.f8066c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
