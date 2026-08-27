package dh;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.PhotoViewer;

public final class g extends l6 {

    public final int f4998b;

    public g(String str, int i10) {
        super(str, 0);
        this.f4998b = i10;
    }

    @Override
    public final void c(Object obj, float f10) {
        float fB;
        switch (this.f4998b) {
            case 0:
                j jVar = (j) obj;
                jVar.C = f10;
                RectF rectF = jVar.v;
                RectF rectF2 = jVar.f5028s;
                float interpolation = 1.0f - h.f5012p.getInterpolation(f10);
                float interpolation2 = (h.h.getInterpolation(jVar.C) - h.f5005i.getInterpolation(jVar.C)) * AndroidUtilities.dp(13.0f);
                RectF rectF3 = jVar.f5026n;
                RectF rectF4 = jVar.h;
                rectF3.set(rectF4);
                rectF3.offset(0.0f, -interpolation2);
                float fG = j.g(rectF3.height(), (AndroidUtilities.dp(2.0f) * interpolation) + AndroidUtilities.dp(i.f5018b), h.f5008l.getInterpolation(jVar.C)) / 2.0f;
                float fWidth = rectF3.width();
                float fDp = (AndroidUtilities.dp(10.0f) * interpolation) + jVar.h();
                e eVar = h.f5009m;
                float fG2 = j.g(fWidth, fDp, eVar.getInterpolation(jVar.C));
                float f11 = fG * 2.0f;
                float fMax = Math.max(fG2, f11);
                float interpolation3 = (eVar.getInterpolation(jVar.C) * Math.min(AndroidUtilities.dp(-12.0f) + jVar.B, (fMax - Math.max(rectF3.width(), f11)) / 2.0f)) + rectF4.centerX() + fG;
                float interpolation4 = ((rectF4.bottom - fG) - 1.0f) - (h.f5010n.getInterpolation(jVar.C) * ((AndroidUtilities.dp(6.0f) * interpolation) + AndroidUtilities.dp(38.0f)));
                RectF rectF5 = jVar.f5027r;
                rectF5.left = interpolation3 - fMax;
                rectF5.top = interpolation4 - fG;
                rectF5.right = interpolation3;
                rectF5.bottom = interpolation4 + fG;
                if (jVar.M && !jVar.I) {
                    float fG3 = j.g(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), h.f5011o.getInterpolation(jVar.C));
                    float f12 = rectF5.bottom + fG3;
                    double dWidth = (rectF3.width() / 2.0f) + fG3;
                    double dAbs = Math.abs(f12 - rectF3.centerY());
                    float fSqrt = (float) (dWidth <= dAbs ? 0.0d : Math.sqrt((dWidth * dWidth) - (dAbs * dAbs)));
                    float fCenterX = rectF3.centerX() - fSqrt;
                    boolean z10 = fCenterX < (rectF5.height() / 2.0f) + rectF5.left;
                    if (z10) {
                        PointF pointFF = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + fG3, (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY(), (rectF5.height() / 2.0f) + fG3, true);
                        if (pointFF != null) {
                            fCenterX = pointFF.x;
                            f12 = pointFF.y;
                        } else {
                            jVar.M = false;
                        }
                    }
                    rectF2.set(fCenterX - fG3, f12 - fG3, fCenterX + fG3, f12 + fG3);
                    float f13 = rectF5.bottom + fG3;
                    float fCenterX2 = rectF3.centerX() + fSqrt;
                    boolean z11 = fCenterX2 > rectF5.right - (rectF5.height() / 2.0f);
                    if (z11) {
                        PointF pointFF2 = j.f(rectF3.centerX(), rectF3.centerY(), (rectF3.height() / 2.0f) + fG3, rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY(), (rectF5.height() / 2.0f) + fG3, false);
                        if (pointFF2 != null) {
                            fCenterX2 = pointFF2.x;
                            f13 = pointFF2.y;
                        } else {
                            jVar.M = false;
                        }
                    }
                    rectF.set(fCenterX2 - fG3, f13 - fG3, fCenterX2 + fG3, f13 + fG3);
                    float fAbs = Math.abs(rectF2.centerX() - rectF.centerX());
                    float fAbs2 = Math.abs(rectF2.centerY() - rectF.centerY());
                    if (Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs)) <= (rectF.width() + rectF2.width()) / 2.0f && jVar.M) {
                        jVar.M = false;
                    }
                    if (jVar.M) {
                        Path path = jVar.f5024e;
                        path.reset();
                        float fB2 = j.b(rectF3.centerX(), rectF3.centerY(), rectF.centerX(), rectF.centerY());
                        float fB3 = j.b(rectF3.centerX(), rectF3.centerY(), rectF2.centerX(), rectF2.centerY());
                        jVar.a(path, rectF3, fB2, fB3, false, false);
                        if (z10) {
                            fB = j.b(rectF2.centerX(), rectF2.centerY(), (rectF5.height() / 2.0f) + rectF5.left, rectF5.centerY());
                        } else {
                            fB = -90.0f;
                        }
                        float fJ = j.j(fB3);
                        float f14 = fB;
                        jVar.a(path, rectF2, fJ, f14, true, true);
                        if (!z10) {
                            path.lineTo((rectF5.height() / 2.0f) + rectF5.left, rectF5.bottom);
                        }
                        RectF rectF6 = j.X;
                        float f15 = rectF5.left;
                        rectF6.set(f15, rectF5.top, rectF5.height() + f15, rectF5.bottom);
                        jVar.a(path, rectF6, j.j(f14), -90.0f, false, false);
                        path.lineTo(rectF5.right - (rectF5.height() / 2.0f), rectF5.top);
                        float fB4 = z11 ? j.b(rectF.centerX(), rectF.centerY(), rectF5.right - (rectF5.height() / 2.0f), rectF5.centerY()) : -90.0f;
                        rectF6.set(rectF5.right - rectF5.height(), rectF5.top, rectF5.right, rectF5.bottom);
                        jVar.a(path, rectF6, -90.0f, j.j(fB4), false, false);
                        if (!z11) {
                            path.lineTo(rectF.centerX(), rectF5.bottom);
                        }
                        jVar.a(path, rectF, fB4, j.j(fB2), true, true);
                        path.close();
                    }
                }
                jVar.invalidateSelf();
                break;
            case 1:
                j jVar2 = (j) obj;
                jVar2.D = f10;
                jVar2.invalidateSelf();
                break;
            case 2:
                p8 p8Var = (p8) obj;
                p8Var.setAnimationProgress(f10);
                p8Var.invalidate();
                break;
            case 3:
                q8 q8Var = (q8) obj;
                q8Var.setAnimationProgress(f10);
                q8Var.invalidate();
                break;
            case 4:
                z8 z8Var = (z8) obj;
                z8Var.setAnimationProgress(f10);
                z8Var.invalidate();
                break;
            case 5:
                b6 b6Var = (b6) obj;
                if (b6Var.f26950e != f10) {
                    b6Var.f26950e = f10;
                    b6Var.f26952g.invalidate();
                    break;
                }
                break;
            case 6:
                ((ImageReceiver) obj).setCurrentAlpha(f10);
                break;
            case 7:
                ((ClippingImageView) obj).setAnimationProgress(f10);
                break;
            case 8:
                ((PhotoViewer) obj).setAnimationValue(f10);
                break;
            case 9:
                ((p2) obj).setClipProgress(f10);
                break;
            case 10:
                ((jb) obj).setInOutOffset(f10);
                break;
            case 11:
                ((PollVotesAlert$UserCell) obj).setPlaceholderAlpha(f10);
                break;
            default:
                ((u51) obj).H(f10);
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f4998b) {
            case 0:
                return Float.valueOf(((j) obj).C);
            case 1:
                return Float.valueOf(((j) obj).D);
            case 2:
                return Float.valueOf(((p8) obj).f25007s);
            case 3:
                return Float.valueOf(((q8) obj).h);
            case 4:
                return Float.valueOf(((z8) obj).f26048f);
            case 5:
                return Float.valueOf(((b6) obj).f26950e);
            case 6:
                return Float.valueOf(((ImageReceiver) obj).getCurrentAlpha());
            case 7:
                return Float.valueOf(((ClippingImageView) obj).getAnimationProgress());
            case 8:
                return Float.valueOf(((PhotoViewer) obj).getAnimationValue());
            case 9:
                return Float.valueOf(((p2) obj).getClipProgress());
            case 10:
                return Float.valueOf(((jb) obj).inOutOffset);
            case 11:
                return Float.valueOf(((PollVotesAlert$UserCell) obj).getPlaceholderAlpha());
            default:
                return Float.valueOf(((u51) obj).A);
        }
    }
}
