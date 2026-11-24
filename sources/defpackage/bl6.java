package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
public final class bl6 implements Runnable {
    public final MediaController a;
    public final boolean b;
    public final boolean c;
    public final om6 d;
    public final File e;
    public final float f;
    public final long h;
    public final boolean n;
    public final long r;

    public bl6(MediaController mediaController, boolean z, boolean z2, om6 om6Var, File file, float f, long j, boolean z3, long j2) {
        this.a = mediaController;
        this.b = z;
        this.c = z2;
        this.d = om6Var;
        this.e = file;
        this.f = f;
        this.h = j;
        this.n = z3;
        this.r = j2;
    }

    @Override
    public final void run() {
        boolean z;
        VideoEncodingService videoEncodingService;
        char c;
        long j;
        MediaController mediaController = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        om6 om6Var = this.d;
        File file = this.e;
        float f = this.f;
        long j2 = this.h;
        boolean z4 = this.n;
        long j3 = this.r;
        String[] strArr = MediaController.W1;
        if (z2 || z3) {
            boolean z5 = om6Var.b.V;
            synchronized (mediaController.b) {
                om6Var.b.V = false;
            }
            mediaController.c0.remove(om6Var);
            mediaController.a0.remove(om6Var);
            if (!z5 && !z2) {
                z = false;
            } else {
                z = true;
            }
            mediaController.f(z);
            if (om6Var.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == om6Var) {
                om6 om6Var2 = MediaController.w().b0;
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                if (om6Var2 != null) {
                    videoEncodingService2.a(om6Var2);
                } else {
                    videoEncodingService2.stopSelf();
                }
            }
            mediaController.x0();
        }
        if (z2) {
            kk7.f(om6Var.c).k(kk7.b2, om6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j2));
            return;
        }
        if (z4) {
            c = 1;
            kk7.f(om6Var.c).k(kk7.Z1, om6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j2));
        } else {
            c = 1;
        }
        kk7 f2 = kk7.f(om6Var.c);
        int i = kk7.a2;
        k27 k27Var = om6Var.a;
        String file2 = file.toString();
        Long valueOf = Long.valueOf(j3);
        if (z3) {
            j = file.length();
        } else {
            j = 0;
        }
        Long valueOf2 = Long.valueOf(j);
        Float valueOf3 = Float.valueOf(f);
        Long valueOf4 = Long.valueOf(j2);
        Object[] objArr = new Object[6];
        objArr[0] = k27Var;
        objArr[c] = file2;
        objArr[2] = valueOf;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        f2.k(i, objArr);
    }
}
