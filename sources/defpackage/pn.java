package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class pn extends ro {
    public final byte b;

    public pn(String str, byte b) {
        super(str, (byte) 0);
        this.b = b;
    }

    @Override
    public final void c(Object obj, float f) {
        wz8 wz8Var;
        double sqrt;
        boolean z;
        boolean z2;
        float f2;
        lka lkaVar;
        lka lkaVar2;
        switch (this.b) {
            case 0:
                qn qnVar = (qn) obj;
                if (qnVar.e != f) {
                    qnVar.e = f;
                    qnVar.g.invalidate();
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
                ((hg3) obj).setClipProgress(f);
                return;
            case 5:
                ((y21) obj).setInOutOffset(f);
                return;
            case 6:
                yv1.xd = (int) f;
                return;
            case 7:
                ((rc2) obj).setTimeAlpha(f);
                return;
            case 8:
                ((g47) obj).d = f;
                return;
            case 9:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f);
                return;
            case 10:
                ((xp8) obj).setCrossfadeProgress(f);
                return;
            case 11:
                wz8 wz8Var2 = (wz8) obj;
                wz8Var2.H = f;
                RectF rectF = wz8Var2.w;
                RectF rectF2 = wz8Var2.s;
                float interpolation = 1.0f - vz8.p.getInterpolation(f);
                float interpolation2 = (vz8.h.getInterpolation(wz8Var2.H) - vz8.i.getInterpolation(wz8Var2.H)) * gm.L(13.0f);
                RectF rectF3 = wz8Var2.n;
                RectF rectF4 = wz8Var2.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g = wz8.g(rectF3.height(), (gm.L(2.0f) * interpolation) + gm.L(56), vz8.l.getInterpolation(wz8Var2.H)) / 2.0f;
                uz8 uz8Var = vz8.m;
                float g2 = wz8.g(rectF3.width(), (gm.L(10.0f) * interpolation) + wz8Var2.h(), uz8Var.getInterpolation(wz8Var2.H));
                float f3 = g * 2.0f;
                float max = Math.max(g2, f3);
                float interpolation3 = (uz8Var.getInterpolation(wz8Var2.H) * Math.min(gm.L(-12.0f) + wz8Var2.G, (max - Math.max(rectF3.width(), f3)) / 2.0f)) + rectF4.centerX() + g;
                float interpolation4 = ((rectF4.bottom - g) - 1.0f) - (vz8.n.getInterpolation(wz8Var2.H) * ((gm.L(6.0f) * interpolation) + gm.L(38.0f)));
                RectF rectF5 = wz8Var2.r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g;
                if (wz8Var2.R && !wz8Var2.N) {
                    float g3 = wz8.g(gm.L(5.0f), gm.L(3.0f), vz8.o.getInterpolation(wz8Var2.H));
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
                        PointF f6 = wz8.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g3, true);
                        if (f6 != null) {
                            centerX = f6.x;
                            f4 = f6.y;
                        } else {
                            wz8Var2.R = false;
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
                        PointF f8 = wz8.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g3, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g3, false);
                        if (f8 != null) {
                            centerX2 = f8.x;
                            f7 = f8.y;
                        } else {
                            wz8Var2.R = false;
                        }
                    }
                    rectF.set(centerX2 - g3, f7 - g3, centerX2 + g3, f7 + g3);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && wz8Var2.R) {
                        wz8Var2.R = false;
                    }
                    if (wz8Var2.R) {
                        Path path = wz8Var2.e;
                        path.reset();
                        float b = wz8.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b2 = wz8.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        wz8Var = wz8Var2;
                        wz8Var.a(path, rectF3, b, b2, false, false);
                        float f9 = -90.0f;
                        if (z) {
                            f2 = wz8.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f2 = -90.0f;
                        }
                        float j = wz8.j(b2);
                        float f10 = f2;
                        wz8Var.a(path, rectF2, j, f10, true, true);
                        if (!z) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = wz8.c0;
                        float f11 = rectF5.left;
                        rectF6.set(f11, rectF5.top, rectF5.height() + f11, rectF5.bottom);
                        wz8Var.a(path, rectF6, wz8.j(f10), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z2) {
                            f9 = wz8.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        wz8Var.a(path, rectF6, -90.0f, wz8.j(f9), false, false);
                        if (!z2) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        wz8Var.a(path, rectF, f9, wz8.j(b), true, true);
                        path.close();
                        wz8Var.invalidateSelf();
                        return;
                    }
                }
                wz8Var = wz8Var2;
                wz8Var.invalidateSelf();
                return;
            case 12:
                wz8 wz8Var3 = (wz8) obj;
                wz8Var3.I = f;
                wz8Var3.invalidateSelf();
                return;
            case 13:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f);
                return;
            case 14:
                ((SecretMediaViewer) obj).setAnimationValue(f);
                return;
            case 15:
                mw9 mw9Var = (mw9) obj;
                if (mw9Var.a != f) {
                    mw9Var.a = f;
                    SecretMediaViewer secretMediaViewer = mw9Var.r;
                    secretMediaViewer.R.setAlpha(f);
                    if (mw9Var.b) {
                        secretMediaViewer.R.setPivotX(lkaVar.getWidth());
                        secretMediaViewer.R.setPivotY(lkaVar2.getHeight());
                        float f12 = 1.0f - f;
                        float f13 = 1.0f - (0.1f * f12);
                        secretMediaViewer.R.setScaleX(f13);
                        secretMediaViewer.R.setScaleY(f13);
                        vdc vdcVar = secretMediaViewer.P;
                        if (vdcVar.y != f12) {
                            vdcVar.y = f12;
                            vdcVar.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (mw9Var.c) {
                        mw9Var.setTranslationY((1.0f - f) * gm.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f);
                    return;
                }
                return;
            case 16:
                bjb bjbVar = (bjb) obj;
                bjbVar.setAnimationProgress(f);
                bjbVar.invalidate();
                return;
            case 17:
                cjb cjbVar = (cjb) obj;
                cjb.a(cjbVar, f);
                cjbVar.invalidate();
                return;
            case 18:
                akb akbVar = (akb) obj;
                akb.a(akbVar, f);
                akbVar.invalidate();
                return;
            default:
                ((y9c) obj).H0(f);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((qn) obj).e);
            case 1:
                return Float.valueOf(((ImageReceiver) obj).i1);
            case 2:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 3:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 4:
                return Float.valueOf(((hg3) obj).getClipProgress());
            case 5:
                return Float.valueOf(((y21) obj).inOutOffset);
            case 6:
                return Float.valueOf(yv1.xd);
            case 7:
                return Float.valueOf(((rc2) obj).getTimeAlpha());
            case 8:
                return Float.valueOf(((g47) obj).d);
            case 9:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            case 10:
                return Float.valueOf(((xp8) obj).T);
            case 11:
                return Float.valueOf(((wz8) obj).H);
            case 12:
                return Float.valueOf(((wz8) obj).I);
            case 13:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 14:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            case 15:
                return Float.valueOf(((mw9) obj).a);
            case 16:
                return Float.valueOf(((bjb) obj).s);
            case 17:
                return Float.valueOf(((cjb) obj).h);
            case 18:
                return Float.valueOf(((akb) obj).f);
            default:
                return Float.valueOf(((y9c) obj).y1);
        }
    }
}
