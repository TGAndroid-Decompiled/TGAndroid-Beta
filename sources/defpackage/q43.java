package defpackage;

import android.view.ViewTreeObserver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class q43 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final ao6 b;
    public final int c;
    public final int d;
    public final u43 e;

    public q43(u43 u43Var, ao6 ao6Var, int i, int i2, byte b) {
        this.a = b;
        this.e = u43Var;
        this.b = ao6Var;
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
        ao6 ao6Var = this.b;
        u43 u43Var = this.e;
        int i = this.d;
        int i2 = this.c;
        switch (b) {
            case 0:
                u43Var.l(false);
                CropAreaView cropAreaView = u43Var.a;
                if (ao6Var != null) {
                    float f5 = ao6Var.v;
                    if (f5 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f5);
                        t43 t43Var = u43Var.N;
                        if (t43Var != null) {
                            t43Var.H0(true);
                        }
                    }
                    u43Var.setFreeform(ao6Var.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = ao6Var.k;
                    if (i3 != 90 && i3 != 270) {
                        s43 s43Var = u43Var.M;
                        f = s43Var.a;
                        f2 = s43Var.b;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        s43 s43Var2 = u43Var.M;
                        f = s43Var2.b;
                        f2 = s43Var2.a;
                        i2 = i;
                        i = i2;
                    }
                    if (u43Var.y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = u43Var.getCurrentWidth();
                        int currentHeight = u43Var.getCurrentHeight();
                        if ((i3 + u43Var.M.g) % 180.0f != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z, u43Var.y);
                    }
                    u43Var.M.d(i3);
                    cropAreaView.setActualRect((aspectRatio * ao6Var.e) / ao6Var.f);
                    s43 s43Var3 = u43Var.M;
                    s43Var3.j = ao6Var.l;
                    s43Var3.e(ao6Var.d);
                    s43 s43Var4 = u43Var.M;
                    float f6 = ao6Var.a * i;
                    float f7 = s43Var4.f;
                    s43Var4.g(f6 * f7, ao6Var.b * i2 * f7);
                    float max = Math.max(cropAreaView.getCropWidth() / f, cropAreaView.getCropHeight() / f2);
                    s43 s43Var5 = u43Var.M;
                    s43Var5.f(ao6Var.c * (max / s43Var5.f), 0.0f, 0.0f);
                    u43Var.r(false);
                    t43 t43Var2 = u43Var.N;
                    if (t43Var2 != null) {
                        t43Var2.R0(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                u43Var.l(false);
                CropAreaView cropAreaView2 = u43Var.a;
                if (ao6Var != null) {
                    float f8 = ao6Var.v;
                    if (f8 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f8);
                        t43 t43Var3 = u43Var.N;
                        if (t43Var3 != null) {
                            t43Var3.H0(true);
                        }
                    }
                    u43Var.setFreeform(ao6Var.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i4 = ao6Var.k;
                    if (i4 != 90 && i4 != 270) {
                        s43 s43Var6 = u43Var.M;
                        f3 = s43Var6.a;
                        f4 = s43Var6.b;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        s43 s43Var7 = u43Var.M;
                        f3 = s43Var7.b;
                        f4 = s43Var7.a;
                        i2 = i;
                        i = i2;
                    }
                    if (u43Var.y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = u43Var.getCurrentWidth();
                        int currentHeight2 = u43Var.getCurrentHeight();
                        if ((i4 + u43Var.M.g) % 180.0f != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z2, u43Var.y);
                    }
                    u43Var.M.d(i4);
                    cropAreaView2.setActualRect((aspectRatio2 * ao6Var.e) / ao6Var.f);
                    s43 s43Var8 = u43Var.M;
                    s43Var8.j = ao6Var.l;
                    s43Var8.e(ao6Var.d);
                    s43 s43Var9 = u43Var.M;
                    float f9 = ao6Var.a * i;
                    float f10 = s43Var9.f;
                    s43Var9.g(f9 * f10, ao6Var.b * i2 * f10);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f3, cropAreaView2.getCropHeight() / f4);
                    s43 s43Var10 = u43Var.M;
                    s43Var10.f(ao6Var.c * (max2 / s43Var10.f), 0.0f, 0.0f);
                    u43Var.r(false);
                    t43 t43Var4 = u43Var.N;
                    if (t43Var4 != null) {
                        t43Var4.R0(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
