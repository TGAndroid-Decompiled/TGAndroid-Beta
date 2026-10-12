package li;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class r implements Runnable {
    public final int f14948a;
    public final u f14949b;
    public final Size f14950c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f14951f;
    public final CountDownLatch h;

    public r(u uVar, Size size, int i10, boolean z10, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, int i11) {
        this.f14948a = i11;
        this.f14949b = uVar;
        this.f14950c = size;
        this.d = i10;
        this.e = z10;
        this.f14951f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        CountDownLatch countDownLatch;
        String str;
        String str2;
        switch (this.f14948a) {
            case 0:
                u uVar = this.f14949b;
                Size size = this.f14950c;
                int i10 = this.d;
                boolean z10 = this.e;
                RuntimeException[] runtimeExceptionArr = this.f14951f;
                countDownLatch = this.h;
                try {
                    try {
                        uVar.f14961a = size;
                        uVar.f14963b = size;
                        uVar.f14965c = size;
                        uVar.f14976j = i10;
                        uVar.f14978k = i10;
                        uVar.f14980l = i10;
                        uVar.f14982m = z10;
                        uVar.f14983n = z10;
                        uVar.f14985o = z10;
                        SurfaceTexture surfaceTexture = uVar.v;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture2 = uVar.f15002x;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        uVar.k(uVar.D, uVar.f14978k);
                        int i11 = uVar.E;
                        if (i11 != 0) {
                            uVar.k(i11, uVar.f14980l);
                        }
                        e0 e0Var = uVar.N;
                        if (e0Var != null) {
                            e0Var.f14766c = size;
                            e0Var.d = i10;
                            e0Var.f14777q = e0.j(size, i10, false);
                            e0Var.f14778r = e0.j(size, i10, true);
                            e0Var.A = false;
                            e0Var.f14785z = 0L;
                        }
                        p pVar = uVar.f14974i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i10);
                        sb2.append(", filter=");
                        if (uVar.f14976j == uVar.f14971g) {
                            str = "NEAREST";
                        } else {
                            str = "LINEAR";
                        }
                        sb2.append(str);
                        pVar.b(sb2.toString());
                    } finally {
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr[0] = e;
                }
                countDownLatch.countDown();
                return;
            default:
                Size size2 = this.f14950c;
                int i12 = this.d;
                boolean z11 = this.e;
                RuntimeException[] runtimeExceptionArr2 = this.f14951f;
                countDownLatch = this.h;
                u uVar2 = this.f14949b;
                uVar2.getClass();
                try {
                    try {
                        uVar2.f14965c = size2;
                        uVar2.f14980l = i12;
                        uVar2.f14985o = z11;
                        SurfaceTexture surfaceTexture3 = uVar2.f15002x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        int i13 = uVar2.E;
                        if (i13 != 0) {
                            uVar2.k(i13, i12);
                        }
                        p pVar2 = uVar2.f14974i;
                        StringBuilder sb3 = new StringBuilder("GL secondary input configured: input=");
                        sb3.append(size2);
                        sb3.append(", crop=");
                        sb3.append(i12);
                        sb3.append(", filter=");
                        if (i12 == uVar2.f14971g) {
                            str2 = "NEAREST";
                        } else {
                            str2 = "LINEAR";
                        }
                        sb3.append(str2);
                        sb3.append(", timestampRealtime=");
                        sb3.append(z11);
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
