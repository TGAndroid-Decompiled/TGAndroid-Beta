package defpackage;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class f33 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final zl6 b;
    public final int c;
    public final int d;
    public final j33 e;

    public f33(j33 j33Var, zl6 zl6Var, int i, int i2, byte b) {
        this.a = b;
        this.e = j33Var;
        this.b = zl6Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final boolean onPreDraw() {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        boolean z2;
        byte b = this.a;
        zl6 zl6Var = this.b;
        j33 j33Var = this.e;
        int i = this.d;
        int i2 = this.c;
        switch (b) {
            case 0:
                j33Var.l(false);
                CropAreaView cropAreaView = j33Var.a;
                if (zl6Var != null) {
                    float f5 = zl6Var.v;
                    if (f5 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f5);
                        i33 i33Var = j33Var.N;
                        if (i33Var != null) {
                            i33Var.o1(true);
                        }
                    }
                    j33Var.setFreeform(zl6Var.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = zl6Var.k;
                    if (i3 != 90 && i3 != 270) {
                        h33 h33Var = j33Var.M;
                        f = h33Var.a;
                        f2 = h33Var.b;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        h33 h33Var2 = j33Var.M;
                        f = h33Var2.b;
                        f2 = h33Var2.a;
                        i2 = i;
                        i = i2;
                    }
                    if (j33Var.y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = j33Var.getCurrentWidth();
                        int currentHeight = j33Var.getCurrentHeight();
                        if ((i3 + j33Var.M.g) % 180.0f != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z, j33Var.y);
                    }
                    j33Var.M.d(i3);
                    cropAreaView.setActualRect((aspectRatio * zl6Var.e) / zl6Var.f);
                    h33 h33Var3 = j33Var.M;
                    h33Var3.j = zl6Var.l;
                    h33Var3.e(zl6Var.d);
                    h33 h33Var4 = j33Var.M;
                    float f6 = zl6Var.a * i;
                    float f7 = h33Var4.f;
                    h33Var4.g(f6 * f7, zl6Var.b * i2 * f7);
                    float max = Math.max(cropAreaView.getCropWidth() / f, cropAreaView.getCropHeight() / f2);
                    h33 h33Var5 = j33Var.M;
                    h33Var5.f(zl6Var.c * (max / h33Var5.f), 0.0f, 0.0f);
                    j33Var.r(false);
                    i33 i33Var2 = j33Var.N;
                    if (i33Var2 != null) {
                        i33Var2.h2(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                j33Var.l(false);
                CropAreaView cropAreaView2 = j33Var.a;
                if (zl6Var != null) {
                    float f8 = zl6Var.v;
                    if (f8 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f8);
                        i33 i33Var3 = j33Var.N;
                        if (i33Var3 != null) {
                            i33Var3.o1(true);
                        }
                    }
                    j33Var.setFreeform(zl6Var.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i4 = zl6Var.k;
                    if (i4 != 90 && i4 != 270) {
                        h33 h33Var6 = j33Var.M;
                        f3 = h33Var6.a;
                        f4 = h33Var6.b;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        h33 h33Var7 = j33Var.M;
                        f3 = h33Var7.b;
                        f4 = h33Var7.a;
                        i2 = i;
                        i = i2;
                    }
                    if (j33Var.y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = j33Var.getCurrentWidth();
                        int currentHeight2 = j33Var.getCurrentHeight();
                        if ((i4 + j33Var.M.g) % 180.0f != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z2, j33Var.y);
                    }
                    j33Var.M.d(i4);
                    cropAreaView2.setActualRect((aspectRatio2 * zl6Var.e) / zl6Var.f);
                    h33 h33Var8 = j33Var.M;
                    h33Var8.j = zl6Var.l;
                    h33Var8.e(zl6Var.d);
                    h33 h33Var9 = j33Var.M;
                    float f9 = zl6Var.a * i;
                    float f10 = h33Var9.f;
                    h33Var9.g(f9 * f10, zl6Var.b * i2 * f10);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f3, cropAreaView2.getCropHeight() / f4);
                    h33 h33Var10 = j33Var.M;
                    h33Var10.f(zl6Var.c * (max2 / h33Var10.f), 0.0f, 0.0f);
                    j33Var.r(false);
                    i33 i33Var4 = j33Var.N;
                    if (i33Var4 != null) {
                        i33Var4.h2(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
