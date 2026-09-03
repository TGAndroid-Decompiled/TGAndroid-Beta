package hh;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.q61;
import org.telegram.ui.PhotoViewer;
public final class g extends m6 {
    public final int f7118b;

    public g(String str, int i10) {
        super(str, 0);
        this.f7118b = i10;
    }

    @Override
    public final void b(Object obj, float f10) {
        double sqrt;
        boolean z4;
        boolean z10;
        float f11;
        switch (this.f7118b) {
            case 0:
                j jVar = (j) obj;
                jVar.D = f10;
                RectF rectF = jVar.v;
                RectF rectF2 = jVar.f7147s;
                float interpolation = 1.0f - h.f7131p.getInterpolation(f10);
                float interpolation2 = (h.h.getInterpolation(jVar.D) - h.f7124i.getInterpolation(jVar.D)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = jVar.f7145n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = j.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(i.f7137b), h.f7127l.getInterpolation(jVar.D)) / 2.0f;
                e eVar = h.f7128m;
                float g11 = j.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + jVar.h(), eVar.getInterpolation(jVar.D));
                float f12 = g10 * 2.0f;
                float max = Math.max(g11, f12);
                float interpolation3 = (eVar.getInterpolation(jVar.D) * Math.min(AndroidUtilities.dp(-12.0f) + jVar.C, (max - Math.max(rectF3.width(), f12)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (h.f7129n.getInterpolation(jVar.D) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = jVar.f7146r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (jVar.N && !jVar.J) {
                    float g12 = j.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), h.f7130o.getInterpolation(jVar.D));
                    float f13 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f13 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f14 = (float) sqrt;
                    float centerX = rectF3.centerX() - f14;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        PointF f15 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f15 != null) {
                            centerX = f15.x;
                            f13 = f15.y;
                        } else {
                            jVar.N = false;
                        }
                    }
                    rectF2.set(centerX - g12, f13 - g12, centerX + g12, f13 + g12);
                    float f16 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f14;
                    if (centerX2 > rectF5.right - (rectF5.height() / 2.0f)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f17 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f17 != null) {
                            centerX2 = f17.x;
                            f16 = f17.y;
                        } else {
                            jVar.N = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f16 - g12, centerX2 + g12, f16 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.N) {
                        jVar.N = false;
                    }
                    if (jVar.N) {
                        Path path = jVar.e;
                        path.reset();
                        float b10 = j.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = j.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        jVar.a(path, rectF3, b10, b11, false, false);
                        float f18 = -90.0f;
                        if (z4) {
                            f11 = j.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f11 = -90.0f;
                        }
                        float j10 = j.j(b11);
                        float f19 = f11;
                        jVar.a(path, rectF2, j10, f19, true, true);
                        if (!z4) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = j.Y;
                        float f20 = rectF5.left;
                        rectF6.set(f20, rectF5.top, rectF5.height() + f20, rectF5.bottom);
                        jVar.a(path, rectF6, j.j(f19), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z10) {
                            f18 = j.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        jVar.a(path, rectF6, -90.0f, j.j(f18), false, false);
                        if (!z10) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        jVar.a(path, rectF, f18, j.j(b10), true, true);
                        path.close();
                    }
                }
                jVar.invalidateSelf();
                return;
            case 1:
                j jVar2 = (j) obj;
                jVar2.E = f10;
                jVar2.invalidateSelf();
                return;
            case 2:
                r8 r8Var = (r8) obj;
                r8Var.setAnimationProgress(f10);
                r8Var.invalidate();
                return;
            case 3:
                s8 s8Var = (s8) obj;
                s8.a(s8Var, f10);
                s8Var.invalidate();
                return;
            case 4:
                b9 b9Var = (b9) obj;
                b9.a(b9Var, f10);
                b9Var.invalidate();
                return;
            case 5:
                c6 c6Var = (c6) obj;
                if (c6Var.e != f10) {
                    c6Var.e = f10;
                    c6Var.f23827g.invalidate();
                    return;
                }
                return;
            case 6:
                ((ImageReceiver) obj).setCurrentAlpha(f10);
                return;
            case 7:
                ((ClippingImageView) obj).setAnimationProgress(f10);
                return;
            case 8:
                ((PhotoViewer) obj).setAnimationValue(f10);
                return;
            case 9:
                ((q2) obj).setClipProgress(f10);
                return;
            case 10:
                ((nb) obj).setInOutOffset(f10);
                return;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                return;
            default:
                ((q61) obj).G(f10);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f7118b) {
            case 0:
                return Float.valueOf(((j) obj).D);
            case 1:
                return Float.valueOf(((j) obj).E);
            case 2:
                return Float.valueOf(((r8) obj).f21889s);
            case 3:
                return Float.valueOf(((s8) obj).h);
            case 4:
                return Float.valueOf(((b9) obj).f20859f);
            case 5:
                return Float.valueOf(((c6) obj).e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((q2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((nb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((q61) obj).B);
        }
    }
}
