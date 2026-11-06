package d3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f8060e;
    public final boolean f8061a;
    public final m f8062b;
    public boolean f8063c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f8062b = mVar;
        this.f8061a = z9;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z9;
        synchronized (n.class) {
            try {
                z9 = true;
                if (!f8060e) {
                    d = a(context);
                    f8060e = true;
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
        synchronized (this.f8062b) {
            try {
                if (!this.f8063c) {
                    m mVar = this.f8062b;
                    mVar.f8057b.getClass();
                    mVar.f8057b.sendEmptyMessage(2);
                    this.f8063c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
