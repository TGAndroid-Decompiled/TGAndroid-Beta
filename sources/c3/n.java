package c3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class n extends Surface {
    public static int d;
    public static boolean f4086e;
    public final boolean f4087a;
    public final m f4088b;
    public boolean f4089c;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f4088b = mVar;
        this.f4087a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: c3.n.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (n.class) {
            try {
                z10 = true;
                if (!f4086e) {
                    d = a(context);
                    f4086e = true;
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
        synchronized (this.f4088b) {
            try {
                if (!this.f4089c) {
                    m mVar = this.f4088b;
                    mVar.f4083b.getClass();
                    mVar.f4083b.sendEmptyMessage(2);
                    this.f4089c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
