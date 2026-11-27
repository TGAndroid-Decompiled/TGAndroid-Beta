package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
public final class nn6 implements Runnable {
    public final MediaController a;
    public final boolean b;
    public final boolean c;
    public final so6 d;
    public final File e;
    public final float f;
    public final long h;
    public final boolean n;
    public final long r;

    public nn6(MediaController mediaController, boolean z, boolean z2, so6 so6Var, File file, float f, long j, boolean z3, long j2) {
        this.a = mediaController;
        this.b = z;
        this.c = z2;
        this.d = so6Var;
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
        so6 so6Var = this.d;
        File file = this.e;
        float f = this.f;
        long j2 = this.h;
        boolean z4 = this.n;
        long j3 = this.r;
        String[] strArr = MediaController.W1;
        if (z2 || z3) {
            boolean z5 = so6Var.b.V;
            synchronized (mediaController.b) {
                so6Var.b.V = false;
            }
            mediaController.c0.remove(so6Var);
            mediaController.a0.remove(so6Var);
            if (!z5 && !z2) {
                z = false;
            } else {
                z = true;
            }
            mediaController.f(z);
            if (so6Var.d && (videoEncodingService = VideoEncodingService.e) != null && videoEncodingService.b == so6Var) {
                so6 so6Var2 = MediaController.z().b0;
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                if (so6Var2 != null) {
                    videoEncodingService2.a(so6Var2);
                } else {
                    videoEncodingService2.stopSelf();
                }
            }
            mediaController.C0();
        }
        if (z2) {
            jn7.f(so6Var.c).k(jn7.c2, so6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j2));
            return;
        }
        if (z4) {
            c = 1;
            jn7.f(so6Var.c).k(jn7.a2, so6Var.a, file.toString(), Float.valueOf(f), Long.valueOf(j2));
        } else {
            c = 1;
        }
        jn7 f2 = jn7.f(so6Var.c);
        int i = jn7.b2;
        r47 r47Var = so6Var.a;
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
        objArr[0] = r47Var;
        objArr[c] = file2;
        objArr[2] = valueOf;
        objArr[3] = valueOf2;
        objArr[4] = valueOf3;
        objArr[5] = valueOf4;
        f2.k(i, objArr);
    }
}
