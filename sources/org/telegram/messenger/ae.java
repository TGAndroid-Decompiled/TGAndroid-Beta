package org.telegram.messenger;

import java.io.File;
public final class ae implements Runnable {
    public final MediaController f21420a;
    public final boolean f21421b;
    public final boolean f21422c;
    public final lf d;
    public final File f21423e;
    public final float f21424f;
    public final long h;
    public final boolean f21425n;
    public final long f21426r;

    public ae(MediaController mediaController, boolean z9, boolean z10, lf lfVar, File file, float f10, long j3, boolean z11, long j10) {
        this.f21420a = mediaController;
        this.f21421b = z9;
        this.f21422c = z10;
        this.d = lfVar;
        this.f21423e = file;
        this.f21424f = f10;
        this.h = j3;
        this.f21425n = z11;
        this.f21426r = j10;
    }

    @Override
    public final void run() {
        char c10;
        boolean z9;
        char c11;
        long j3;
        MediaController mediaController = this.f21420a;
        boolean z10 = this.f21421b;
        boolean z11 = this.f21422c;
        lf lfVar = this.d;
        File file = this.f21423e;
        float f10 = this.f21424f;
        long j10 = this.h;
        boolean z12 = this.f21425n;
        long j11 = this.f21426r;
        String[] strArr = MediaController.V1;
        if (!z10 && !z11) {
            c10 = 1;
        } else {
            boolean z13 = lfVar.f23888b.W;
            synchronized (mediaController.f21253b) {
                c10 = 1;
                lfVar.f23888b.W = false;
            }
            mediaController.f21254b0.remove(lfVar);
            mediaController.Z.remove(lfVar);
            if (!z13 && !z10) {
                z9 = false;
            } else {
                z9 = true;
            }
            mediaController.k(z9);
            mediaController.y0();
        }
        if (z10) {
            qs f11 = qs.f(lfVar.f23889c);
            int i7 = qs.f24981c2;
            ij ijVar = lfVar.f23887a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j10);
            Object[] objArr = new Object[4];
            objArr[0] = ijVar;
            objArr[c10] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i7, objArr);
            return;
        }
        if (z12) {
            qs f12 = qs.f(lfVar.f23889c);
            int i10 = qs.f24969a2;
            ij ijVar2 = lfVar.f23887a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j10);
            c11 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = ijVar2;
            objArr2[c10] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c11 = 3;
        }
        qs f13 = qs.f(lfVar.f23889c);
        int i11 = qs.f24975b2;
        ij ijVar3 = lfVar.f23887a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j11);
        if (z11) {
            j3 = file.length();
        } else {
            j3 = 0;
        }
        Long valueOf6 = Long.valueOf(j3);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j10);
        Object[] objArr3 = new Object[6];
        objArr3[0] = ijVar3;
        objArr3[c10] = file4;
        objArr3[2] = valueOf5;
        objArr3[c11] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
