package ch;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.s51;
import org.telegram.ui.PhotoViewer;
public final class g extends l6 {
    public final int f2454b;

    public g(String str, int i9) {
        super(str, 0);
        this.f2454b = i9;
    }

    @Override
    public final void b(Object obj, float f10) {
        double sqrt;
        boolean z10;
        boolean z11;
        float f11;
        switch (this.f2454b) {
            case 0:
                j jVar = (j) obj;
                jVar.C = f10;
                RectF rectF = jVar.v;
                RectF rectF2 = jVar.f2484s;
                float interpolation = 1.0f - h.f2468p.getInterpolation(f10);
                float interpolation2 = (h.h.getInterpolation(jVar.C) - h.f2461i.getInterpolation(jVar.C)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = jVar.f2482n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = j.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(i.f2474b), h.f2464l.getInterpolation(jVar.C)) / 2.0f;
                e eVar = h.f2465m;
                float g11 = j.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + jVar.h(), eVar.getInterpolation(jVar.C));
                float f12 = g10 * 2.0f;
                float max = Math.max(g11, f12);
                float interpolation3 = (eVar.getInterpolation(jVar.C) * Math.min(AndroidUtilities.dp(-12.0f) + jVar.B, (max - Math.max(rectF3.width(), f12)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (h.f2466n.getInterpolation(jVar.C) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = jVar.f2483r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (jVar.M && !jVar.I) {
                    float g12 = j.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), h.f2467o.getInterpolation(jVar.C));
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f15 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f15 != null) {
                            centerX = f15.x;
                            f13 = f15.y;
                        } else {
                            jVar.M = false;
                        }
                    }
                    rectF2.set(centerX - g12, f13 - g12, centerX + g12, f13 + g12);
                    float f16 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f14;
                    if (centerX2 > rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f17 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f17 != null) {
                            centerX2 = f17.x;
                            f16 = f17.y;
                        } else {
                            jVar.M = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f16 - g12, centerX2 + g12, f16 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.M) {
                        jVar.M = false;
                    }
                    if (jVar.M) {
                        Path path = jVar.f2480e;
                        path.reset();
                        float b10 = j.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = j.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        jVar.a(path, rectF3, b10, b11, false, false);
                        float f18 = -90.0f;
                        if (z10) {
                            f11 = j.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f11 = -90.0f;
                        }
                        float j10 = j.j(b11);
                        float f19 = f11;
                        jVar.a(path, rectF2, j10, f19, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = j.X;
                        float f20 = rectF5.left;
                        rectF6.set(f20, rectF5.top, rectF5.height() + f20, rectF5.bottom);
                        jVar.a(path, rectF6, j.j(f19), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f18 = j.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        jVar.a(path, rectF6, -90.0f, j.j(f18), false, false);
                        if (!z11) {
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
                jVar2.D = f10;
                jVar2.invalidateSelf();
                return;
            case 2:
                t8 t8Var = (t8) obj;
                t8Var.setAnimationProgress(f10);
                t8Var.invalidate();
                return;
            case 3:
                u8 u8Var = (u8) obj;
                u8.a(u8Var, f10);
                u8Var.invalidate();
                return;
            case 4:
                d9 d9Var = (d9) obj;
                d9.a(d9Var, f10);
                d9Var.invalidate();
                return;
            case 5:
                b6 b6Var = (b6) obj;
                if (b6Var.f27049e != f10) {
                    b6Var.f27049e = f10;
                    b6Var.f27051g.invalidate();
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
                ((r2) obj).setClipProgress(f10);
                return;
            case 10:
                ((lb) obj).setInOutOffset(f10);
                return;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                return;
            default:
                ((s51) obj).G(f10);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f2454b) {
            case 0:
                return Float.valueOf(((j) obj).C);
            case 1:
                return Float.valueOf(((j) obj).D);
            case 2:
                return Float.valueOf(((t8) obj).f25715s);
            case 3:
                return Float.valueOf(((u8) obj).h);
            case 4:
                return Float.valueOf(((d9) obj).f24244f);
            case 5:
                return Float.valueOf(((b6) obj).f27049e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((r2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((lb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((s51) obj).A);
        }
    }
}
