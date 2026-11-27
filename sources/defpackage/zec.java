package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
public final class zec {
    public final Context a;
    public boolean b;
    public wec c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public zec(Context context) {
        this.a = context;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.i != Integer.MIN_VALUE && this.g != 0.0f && surface.isValid()) {
            this.g = 0.0f;
            mka.w(this.e, 0.0f);
        }
    }

    public final void b() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.i != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f2 = this.f;
                if (f2 != -1.0f) {
                    f = f2 * this.h;
                    if (!z || this.g != f) {
                        this.g = f;
                        mka.w(this.e, f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (!z) {
            }
            this.g = f;
            mka.w(this.e, f);
        }
    }
}
