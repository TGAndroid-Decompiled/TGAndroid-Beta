package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class qm extends rn {
    public final byte b;

    public qm(String str, byte b) {
        super(str, (byte) 0);
        this.b = b;
    }

    @Override
    public final void c(Object obj, float f) {
        i19 i19Var;
        double sqrt;
        boolean z;
        boolean z2;
        float f2;
        ema emaVar;
        ema emaVar2;
        switch (this.b) {
            case 0:
                rm rmVar = (rm) obj;
                if (rmVar.e != f) {
                    rmVar.e = f;
                    rmVar.g.invalidate();
                    return;
                }
                return;
            case 1:
                ((ImageReceiver) obj).i1 = f;
                return;
            case 2:
                ((ClippingImageView) obj).setAnimationProgress(f);
                return;
            case 3:
                ((PhotoViewer) obj).setAnimationValue(f);
                return;
            case 4:
                ((of3) obj).setClipProgress(f);
                return;
            case 5:
                ((z11) obj).setInOutOffset(f);
                return;
            case 6:
                zu1.Ad = (int) f;
                return;
            case 7:
                ((wb2) obj).setTimeAlpha(f);
                return;
            case 8:
                ((n47) obj).d = f;
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f);
                return;
            case 10:
                ((hr8) obj).setCrossfadeProgress(f);
                return;
            case 11:
                i19 i19Var2 = (i19) obj;
                i19Var2.H = f;
                RectF rectF = i19Var2.w;
                RectF rectF2 = i19Var2.s;
                float interpolation = 1.0f - h19.p.getInterpolation(f);
                float interpolation2 = (h19.h.getInterpolation(i19Var2.H) - h19.i.getInterpolation(i19Var2.H)) * hl.L(13.0f);
                RectF rectF3 = i19Var2.n;
                RectF rectF4 = i19Var2.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g = i19.g(rectF3.height(), (hl.L(2.0f) * interpolation) + hl.L(56), h19.l.getInterpolation(i19Var2.H)) / 2.0f;
                g19 g19Var = h19.m;
                float g2 = i19.g(rectF3.width(), (hl.L(10.0f) * interpolation) + i19Var2.h(), g19Var.getInterpolation(i19Var2.H));
                float f3 = g * 2.0f;
                float max = Math.max(g2, f3);
                float interpolation3 = (g19Var.getInterpolation(i19Var2.H) * Math.min(hl.L(-12.0f) + i19Var2.G, (max - Math.max(rectF3.width(), f3)) / 2.0f)) + rectF4.centerX() + g;
                float interpolation4 = ((rectF4.bottom - g) - 1.0f) - (h19.n.getInterpolation(i19Var2.H) * ((hl.L(6.0f) * interpolation) + hl.L(38.0f)));
                RectF rectF5 = i19Var2.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g;
                if (i19Var2.R && !i19Var2.N) {
                    float g3 = i19.g(hl.L(5.0f), hl.L(3.0f), h19.o.getInterpolation(i19Var2.H));
                    float f4 = rectF5.bottom + g3;
                    double width = (rectF3.width() / 2.0f) + g3;
                    double abs = Math.abs(f4 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f5 = (float) sqrt;
                    float centerX = rectF3.centerX() - f5;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        PointF f6 = i19.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g3, true);
                        if (f6 != null) {
                            centerX = f6.x;
                            f4 = f6.y;
                        } else {
                            i19Var2.R = false;
                        }
                    }
                    rectF2.set(centerX - g3, f4 - g3, centerX + g3, f4 + g3);
                    float f7 = rectF5.bottom + g3;
                    float centerX2 = rectF3.centerX() + f5;
                    if (centerX2 > rectF5.right - (rectF5.height() / 2.0f)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        PointF f8 = i19.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g3, false);
                        if (f8 != null) {
                            centerX2 = f8.x;
                            f7 = f8.y;
                        } else {
                            i19Var2.R = false;
                        }
                    }
                    rectF.set(centerX2 - g3, f7 - g3, centerX2 + g3, f7 + g3);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && i19Var2.R) {
                        i19Var2.R = false;
                    }
                    if (i19Var2.R) {
                        Path path = i19Var2.e;
                        path.reset();
                        float b = i19.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b2 = i19.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        i19Var = i19Var2;
                        i19Var.a(path, rectF3, b, b2, false, false);
                        float f9 = -90.0f;
                        if (z) {
                            f2 = i19.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f2 = -90.0f;
                        }
                        float j = i19.j(b2);
                        float f10 = f2;
                        i19Var.a(path, rectF2, j, f10, true, true);
                        if (!z) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = i19.c0;
                        float f11 = rectF5.left;
                        rectF6.set(f11, rectF5.top, rectF5.height() + f11, rectF5.bottom);
                        i19Var.a(path, rectF6, i19.j(f10), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z2) {
                            f9 = i19.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        i19Var.a(path, rectF6, -90.0f, i19.j(f9), false, false);
                        if (!z2) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        i19Var.a(path, rectF, f9, i19.j(b), true, true);
                        path.close();
                        i19Var.invalidateSelf();
                        return;
                    }
                }
                i19Var = i19Var2;
                i19Var.invalidateSelf();
                return;
            case 12:
                i19 i19Var3 = (i19) obj;
                i19Var3.I = f;
                i19Var3.invalidateSelf();
                return;
            case 13:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f);
                return;
            case 14:
                ((SecretMediaViewer) obj).setAnimationValue(f);
                return;
            case 15:
                ey9 ey9Var = (ey9) obj;
                if (ey9Var.a != f) {
                    ey9Var.a = f;
                    SecretMediaViewer secretMediaViewer = ey9Var.r;
                    secretMediaViewer.R.setAlpha(f);
                    if (ey9Var.b) {
                        secretMediaViewer.R.setPivotX(emaVar.getWidth());
                        secretMediaViewer.R.setPivotY(emaVar2.getHeight());
                        float f12 = 1.0f - f;
                        float f13 = 1.0f - (0.1f * f12);
                        secretMediaViewer.R.setScaleX(f13);
                        secretMediaViewer.R.setScaleY(f13);
                        sfc sfcVar = secretMediaViewer.P;
                        if (sfcVar.y != f12) {
                            sfcVar.y = f12;
                            sfcVar.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (ey9Var.c) {
                        ey9Var.setTranslationY((1.0f - f) * hl.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f);
                    return;
                }
                return;
            case 16:
                wkb wkbVar = (wkb) obj;
                wkbVar.setAnimationProgress(f);
                wkbVar.invalidate();
                return;
            case 17:
                xkb xkbVar = (xkb) obj;
                xkb.a(xkbVar, f);
                xkbVar.invalidate();
                return;
            case 18:
                ulb ulbVar = (ulb) obj;
                ulb.a(ulbVar, f);
                ulbVar.invalidate();
                return;
            default:
                ((xbc) obj).I0(f);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((rm) obj).e);
            case 1:
                return Float.valueOf(((ImageReceiver) obj).i1);
            case 2:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 3:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 4:
                return Float.valueOf(((of3) obj).getClipProgress());
            case 5:
                return Float.valueOf(((z11) obj).inOutOffset);
            case 6:
                return Float.valueOf(zu1.Ad);
            case 7:
                return Float.valueOf(((wb2) obj).getTimeAlpha());
            case 8:
                return Float.valueOf(((n47) obj).d);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((hr8) obj).T);
            case 11:
                return Float.valueOf(((i19) obj).H);
            case 12:
                return Float.valueOf(((i19) obj).I);
            case 13:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 14:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            case 15:
                return Float.valueOf(((ey9) obj).a);
            case 16:
                return Float.valueOf(((wkb) obj).s);
            case 17:
                return Float.valueOf(((xkb) obj).h);
            case 18:
                return Float.valueOf(((ulb) obj).f);
            default:
                return Float.valueOf(((xbc) obj).y1);
        }
    }
}
