package li;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f12233a;
    public final v f12234b;
    public final Size f12235c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f12236f;
    public final CountDownLatch h;

    public r(v vVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f12233a = i11;
        this.f12234b = vVar;
        this.f12235c = size;
        this.d = i10;
        this.e = z10;
        this.f12236f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f12233a) {
            case 0:
                Size size = this.f12235c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f12236f;
                countDownLatch = this.h;
                v vVar = this.f12234b;
                vVar.getClass();
                try {
                    try {
                        vVar.f12255c = size;
                        vVar.f12270l = i10;
                        vVar.f12275o = z10;
                        SurfaceTexture surfaceTexture = vVar.f12292x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i11 = vVar.E;
                        if (i11 != 0) {
                            vVar.k(i11, i10);
                        }
                        p pVar = vVar.f12264i;
                        StringBuilder sb2 = new StringBuilder("GL secondary input configured: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (i10 == vVar.f12261g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        sb2.append(", timestampRealtime=");
                        sb2.append(z10);
                        pVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
            default:
                v vVar2 = this.f12234b;
                Size size2 = this.f12235c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f12236f;
                countDownLatch = this.h;
                try {
                    try {
                        vVar2.f12251a = size2;
                        vVar2.f12253b = size2;
                        vVar2.f12255c = size2;
                        vVar2.f12266j = i12;
                        vVar2.f12268k = i12;
                        vVar2.f12270l = i12;
                        vVar2.f12272m = z11;
                        vVar2.f12273n = z11;
                        vVar2.f12275o = z11;
                        SurfaceTexture surfaceTexture2 = vVar2.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = vVar2.f12292x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        vVar2.k(vVar2.D, vVar2.f12268k);
                        int i13 = vVar2.E;
                        if (i13 != 0) {
                            vVar2.k(i13, vVar2.f12270l);
                        }
                        g0 g0Var = vVar2.N;
                        if (g0Var != null) {
                            g0Var.f12056c = size2;
                            g0Var.d = i12;
                            g0Var.f12067q = g0.j(size2, i12, false);
                            g0Var.f12068r = g0.j(size2, i12, true);
                            g0Var.A = false;
                            g0Var.f12075z = 0L;
                        }
                        p pVar2 = vVar2.f12264i;
                        StringBuilder sb3 = new StringBuilder("GL input updated: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (vVar2.f12266j == vVar2.f12261g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        pVar2.b(sb3.toString());
                    } catch (RuntimeException e7) {
                        runtimeExceptionArr2[0] = e7;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
