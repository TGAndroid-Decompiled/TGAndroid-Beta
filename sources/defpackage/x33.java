package defpackage;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class x33 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final fo6 b;
    public final int c;
    public final int d;
    public final b43 e;

    public x33(b43 b43Var, fo6 fo6Var, int i, int i2, byte b) {
        this.a = b;
        this.e = b43Var;
        this.b = fo6Var;
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
        fo6 fo6Var = this.b;
        b43 b43Var = this.e;
        int i = this.d;
        int i2 = this.c;
        switch (b) {
            case 0:
                b43Var.l(false);
                CropAreaView cropAreaView = b43Var.a;
                if (fo6Var != null) {
                    float f5 = fo6Var.v;
                    if (f5 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f5);
                        a43 a43Var = b43Var.N;
                        if (a43Var != null) {
                            a43Var.t0(true);
                        }
                    }
                    b43Var.setFreeform(fo6Var.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = fo6Var.k;
                    if (i3 != 90 && i3 != 270) {
                        z33 z33Var = b43Var.M;
                        f = z33Var.a;
                        f2 = z33Var.b;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        z33 z33Var2 = b43Var.M;
                        f = z33Var2.b;
                        f2 = z33Var2.a;
                        i2 = i;
                        i = i2;
                    }
                    if (b43Var.y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = b43Var.getCurrentWidth();
                        int currentHeight = b43Var.getCurrentHeight();
                        if ((i3 + b43Var.M.g) % 180.0f != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z, b43Var.y);
                    }
                    b43Var.M.d(i3);
                    cropAreaView.setActualRect((aspectRatio * fo6Var.e) / fo6Var.f);
                    z33 z33Var3 = b43Var.M;
                    z33Var3.j = fo6Var.l;
                    z33Var3.e(fo6Var.d);
                    z33 z33Var4 = b43Var.M;
                    float f6 = fo6Var.a * i;
                    float f7 = z33Var4.f;
                    z33Var4.g(f6 * f7, fo6Var.b * i2 * f7);
                    float max = Math.max(cropAreaView.getCropWidth() / f, cropAreaView.getCropHeight() / f2);
                    z33 z33Var5 = b43Var.M;
                    z33Var5.f(fo6Var.c * (max / z33Var5.f), 0.0f, 0.0f);
                    b43Var.r(false);
                    a43 a43Var2 = b43Var.N;
                    if (a43Var2 != null) {
                        a43Var2.F0(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                b43Var.l(false);
                CropAreaView cropAreaView2 = b43Var.a;
                if (fo6Var != null) {
                    float f8 = fo6Var.v;
                    if (f8 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f8);
                        a43 a43Var3 = b43Var.N;
                        if (a43Var3 != null) {
                            a43Var3.t0(true);
                        }
                    }
                    b43Var.setFreeform(fo6Var.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i4 = fo6Var.k;
                    if (i4 != 90 && i4 != 270) {
                        z33 z33Var6 = b43Var.M;
                        f3 = z33Var6.a;
                        f4 = z33Var6.b;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        z33 z33Var7 = b43Var.M;
                        f3 = z33Var7.b;
                        f4 = z33Var7.a;
                        i2 = i;
                        i = i2;
                    }
                    if (b43Var.y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = b43Var.getCurrentWidth();
                        int currentHeight2 = b43Var.getCurrentHeight();
                        if ((i4 + b43Var.M.g) % 180.0f != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z2, b43Var.y);
                    }
                    b43Var.M.d(i4);
                    cropAreaView2.setActualRect((aspectRatio2 * fo6Var.e) / fo6Var.f);
                    z33 z33Var8 = b43Var.M;
                    z33Var8.j = fo6Var.l;
                    z33Var8.e(fo6Var.d);
                    z33 z33Var9 = b43Var.M;
                    float f9 = fo6Var.a * i;
                    float f10 = z33Var9.f;
                    z33Var9.g(f9 * f10, fo6Var.b * i2 * f10);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f3, cropAreaView2.getCropHeight() / f4);
                    z33 z33Var10 = b43Var.M;
                    z33Var10.f(fo6Var.c * (max2 / z33Var10.f), 0.0f, 0.0f);
                    b43Var.r(false);
                    a43 a43Var4 = b43Var.N;
                    if (a43Var4 != null) {
                        a43Var4.F0(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
