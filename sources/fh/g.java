package fh;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.rb;
import org.telegram.ui.PhotoViewer;
public final class g extends q6 {
    public final int f6793b;

    public g(String str, int i10) {
        super(str, 0);
        this.f6793b = i10;
    }

    @Override
    public final void b(Object obj, float f9) {
        double sqrt;
        boolean z10;
        boolean z11;
        float f10;
        switch (this.f6793b) {
            case 0:
                j jVar = (j) obj;
                jVar.C = f9;
                RectF rectF = jVar.v;
                RectF rectF2 = jVar.f6823s;
                float interpolation = 1.0f - h.f6807p.getInterpolation(f9);
                float interpolation2 = (h.h.getInterpolation(jVar.C) - h.f6800i.getInterpolation(jVar.C)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = jVar.f6821n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float g10 = j.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(i.f6813b), h.f6803l.getInterpolation(jVar.C)) / 2.0f;
                e eVar = h.f6804m;
                float g11 = j.g(rectF3.width(), (AndroidUtilities.dp(10.0f) * interpolation) + jVar.h(), eVar.getInterpolation(jVar.C));
                float f11 = g10 * 2.0f;
                float max = Math.max(g11, f11);
                float interpolation3 = (eVar.getInterpolation(jVar.C) * Math.min(AndroidUtilities.dp(-12.0f) + jVar.B, (max - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + g10;
                float interpolation4 = ((rectF4.bottom - g10) - 1.0f) - (h.f6805n.getInterpolation(jVar.C) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = jVar.f6822r;
                rectF5.left = interpolation3 - max;
                rectF5.top = interpolation4 - g10;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + g10;
                if (jVar.M && !jVar.I) {
                    float g12 = j.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), h.f6806o.getInterpolation(jVar.C));
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
                            jVar.M = false;
                        }
                    }
                    rectF2.set(centerX - g12, f12 - g12, centerX + g12, f12 + g12);
                    float f15 = rectF5.bottom + g12;
                    float centerX2 = rectF3.centerX() + f13;
                    if (centerX2 > rectF5.right - (rectF5.height() / 2.0f)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        PointF f16 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + g12, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + g12, false);
                        if (f16 != null) {
                            centerX2 = f16.x;
                            f15 = f16.y;
                        } else {
                            jVar.M = false;
                        }
                    }
                    rectF.set(centerX2 - g12, f15 - g12, centerX2 + g12, f15 + g12);
                    float abs2 = Math.abs(rectF2.centerX() - rectF.centerX());
                    float abs3 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((abs3 * abs3) + (abs2 * abs2)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.M) {
                        jVar.M = false;
                    }
                    if (jVar.M) {
                        Path path = jVar.f6819e;
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
                        RectF rectF6 = j.X;
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
                jVar2.D = f9;
                jVar2.invalidateSelf();
                return;
            case 2:
                q8 q8Var = (q8) obj;
                q8Var.setAnimationProgress(f9);
                q8Var.invalidate();
                return;
            case 3:
                r8 r8Var = (r8) obj;
                r8.a(r8Var, f9);
                r8Var.invalidate();
                return;
            case 4:
                a9 a9Var = (a9) obj;
                a9.a(a9Var, f9);
                a9Var.invalidate();
                return;
            case 5:
                g6 g6Var = (g6) obj;
                if (g6Var.f28765e != f9) {
                    g6Var.f28765e = f9;
                    g6Var.f28767g.invalidate();
                    return;
                }
                return;
            case 6:
                ((ImageReceiver) obj).setCurrentAlpha(f9);
                return;
            case 7:
                ((ClippingImageView) obj).setAnimationProgress(f9);
                return;
            case 8:
                ((PhotoViewer) obj).setAnimationValue(f9);
                return;
            case 9:
                ((p2) obj).setClipProgress(f9);
                return;
            case 10:
                ((rb) obj).setInOutOffset(f9);
                return;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f9);
                return;
            default:
                ((f61) obj).G(f9);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f6793b) {
            case 0:
                return Float.valueOf(((j) obj).C);
            case 1:
                return Float.valueOf(((j) obj).D);
            case 2:
                return Float.valueOf(((q8) obj).f25087s);
            case 3:
                return Float.valueOf(((r8) obj).h);
            case 4:
                return Float.valueOf(((a9) obj).f24098f);
            case 5:
                return Float.valueOf(((g6) obj).f28765e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((p2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((rb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((f61) obj).A);
        }
    }
}
