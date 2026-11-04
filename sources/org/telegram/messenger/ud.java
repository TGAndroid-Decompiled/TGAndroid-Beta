package org.telegram.messenger;

import java.io.File;
public final class ud implements Runnable {
    public final MediaController f25681a;
    public final boolean f25682b;
    public final boolean f25683c;
    public final cf d;
    public final File f25684e;
    public final float f25685f;
    public final long h;
    public final boolean f25686n;
    public final long f25687r;

    public ud(MediaController mediaController, boolean z10, boolean z11, cf cfVar, File file, float f10, long j10, boolean z12, long j11) {
        this.f25681a = mediaController;
        this.f25682b = z10;
        this.f25683c = z11;
        this.d = cfVar;
        this.f25684e = file;
        this.f25685f = f10;
        this.h = j10;
        this.f25686n = z12;
        this.f25687r = j11;
    }

    @Override
    public final void run() {
        char c2;
        boolean z10;
        char c10;
        long j10;
        MediaController mediaController = this.f25681a;
        boolean z11 = this.f25682b;
        boolean z12 = this.f25683c;
        cf cfVar = this.d;
        File file = this.f25684e;
        float f10 = this.f25685f;
        long j11 = this.h;
        boolean z13 = this.f25686n;
        long j12 = this.f25687r;
        String[] strArr = MediaController.W1;
        if (!z11 && !z12) {
            c2 = 1;
        } else {
            boolean z14 = cfVar.f22015b.W;
            synchronized (mediaController.f21304b) {
                c2 = 1;
                cfVar.f22015b.W = false;
            }
            mediaController.f21308c0.remove(cfVar);
            mediaController.f21302a0.remove(cfVar);
            if (!z14 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            mediaController.k(z10);
            mediaController.y0();
        }
        if (z11) {
            hs f11 = hs.f(cfVar.f22016c);
            int i3 = hs.c2;
            zi ziVar = cfVar.f22014a;
            String file2 = file.toString();
            Float valueOf = Float.valueOf(f10);
            Long valueOf2 = Long.valueOf(j11);
            Object[] objArr = new Object[4];
            objArr[0] = ziVar;
            objArr[c2] = file2;
            objArr[2] = valueOf;
            objArr[3] = valueOf2;
            f11.k(i3, objArr);
            return;
        }
        if (z13) {
            hs f12 = hs.f(cfVar.f22016c);
            int i10 = hs.f23198a2;
            zi ziVar2 = cfVar.f22014a;
            String file3 = file.toString();
            Float valueOf3 = Float.valueOf(f10);
            Long valueOf4 = Long.valueOf(j11);
            c10 = 3;
            Object[] objArr2 = new Object[4];
            objArr2[0] = ziVar2;
            objArr2[c2] = file3;
            objArr2[2] = valueOf3;
            objArr2[3] = valueOf4;
            f12.k(i10, objArr2);
        } else {
            c10 = 3;
        }
        hs f13 = hs.f(cfVar.f22016c);
        int i11 = hs.f23204b2;
        zi ziVar3 = cfVar.f22014a;
        String file4 = file.toString();
        Long valueOf5 = Long.valueOf(j12);
        if (z12) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        Long valueOf6 = Long.valueOf(j10);
        Float valueOf7 = Float.valueOf(f10);
        Long valueOf8 = Long.valueOf(j11);
        Object[] objArr3 = new Object[6];
        objArr3[0] = ziVar3;
        objArr3[c2] = file4;
        objArr3[2] = valueOf5;
        objArr3[c10] = valueOf6;
        objArr3[4] = valueOf7;
        objArr3[5] = valueOf8;
        f13.k(i11, objArr3);
    }
}
