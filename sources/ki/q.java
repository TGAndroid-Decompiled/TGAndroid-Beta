package ki;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class q implements Runnable {
    public final int f15084a;
    public final t f15085b;
    public final Size f15086c;
    public final int d;
    public final boolean f15087e;
    public final RuntimeException[] f15088f;
    public final CountDownLatch h;

    public q(t tVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f15084a = i11;
        this.f15085b = tVar;
        this.f15086c = size;
        this.d = i10;
        this.f15087e = z10;
        this.f15088f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f15084a) {
            case 0:
                t tVar = this.f15085b;
                Size size = this.f15086c;
                int i10 = this.d;
                boolean z10 = this.f15087e;
                RuntimeException[] runtimeExceptionArr = this.f15088f;
                countDownLatch = this.h;
                try {
                    try {
                        tVar.f15098a = size;
                        tVar.f15100b = size;
                        tVar.f15102c = size;
                        tVar.f15114j = i10;
                        tVar.f15116k = i10;
                        tVar.f15118l = i10;
                        tVar.f15120m = z10;
                        tVar.f15121n = z10;
                        tVar.f15123o = z10;
                        SurfaceTexture surfaceTexture = tVar.v;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture2 = tVar.f15140x;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        tVar.k(tVar.D, tVar.f15116k);
                        int i11 = tVar.E;
                        if (i11 != 0) {
                            tVar.k(i11, tVar.f15118l);
                        }
                        d0 d0Var = tVar.N;
                        if (d0Var != null) {
                            d0Var.f14896c = size;
                            d0Var.d = i10;
                            d0Var.f14908q = d0.j(size, i10, false);
                            d0Var.f14909r = d0.j(size, i10, true);
                            d0Var.A = false;
                            d0Var.f14916z = 0L;
                        }
                        o oVar = tVar.f15112i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (tVar.f15114j == tVar.f15109g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        oVar.b(sb2.toString());
                    } finally {
                    }
                } catch (RuntimeException e7) {
                    runtimeExceptionArr[0] = e7;
                }
                countDownLatch.countDown();
                return;
            default:
                Size size2 = this.f15086c;
                int i12 = this.d;
                boolean z11 = this.f15087e;
                RuntimeException[] runtimeExceptionArr2 = this.f15088f;
                countDownLatch = this.h;
                t tVar2 = this.f15085b;
                tVar2.getClass();
                try {
                    try {
                        tVar2.f15102c = size2;
                        tVar2.f15118l = i12;
                        tVar2.f15123o = z11;
                        SurfaceTexture surfaceTexture3 = tVar2.f15140x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        int i13 = tVar2.E;
                        if (i13 != 0) {
                            tVar2.k(i13, i12);
                        }
                        o oVar2 = tVar2.f15112i;
                        StringBuilder sb3 = new StringBuilder("GL secondary input configured: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (i12 == tVar2.f15109g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        sb3.append(", timestampRealtime=");
                        sb3.append(z11);
                        oVar2.b(sb3.toString());
                    } catch (RuntimeException e10) {
                        runtimeExceptionArr2[0] = e10;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                }
        }
    }
}
