package mh;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.x5;
import org.telegram.ui.PhotoViewer;
public final class g extends h6 {
    public final int f13333b;

    public g(String str, int i10) {
        super(str, 0);
        this.f13333b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        double sqrt;
        boolean z10;
        float f10;
        switch (this.f13333b) {
            case 0:
                j jVar = (j) obj;
                jVar.G = f7;
                RectF rectF = jVar.f13366w;
                RectF rectF2 = jVar.f13365s;
                float interpolation = 1.0f - h.f13346p.getInterpolation(f7);
                float interpolation2 = (h.h.getInterpolation(jVar.G) - h.f13339i.getInterpolation(jVar.G)) * i0.L(13.0f);
                RectF rectF3 = jVar.f13363n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = j.g(rectF3.height(), (i0.L(2.0f) * interpolation) + i0.L(i.f13352b), h.f13342l.getInterpolation(jVar.G)) / 2.0f;
                e eVar = h.f13343m;
                float g11 = j.g(rectF3.width(), (i0.L(10.0f) * interpolation) + jVar.h(), eVar.getInterpolation(jVar.G));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (eVar.getInterpolation(jVar.G) * Math.min(i0.L(-12.0f) + jVar.F, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (h.f13344n.getInterpolation(jVar.G) * ((i0.L(6.0f) * interpolation) + i0.L(38.0f)));
                RectF rectF5 = jVar.f13364r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (jVar.Q && !jVar.M) {
                    float g12 = j.g(i0.L(5.0f), i0.L(3.0f), h.f13345o.getInterpolation(jVar.G));
                    float f12 = rectF5.bottom + g12;
                    double width = (rectF3.width() / 2.0f) + g12;
                    double abs = Math.abs(f12 - rectF3.centerY());
                    if (width <= abs) {
                        sqrt = 0.0d;
                    } else {
                        sqrt = Math.sqrt((width * width) - (abs * abs));
                    }
                    float f13 = (float) sqrt;
                    float centerX = rectF3.centerX() - f13;
                    boolean z11 = true;
                    if (centerX < (rectF5.height() / 2.0f) + rectF5.left) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PointF f14 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + g12, true);
                        if (f14 != null) {
                            centerX = f14.x;
                            f12 = f14.y;
                        } else {
                            jVar.Q = false;
                        }
                    }
                    rectF2.set(centerX - g12, f12 - g12, centerX + g12, f12 + g12);
                    float f15 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f13;
                    if (centerX2 <= rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f16 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f16 != null) {
                            centerX2 = f16.x;
                            f15 = f16.y;
                        } else {
                            jVar.Q = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f15 - g12, centerX2 + g12, f15 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.Q) {
                        jVar.Q = false;
                    }
                    if (jVar.Q) {
                        Path path = jVar.e;
                        path.reset();
                        float b10 = j.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float b11 = j.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        jVar.a(path, rectF3, b10, b11, false, false);
                        float f17 = -90.0f;
                        if (z10) {
                            f10 = j.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            f10 = -90.0f;
                        }
                        float j10 = j.j(b11);
                        float f18 = f10;
                        jVar.a(path, rectF2, j10, f18, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = j.f13353b0;
                        float f19 = rectF5.left;
                        rectF6.set(f19, rectF5.top, rectF5.height() + f19, rectF5.bottom);
                        jVar.a(path, rectF6, j.j(f18), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        if (z11) {
                            f17 = j.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY());
                        }
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        jVar.a(path, rectF6, -90.0f, j.j(f17), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        jVar.a(path, rectF, f17, j.j(b10), true, true);
                        path.close();
                    }
                }
                jVar.invalidateSelf();
                return;
            case 1:
                j jVar2 = (j) obj;
                jVar2.H = f7;
                jVar2.invalidateSelf();
                return;
            case 2:
                t8 t8Var = (t8) obj;
                t8Var.setAnimationProgress(f7);
                t8Var.invalidate();
                return;
            case 3:
                u8 u8Var = (u8) obj;
                u8.a(u8Var, f7);
                u8Var.invalidate();
                return;
            case 4:
                d9 d9Var = (d9) obj;
                d9.a(d9Var, f7);
                d9Var.invalidate();
                return;
            case 5:
                x5 x5Var = (x5) obj;
                if (x5Var.e != f7) {
                    x5Var.e = f7;
                    x5Var.f32355g.invalidate();
                    return;
                }
                return;
            case 6:
                ((ImageReceiver) obj).f14384h1 = f7;
                return;
            case 7:
                ((ClippingImageView) obj).setAnimationProgress(f7);
                return;
            case 8:
                ((PhotoViewer) obj).setAnimationValue(f7);
                return;
            case 9:
                ((v2) obj).setClipProgress(f7);
                return;
            case 10:
                ((bb) obj).setInOutOffset(f7);
                return;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f7);
                return;
            default:
                ((e61) obj).M0(f7);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f13333b) {
            case 0:
                return Float.valueOf(((j) obj).G);
            case 1:
                return Float.valueOf(((j) obj).H);
            case 2:
                return Float.valueOf(((t8) obj).f23105s);
            case 3:
                return Float.valueOf(((u8) obj).h);
            case 4:
                return Float.valueOf(((d9) obj).f21831f);
            case 5:
                return Float.valueOf(((x5) obj).e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).f14384h1);
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((v2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((bb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((e61) obj).f25729v1);
        }
    }
}
