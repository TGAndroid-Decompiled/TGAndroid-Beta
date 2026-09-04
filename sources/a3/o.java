package a3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
public final class o extends Surface {
    public static int d;
    public static boolean f165e;
    public final boolean f166a;
    public final n f167b;
    public boolean f168c;

    public o(n nVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f167b = nVar;
        this.f166a = z10;
    }

    public static int a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: a3.o.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (o.class) {
            try {
                z10 = true;
                if (!f165e) {
                    d = a(context);
                    f165e = true;
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
        synchronized (this.f167b) {
            try {
                if (!this.f168c) {
                    n nVar = this.f167b;
                    nVar.f162b.getClass();
                    nVar.f162b.sendEmptyMessage(2);
                    this.f168c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
